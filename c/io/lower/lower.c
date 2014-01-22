#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char** argv) {
  printf("argc = %d\n", argc);

  int c;
  
  while ((c = getchar())!= '\n') {
    if (strcmp(argv[0], "./tolower") == 0) {
      putchar(tolower(c));
    }
    else if (strcmp(argv[0], "./toupper") == 0) {
      putchar(toupper(c));
    }
    else {
      fprintf(stderr, "ERROR: name is: %s\n", argv[0]);
      exit(2);
    }
  }

  return 0;
}
