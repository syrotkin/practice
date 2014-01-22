#include <stdio.h>

void swap(int* a, int* b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

// This function swaps changes what the string pointers point to.
// It cannot be called if strings are defined as character arrays
void swap_string(char** s1, char** s2) {
  char* temp = *s1;
  *s1 = *s2;
  *s2 = temp;
}


int main() {
  int a = 1, b = 2;
  swap(&a, &b);
  printf("a = %d, b = %d\n", a, b);

  char* s1 = "aaa"; // stored in a read-only area
  char* s2 = "bbb"; // stored in a read-only area
  swap_string(&s1, &s2);
  printf("s1 = %s, s2 = %s\n", s1, s2);

  return 0;
}
