// version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
package com.endpoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodData {
  private int fdcId;
  private String description;
  private String publicationDate;
  private List<FoodNutrient> foodNutrients;
  private String dataType;
  private String foodClass;
  private String scientificName;
  private List<InputFoods> inputFoods;
  private List<Object> foodComponents;
  private List<Object> foodAttributes;
  private List<NutrientConversionFactor> nutrientConversionFactors;
  private int ndbNumber;
  private boolean isHistoricalReference;
  private FoodCategory foodCategory;

  // Add default constructor
  public FoodData() {}

  // Add getters for all fields
  public int getFdcId() { return fdcId; }
  public String getDescription() { return description; }
  public String getPublicationDate() { return publicationDate; }
  public List<FoodNutrient> getFoodNutrients() { return foodNutrients; }
  public String getDataType() { return dataType; }
  public String getFoodClass() { return foodClass; }
  public String getScientificName() { return scientificName; }
  public List<InputFoods> getInputFoods() { return inputFoods; }
  public List<Object> getFoodComponents() { return foodComponents; }
  public List<Object> getFoodAttributes() { return foodAttributes; }
  public List<NutrientConversionFactor> getNutrientConversionFactors() {
    return nutrientConversionFactors;
  }
  public int getNdbNumber() { return ndbNumber; }
  public boolean isHistoricalReference() { return isHistoricalReference; }
  public FoodCategory getFoodCategory() { return foodCategory; }
}
class FoodCategory {
  public int id;
  public String code;
  public String description;
  public int getId() { return id; }
  public String getCode() { return code; }
  public String getDescription() { return description; }
}

class FoodGroup {
  public int id;
  public String code;
  public String description;
  public int getId() { return id; }
  public String getCode() { return code; }
  public String getDescription() { return description; }
}

class FoodNutrient {
  public Nutrient nutrient;
  public String type;
  public FoodNutrientDerivation foodNutrientDerivation;
  public int id;
  public double amount;
  public int dataPoints;
  public double max;
  public double min;
  public double median;
  public int minYearAcquired;
  public ArrayList<NutrientAnalysisDetail> nutrientAnalysisDetails;
  public double loq;
  public Nutrient getNutrient() { return nutrient; }
  public String getType() { return type; }
  public FoodNutrientDerivation getFoodNutrientDerivation() {
    return foodNutrientDerivation;
  }
  public int getId() { return id; }
  public double getAmount() { return amount; }
  public int getDataPoints() { return dataPoints; }
  public double getMax() { return max; }
  public double getMin() { return min; }
  public double getMedian() { return median; }
  public int getMinYearAcquired() { return minYearAcquired; }
  public ArrayList<NutrientAnalysisDetail> getNutrientAnalysisDetails() {
    return nutrientAnalysisDetails;
  }
  public double getLoq() { return loq; }
}

class FoodNutrientDerivation {
  public int id;
  public String code;
  public String description;
  public FoodNutrientSource foodNutrientSource;
  public int getId() { return id; }
  public String getCode() { return code; }
  public String getDescription() { return description; }
  public FoodNutrientSource getFoodNutrientSource() {
    return foodNutrientSource;
  }
}

class FoodNutrientSource {
  public int id;
  public String code;
  public String description;
  public int getId() { return id; }
  public String getCode() { return code; }
  public String getDescription() { return description; }
}

class InputFoods {
  public int id;
  public String foodDescription;
  public InputFood inputFood;
  public InputFoods() {}
  public InputFoods(int id, String foodDescription, InputFood inputFood) {
    this.id = id;
    this.foodDescription = foodDescription;
    this.inputFood = inputFood;
  }
  public int getId() { return id; }
  public String getFoodDescription() { return foodDescription; }
  public InputFood getInputFood() { return inputFood; }
}

class InputFood {
  public int fdcId;
  public String description;
  public String publicationDate;
  public ArrayList<Object> foodAttributeTypes;
  public String foodClass;
  public int totalRefuse;
  public String dataType;
  public InputFood() {}
  public FoodGroup foodGroup;
  public InputFood(int fdcId, String description, String publicationDate,
                   ArrayList<Object> foodAttributeTypes, String foodClass,
                   int totalRefuse, String dataType, FoodGroup foodGroup) {
    this.fdcId = fdcId;
    this.description = description;
    this.publicationDate = publicationDate;
    this.foodAttributeTypes = foodAttributeTypes;
    this.foodClass = foodClass;
    this.totalRefuse = totalRefuse;
    this.dataType = dataType;
    this.foodGroup = foodGroup;
  }
  public int getFdcId() { return fdcId; }
  public String getDescription() { return description; }
  public String getPublicationDate() { return publicationDate; }
  public ArrayList<Object> getFoodAttributeTypes() {
    return foodAttributeTypes;
  }
  public String getFoodClass() { return foodClass; }
  public int getTotalRefuse() { return totalRefuse; }
  public String getDataType() { return dataType; }
  public FoodGroup getFoodGroup() { return foodGroup; }
}

class Nutrient {
  public int id;
  public String number;
  public String name;
  public int rank;
  public String unitName;
  public int getId() { return id; }
  public String getNumber() { return number; }
  public String getName() { return name; }
  public int getRank() { return rank; }
  public String getUnitName() { return unitName; }
}

class NutrientAcquisitionDetail {
  public int sampleUnitId;
  public String purchaseDate;
  public String storeCity;
  public String storeState;
  public String packerCity;
  public String packerState;
  public int getSampleUnitId() { return sampleUnitId; }
  public String getPurchaseDate() { return purchaseDate; }
  public String getStoreCity() { return storeCity; }
  public String getStoreState() { return storeState; }
  public String getPackerCity() { return packerCity; }
  public String getPackerState() { return packerState; }
}

class NutrientAnalysisDetail {
  public int subSampleId;
  public int nutrientId;
  public double amount;
  public String labMethodTechnique;
  public String labMethodDescription;
  public String labMethodOriginalDescription;
  public String labMethodLink;
  public ArrayList<NutrientAcquisitionDetail> nutrientAcquisitionDetails;
  public double loq;
  public int getSubSampleId() { return subSampleId; }
  public int getNutrientId() { return nutrientId; }
  public double getAmount() { return amount; }
  public String getLabMethodTechnique() { return labMethodTechnique; }
  public String getLabMethodDescription() { return labMethodDescription; }
  public String getLabMethodOriginalDescription() {
    return labMethodOriginalDescription;
  }
  public String getLabMethodLink() { return labMethodLink; }
  public ArrayList<NutrientAcquisitionDetail> getNutrientAcquisitionDetails() {
    return nutrientAcquisitionDetails;
  }
  public double getLoq() { return loq; }
}

class NutrientConversionFactor {
  public int id;
  public double proteinValue;
  public double fatValue;
  public double carbohydrateValue;
  public String type;
  public String name;
  public double value;
  public int getId() { return id; }
  public double getProteinValue() { return proteinValue; }
  public double getFatValue() { return fatValue; }
  public double getCarbohydrateValue() { return carbohydrateValue; }
  public String getType() { return type; }
  public String getName() { return name; }
  public double getValue() { return value; }
}
