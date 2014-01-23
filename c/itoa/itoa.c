#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int number_of_digits(int input, int is_negative) {
  int length = 0;
  while (input != 0) {
    ++length;
    input = input / 10;
  }
  if (is_negative) {
    ++length;
  }
  return length;
}


char* my_itoa(int input) {
  int is_negative = 0;
  if (input < 0) {
    is_negative = 1;
    input = -1 * input; // Important! Otherwise we get last character incorrectly.
  }
  if (0 == input) {
    char* r1 = (char*)malloc(sizeof(char)*2);
    r1[0] = '0';
    r1[1] = '\0';
    return r1;
  }
  
  int length = number_of_digits(input, is_negative);
  char* result = (char*)malloc(sizeof(char)*(length + 1)); 
  result[length] = '\0';
  int i = length - 1;
  while (input != 0) {
    int last = input % 10;
    input = input / 10;
    result[i] = last + '0'; // Convert the digit to character representation
    --i;
  }
  if (is_negative) {
    result[i] = '-';
  }
  
  return result;
}



int main() {
  int input = 123;
  char* output = my_itoa(input);
  printf("%d: %s\n", input, output);
  free(output);
  
  int input = -546;
  char* output = my_itoa(input);
  printf("%d: %s\n", input, output);
  free(output);
 
  input = 0;
  output = my_itoa(input);
  printf("%d: %s\n", input, output);
  free(output);

  return 0;
}
