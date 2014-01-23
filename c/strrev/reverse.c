#include <stdio.h>
#include <stdlib.h>

int get_length(char* s) {
  int length = 0;
  int i = 0;
  while (s[i++] != '\0') {
    ++length;
  }
  
  return length;
}

char* reverse(char* s) {
  int length = get_length(s);
  int i = 0, j = length - 1;
  char temp;
  for (i = 0, j = length - 1; i < length /2; ++i, --j) {
    temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }
  return s;
}

void debug() {
  char s[] = "blah";
  *(s + 1) = 'a';
  printf("s = %s\n", s);
}

int main(int argc, char** argv) {
  char s[] = "blah"; // THIS IS KEY. ONLY THIS WAY IT WORKS
  // If try to modify char* s like this s[i] = a; 
  // it is undefined.
  printf("%s\n", s);
  int l = get_length(s);
  printf("length = %d\n", l);

  char* reversed = reverse(s);
  printf("reversed: %s\n", reversed);
  l = get_length(reversed);
  printf("new length: %d\n", l);

  return 0;
}
