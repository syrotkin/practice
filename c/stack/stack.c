#include <stdio.h>
#include <stdlib.h>

#define N 100

int stack[N];
int* top = stack;

void push(int c) {
  *top = c;
  ++top;
}

int is_empty() {
  return (top == stack);
}

int pop() {
  if (is_empty()) {
    fprintf(stderr, "empty!");
    exit(1);
  }
  int r = *(top-1);
  --top;
  return r;
}



void print() {
  int* begin = top - 1;
  while (begin >= stack) {
    printf("%d\n", *begin);
    --begin;
  }
}


int main() {
  push(1);
  push(2);
  push(3);
  print();
  int popped = pop();
  print();
  return 0;
}
