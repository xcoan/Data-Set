# Data-Set
A simple java application that finds the total, maximum, minimum, range, and average of a set of user input data.

# Files:
* Data.java
A java API that requires an ArrayList of type Double.
Included Features:
  * `getSum()` - Returns the sum of values in the arrayList
  * `getAverage()` - Returns the average of all values in ArrayList. NOTE: the value returned is not rounded or truncated.
  * `getMinimum()` - Returns the lowest value of all values in ArrayList
  * `getMaximum()` - Returns the maximum value of all values in ArrayList
  * `SetList(ArrayList<Double> dataSet)` - Overrides the current ArrayList<Double> with new data
  * `getList()` - returns a copy of the dataSet
  * `getRange()` - returns the range of values in DataSet

* DataFactory.java
A java file that "automates" the data process. Requires user-input of all values that will go into the ArrayList<Double>.

* DataTest.java
A JUnit test of all methods found in Data.java

# How to Use
* Data.java
To use Data.java, simply include `Data.java` in the same directory as your project.
After that, declare a new instance of Data, `Data data = new Data(ArrayList<Data> dataSet);`
All methods can then be called using `data.`


# License
MIT
