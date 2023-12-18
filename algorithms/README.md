## Insertion Sort

### What's the `Insertion Sort` algorithm?

Insertion sort is a simple sorting algorithm that builds the final sorted array one element at a time.
It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
However, insertion sort has several advantages: it is simple to implement, efficient for small data
sets or lists that are mostly sorted, and it is an adaptive algorithm, meaning that it performs well
on data sets that are already partially ordered.

The time complexity for this algorithm is:
$$O(n^2)$$
The space complexity is:
$$O(1)$$

Insertion sort code:

- [Insertion sort - java](https://github.com/freddyvelarde/computer-science/blob/master/algorithms/java/src/InsertionSort.java)
- [Insertion sort - python](https://github.com/freddyvelarde/computer-science/blob/master/algorithms/python/insertion_sort.py)
- [Insertion sort - c++](https://github.com/freddyvelarde/computer-science/blob/master/algorithms/c%2B%2B/insertionSort.cpp)
- [Insertion sort - typescript](https://github.com/freddyvelarde/computer-science/blob/master/algorithms/typescript/src/insertionSort.ts)

### What's the `Merge Sort` algorithm?

Merge Sort is a popular and efficient sorting algorithm that follows the divide-and-conquer paradigm. It was designed by John von Neumann in 1945. The main idea behind Merge Sort is to divide the unsorted list into n sub-lists, each containing one element, and then repeatedly merge sub-lists to produce new sorted sub-lists until there is only one sub-list remaining, which is the sorted list.

The time complexity is:
$$O(n \log n)$$
The space complexity is:
$$O(n)$$

Merge Sort code:

- [Merge sort - java](https://github.com/freddyvelarde/computer-science/blob/master/algorithms/java/src/MergeSort.java)
