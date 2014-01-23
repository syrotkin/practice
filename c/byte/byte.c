#include <stdio.h>
#include <stdlib.h>

unsigned int count_bits(unsigned short input) {
  unsigned int sum = 0;
  unsigned short mask = 0x1;
  while (input != 0) {
    sum += input & mask;
    input >>= 1;
  }

  return sum;
}


int main() {

  unsigned short array[] = {0, 1, 2, 3, 4, 5, 6, 7};
  for (int i = 0; i < 8; ++i) {
    unsigned int count = count_bits(array[i]);
    printf("%d: %d\n", array[i], count);
  }
  return 0;
}
