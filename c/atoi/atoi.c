#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int my_atoi(char* s) {
  int result = 0;
  int mult = 1;
  int len = strlen(s);
  // TODO: special case if 0 == len
  for (int i = len -1; i >= 0; --i) {
    int digit = s[i] - '0';
    if ((digit < 0 || digit > 9) && s[i] != '-') {
      printf("ERROR 1, string must contain numeric characters: %s\n", s);
      return -1;
    }

    if (s[i] == '-') {
      if (i == 0) {
	result *= -1;
      }
      else {
	// throw some kind of error
	printf("ERROR 2, string must contain numeric characters: %s\n", s);
	return -1;
      }
    }
    else {
      result += digit * mult; // DON'T FORGET THIS -'0' thing!!
      mult *= 10;
    }
  }
  return result;
}

int main() {

  char* strings[] = {"a", "ab013", "000234",  "0", "1", "123", "4321", "1000", "-3", "-25", "2-4"};
  int length = 11;

  for (int i = 0; i < length; ++i) {
    printf("%s: %d\n", strings[i], my_atoi(strings[i]));
  }

  return 0;
}
