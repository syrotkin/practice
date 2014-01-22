#include <stdio.h>
#include <stdlib.h>

void test1() {
int const NUMBER = 20;
  
  printf("Enter name: \n");
  char a[NUMBER];
  scanf("%19s", a);
 
  printf("Enter last name:\n");
  char* b  = (char*)malloc(sizeof(char)*NUMBER);
  scanf("%19s", b);
 
  printf("a = %s\n", a);
  printf("b = %s\n", b);

  free(b);
}

void test2() {
}

int main() {
  printf("Testing stdout\n");
  char* a;
  a[0] = 'a';
  return 0;
}
