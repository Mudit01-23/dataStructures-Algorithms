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

Algo         Time complexity without recursion       Time complexity without recursion      Space complexity without recursion      Space complexity with recursion

Linear           O(n)                                            O(n)                               O(1)                                    O(n)
search 

Binary           O(logn)                                         O(logn)                            O(1)                                    O(logn)
Search