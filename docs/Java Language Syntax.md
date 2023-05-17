<h1>Java Syntax Notes</h1>

```java
public static void main(String args[])
```

<p>Java program processing starts from the main() method which is a mandatory part of every Java program.</p>
<b>Case Sensitivity</b>
<p>java is case sensitive so two words with different cases are treated differently. The string <i>hello</i> is different from <i>Hello</i>.</p>
<b>Class Names</b>
<li>First letter should be an upper case</li>
<li>if multiple words are used to name the class name, the inner words first letter should be an upper case</li>

```java
public class Main {
}
```

```java
public class MainClass {
}
```

<b>Method Names</b>
<li>all methods start with lower case</li>
<li>if multiple words are used to name the method name, the inner words first letter should be an upper case</li>


```java
public static void main(String[] arg) {
}
```

```java
public static void mainMethod() {
}
```

<b>Program File Name</b>
<p>Name of the program file should exactly match the class name.

When saving the file, you should save it using the class name (Remember Java is case sensitive) and append '.java' to the end of the name (if the file name and the class name do not match, your program will not compile).

But please make a note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatory to have a public class in the file.</p>

```java
//Name of the file should be 'MyFirstJavaProgram.java'
public class MyFirstJavaProgram {
}
```

<h2>Java Identifiers</h2>
<p>All Java components require names. Names used for classes, variables, and methods are called identifiers.

In Java, there are several points to remember about identifiers. They are as follows −

<li>All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).</li>
<li>After the first character, identifiers can have any combination of characters.</li>
<li>A key word cannot be used as an identifier.</li>
<li>Most importantly, identifiers are case sensitive.</li>
<li>Examples of legal identifiers: age, $salary, _value, __1_value.</li>
<li>Examples of illegal identifiers: 123abc, -salary.</li>
</p>

<h2>Java Modifiers</h2>
<li><b>Access Modifiers:</b> default, public , protected, private</li>
<li><b>Non-Access Modifiers:</b> final, abstract, strictfp</li>

<h2>Java Keywords</h2>
<p>All the following words are reserved in java and may not be used as a constant or variable or any other identifier names</p></br>
<b>abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while</b>
<h2>Comments</h2>
<p>Comments in java can be accived in two different ways either doing a single line comment vs a code block type of comments for a longer comment</p>

```java
/* this is my first java program
* with multiple line
* comment
*/
public static void main(String[] arg) {
// This is an example of a single linke comment.
}
```
