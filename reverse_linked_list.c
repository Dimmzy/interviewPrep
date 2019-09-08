#include <stdio.h>

typedef struct Node {
	int data;
	Node* next;
} Node;

void reverseLL(Node** head) {
	Node* current = *head;
	Node* next = prev = NULL;
	while (current != NULL) {
		// store next node
		next = current->next;
		// next of current is the previous
		current->next = prev;
		// prev and current move one step forward
		prev = current;
		current = next;
	}
	*head = prev;
}