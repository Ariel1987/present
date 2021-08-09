# present

## General Info

This program implements a console program which meets the following requirements:

Implements a hierarchy of Sweets. 
All Sweets have next properties: 

- name, 
- weight (weight of the specific sweet in kilograms)
- sugarWeight (weight of sugar in this sweet in kilograms) 

Candy, Lollipop and Cookie are three other types from Sweet hierarchy. 


## Technologies

- Java language

## Setup

To run this program, the user must have a JDK 8 compiler instaled in his IDE. 
It can be installed following the steps in the [Open JDK Official Page](https://openjdk.java.net/install/). 
For a detailed step-by-step tutorial on how to use the JDK compiler with Java see [this article](https://docs.oracle.com/javame/config/cdc/cdc-opt-impl/ojmeec/1.1/developer/html/compiling.htm).

## Features

These are features that had to be implemented for this program according to the assignment:

Create class Present with the following behavior:

// the method filters sweets by sugar weight inclusively 
public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
	<write your code here>
}

// the method calculates total weight of the present
public double calculateTotalWeight() {
	<write your code here>
}

// the method that adds sweet to the present
public void addSweet(Sweet sweet) {
	<write your code here>
}

// the method returns copy of the Sweet[] array so that nobody could 
// modify state of the present without addSweet() method. 
// Also array shouldn’t contain null values.
public Sweet[] getSweets() {
	<write your code here>
}
