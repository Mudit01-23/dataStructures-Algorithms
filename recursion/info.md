# Recursion 

## the difference between Linear and Binary search

we have 4 cases- 
1- Linear search without recursion
2- Linear search using recursion
3- Binary search without recursion
4- Binary search using recursion


the time complexity of using linear search either with our without recursion, will be 
O(n), but the space complexity of using linear search with recursion is O(n),(because every element involves a new recursive call in the worst case whereas the space complexity of using linear search without recursion is constant - O(1).

Similarly for binary search as well, so- 
| Algorithm       | Time Complexity (Without Recursion) | Time Complexity (With Recursion) | Space Complexity (Without Recursion) | Space Complexity (With Recursion) |
|------------------|-------------------------------------|-----------------------------------|---------------------------------------|------------------------------------|
| **Linear Search** | O(n)                               | O(n)                              | O(1)                                  | O(n)                              |
| **Binary Search** | O(log n)                           | O(log n)                          | O(1)                                  | O(log n)                          |