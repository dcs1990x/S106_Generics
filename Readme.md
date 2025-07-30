# Sprint 1, Task 6: Generics
This repository implements the solution to the Java OOP exercises assigned in Sprint 2, focusing on generic methods and non-generic class behavior. The project demonstrates how generics improve flexibility and type safety in Java.

## 📁 Project Structure  
The code is organized by functionality, respecting the Single Responsibility Principle and best practices of clean object-oriented programming. Each class is placed in its appropriate package, grouped logically by exercise.

## 💻 Technologies Used
Java 21+  
IntelliJ IDEA (Recommended)  
No external libraries (pure Java)

## 📦 Exercises Overview

### Level 1, Exercise 1 – Non-Generic Class

Class: NoGenericMethods

Stores three objects of the same type.  
Provides constructor to initialize all three objects.  
Includes getter and setter methods for each element.  
Verifies that the arguments can be passed in any order during object construction.  

`NoGenericMethods obj = new NoGenericMethods("Apple", "Banana", "Cherry");`

This class simulates a case where no generics are used but type consistency is required manually.

### Level 2, Exercise 1 – Generic Method

Class: GenericMethods

Contains a single generic method:

`public static <T, U, V> void printAttributes(T param1, U param2, V param3)`  

The method accepts any types and prints them to the console.

Class: Person

Used as a sample class with:

`String name, surname;`  
`int age;`  

Demonstration in Main.java:

The printAttributes() method is invoked with different parameter types: two strings and a primitive type (int, double, etc.)  

Examples:

`Person person1 = new Person("Dani", "Caldito", 35);`  
`GenericMethods.printAttributes(person1, "nice to meet you", '.');` 

Output:

`My name is Dani Caldito and I'm 35 years old, nice to meet you.`

This demonstrates that the order and type of parameters can vary, and the method still works as expected.

## 💡 Concepts Demonstrated
✅ Generics in Java
Write methods that work with any type while maintaining type safety.

✅ Non-generic class limitations
A class limited to working with one specific type.

✅ Overloading and Flexibility
Shows that generic methods can accept multiple types and allow flexible ordering.

✅ Code Reusability and Clean Design
No duplicate logic required for each data type.

## 🛠️ How to Run
Clone the repository  
Open the project in IntelliJ IDEA  
Navigate to Main.java in the root main package  
Run the program and observe the console output  

## 👨‍💻 Author
Developed by Daniel Caldito Serrano as part of the Java Back-end Development Bootcamp at IT Academy.