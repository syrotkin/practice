#include <stdio.h>
#include <stdlib.h>

// Recursive version
int bin_search_rec(int array[], int x, int lo, int hi) {
  if (hi < lo) {
    return -1;
  }
  int mid = (lo + hi) / 2;
  if (array[mid] == x) {
    return mid;
  }
  else if (array[mid] < x) {
    return bin_search_rec(array, x, mid + 1, hi);
  }
  else {
    return bin_search_rec(array, x, lo, mid - 1);
  }
} 

// Iterative version
int bin_search_iter(int array[], int x, int lo, int hi) {
  while (lo <= hi) {
    int mid = (lo + hi) /2;
    if (array[mid] == x) {
      return mid;
    }
    else if (array[mid] < x) {
      lo =mid + 1;
    }
    else {
      hi = mid - 1;
    }
  }
  return -1;
}


int main() {
  
  int array[] = {5, 11, 13, 19, 25, 29, 32, 37, 40, 52, 63, 64, 70, 98};
  int array_length = sizeof(array) / sizeof(int);

  int numbers[] = {2, 5, 11, 70, 98, 100, 200, 19, 37, 20, 35, 64};
  int numbers_length = sizeof(numbers)/sizeof(int);
  
  for (int i = 0; i<numbers_length; ++i) {
    int loc = bin_search_rec(array, numbers[i], 0, array_length - 1);
    printf("%d: %d\n", numbers[i], loc);
  }


  return 0;
}
