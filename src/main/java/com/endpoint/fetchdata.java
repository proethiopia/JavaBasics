package com.endpoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; //xssf.usermodel.XSSFWorkbook;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {
  public static void main(String[] args) {
    try {
      CloseableHttpClient httpClient = HttpClients.createDefault();
      HttpGet request = new HttpGet(
          "https://api.nal.usda.gov/fdc/v1/food/1750339?api_key=DEMO_KEY");

      CloseableHttpResponse response = httpClient.execute(request);
      if (response.getStatusLine().getStatusCode() == 200) {
        ObjectMapper objectMapper = new ObjectMapper();
        FoodData foodData = objectMapper.readValue(
            response.getEntity().getContent(), FoodData.class);

        // Create an Excel workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Food Data");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("FDC ID");
        headerRow.createCell(1).setCellValue("Description");
        headerRow.createCell(2).setCellValue("Publication Date");
        headerRow.createCell(3).setCellValue("Scientific Name");
        headerRow.createCell(4).setCellValue("Data Type");
        headerRow.createCell(5).setCellValue("Food Class");
        headerRow.createCell(6).setCellValue("Food Category");
        headerRow.createCell(7).setCellValue("NDB Number");
        headerRow.createCell(8).setCellValue("Is Historical Reference");
        headerRow.createCell(9).setCellValue("nut");
        // Add more headers for other fields if needed

        // Create data row
        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue(foodData.getFdcId());
        dataRow.createCell(1).setCellValue(foodData.getDescription());
        dataRow.createCell(2).setCellValue(foodData.getPublicationDate());
        dataRow.createCell(3).setCellValue(foodData.getScientificName());
        dataRow.createCell(4).setCellValue(foodData.getDataType());
        dataRow.createCell(5).setCellValue(foodData.getFoodClass());

        if (foodData.getFoodCategory() != null) {
          dataRow.createCell(6).setCellValue(
              foodData.getFoodCategory().getDescription());
        } else {
          dataRow.createCell(6).setCellValue("N/A"); // Handle null case
        }

        dataRow.createCell(7).setCellValue(foodData.getNdbNumber());
        dataRow.createCell(8).setCellValue(foodData.isHistoricalReference());
        dataRow.createCell(9).setCellValue(
            foodData.getFoodNutrients().get(2).nutrient.getName());

        // Save the workbook to a local file
        try (FileOutputStream fileOut =
                 new FileOutputStream("food_data.xlsx")) {
          workbook.write(fileOut);
        }

        System.out.println("Excel file saved successfully.");

        // Close resources
        httpClient.close();
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
