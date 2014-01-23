#include <stdio.h>
#include <stdlib.h>

typedef struct s_node 
{
  int data;
  struct s_node* next;
} Node; 

void debug() {
  Node *prev = NULL;
  if (prev == NULL) {
    printf("debug: prev is null\n");
  }
  else {
    printf("debug: prev is not null, data = %d\n", prev->data);
  }
}

void print_list(Node* head) {
  Node* curr = head;
  while (curr != NULL) {
    printf("%d ", curr->data);
    curr = curr->next;
  }
  printf("\n");
}

void free_list(Node* head) {
  Node* curr = head;
  Node* foll = curr->next;
  while (foll != NULL) {
    free(curr);
    curr = foll;
    foll = foll->next;
  }
  free(curr);
}

Node* create_list() {
  Node *head = NULL;
  Node *node = NULL;
  Node *prev = NULL;
  for (int i=1; i<=5; ++i) {
    node = (Node*)malloc(sizeof(Node));
    node->data = i;
    if (prev == NULL) {
      head = node;
    }
    else {
      prev->next = node;
    }
    prev = node;
  }
  node->next = NULL;
  return head;
}

Node* reverse_list(Node* head) {
  Node* prev = NULL;
  Node* curr = NULL;
  Node* foll = NULL;

  if (head == NULL || head->next == NULL) {
    return head;
  }

  curr = head;
  foll = curr->next;
  while (foll != NULL) {
    curr->next = prev;
    prev = curr;
    curr = foll;
    foll = foll->next;
  }
  curr->next = prev;
  head = curr;
  
  return head;
}


int main(int argc, char** argv) {
  Node* head = create_list();
  print_list(head);
  
  head = reverse_list(head);
  print_list(head);

  free_list(head);

  return 0;
}
