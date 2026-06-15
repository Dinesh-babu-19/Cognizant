1. Understand Asymptotic Notation
What is Big O Notation?

Big O notation describes how the running time of an algorithm grows as the input size (n) increases.

It helps us:

Compare the efficiency of algorithms.
Predict performance for large datasets.
Choose the best algorithm for a problem.
Common Big O Complexities
Complexity	Name	Example
O(1)	Constant Time	Accessing an array element
O(log n)	Logarithmic Time	Binary Search
O(n)	Linear Time	Linear Search
O(n log n)	Linearithmic Time	Merge Sort
O(n²)	Quadratic Time	Bubble Sort
Best, Average, and Worst Cases
Linear Search

Searches each element one by one.

Best Case: Element found at the first position.
Time Complexity: O(1)
Average Case: Element found somewhere in the middle.
Time Complexity: O(n)
Worst Case: Element is last or not present.
Time Complexity: O(n)
Binary Search

Works only on sorted arrays.

Best Case: Element found at the middle.
Time Complexity: O(1)
Average Case: Element found after several divisions.
Time Complexity: O(log n)
Worst Case: Element not present.
Time Complexity: O(log n)

