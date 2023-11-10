# Problem Statement
[Question link](https://www.geeksforgeeks.org/problems/find-nk-th-node-in-linked-list/1?page=1&category=Linked%20List&sprint=ca8ae412173dbd8346c26a0295d098fd&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions)

## Problem Description

Given a singly linked list and a number `k`. Write a function to find the (`N/k`)th element, where `N` is the number of elements in the list. We need to consider the ceiling value in case of decimals.

## Input

The input consists of the following elements:

- An integer `T` (1 ≤ T ≤ 100), representing the number of test cases.
- For each test case, the first line of input contains an integer `N`, representing the number of elements in the linked list.
- The second line contains `N` space-separated integers, representing the data in the linked list.
- The last line contains an integer `k`.

## Output

For each test case, print the data value of the (`N/k`)th node in the linked list.

## Examples

### Example 1

#### Input
- `T = 2`
- Test case 1:
  - `N = 6`
  - Linked List Data: `1 2 3 4 5 6`
  - `k = 2`
- Test case 2:
  - `N = 5`
  - Linked List Data: `2 7 9 3 5`
  - `k = 3`

#### Output
- Test case 1: `3`
- Test case 2: `7`

#### Explanation
- Test case 1: The `6/2`-th element is the 3rd (1-based indexing) element, which is 3.
- Test case 2: The `5/3`-th element is the 2nd element. As mentioned in the question, we need to consider the ceiling value in case of decimals. So, the 2nd element is 7.

## User Task

The task is to complete the function `fractional_node()`, which should find the `n/k`-th node in the linked list and return its data value.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- k > 0

## Expected Complexity

- Expected Time Complexity: O(N) per test case
- Expected Auxiliary Space: O(1)
