// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

/** 
Solution 1: Bruteforce method - traverse through array with 2 pointer - check every pair of elements of array and see if 
their sum is equal to target - complexity will be O(n^2)

Solution 2: Two pass hash map
  Step 1: Build a hash map of elements and their indices
  Step 2: Loop thru the array and find the complement - if the complement is on the hash map and is not on the same index - 
    solution is found
  Step 3: Else return empty array - no value exists 

Solution 3: One pass hash map
  Step 1 : Loop thru the array
    Find the complement
    If the complement is present in the map - return the answer
    Else, add the complement and the index on the map
    

**/
