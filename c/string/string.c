#include <stdio.h>

char* strrev(char* s) {
  int len = 0;
  char* ptr = s;
  while (*(ptr++)) {
    ++len;
  }
  printf("len = %d\n", len);
  int i = 0, j = len - 1;
  for (; i < j; ++i, --j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }
  return s;
}

char* strrev2(char* s) {
  char* end = s;
  while (*++end);
  --end;
  char* begin = s;
  while (begin < end) {
    char temp = *begin;
    *begin = *end;
    *end = temp;
    ++begin;
    --end;
  }
  return s;
}

int main() {
  char s[] = "blah";
  char* output = strrev2(s);
  printf("%s\n", output);

  ///char t[] = "abcde";
  //output = strrev2(t);
  //printf("%s\n", output);

  return 0;
}
