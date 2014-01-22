#include <stdio.h>

void ptr_to_const() {
  int i = 10;
  int j = 20;
  
  int const *p1 = &i;
  const int *p2 = &i;

  p1 = &j;
  p2 = &j;

  // NOT ALLOWED:
  //*p1 = j; // assignment of read-only location

  printf("i = %d, j = %d, *p1 = %d, *p2 = %d\n", i, j, *p1, *p2);
}

void const_ptr() {
  int i = 10;
  int j = 20;
  
  int *const ptr = &i;
  
  *ptr = j;

  // NOT ALLOWED:
  //ptr = &j; // assignment of read-only variable

  printf("*ptr = %d\n", *ptr);
}


void const_ptr_to_const() {
  const int i = 10;
  const int* const ptr = &i;
  
  printf("*ptr = %d\n", *ptr);
}

int main() {
  //ptr_to_const();
  //const_ptr();
  const_ptr_to_const();

  return 0;
}
