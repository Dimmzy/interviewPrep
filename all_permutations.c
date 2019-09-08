#include <stdio.h>
#include <string.h>

void swap (char* x, char* y) {
	char temp = *x;
	*x = *y;
	*y = temp;
}

void permutate(char* str, int start, int end) {
	int i;
	// Prints the last letter
	if (start == (end - 1)) {
		printf("%s\n", str);
	} else {
		// i -1 letters fixed, swapping the i'th letter for each of the remaining
		for (i = start; i < end; i++) {
			swap ((str+start), (str+i));
			permutate(str, start + 1, end);
			// Returns the string to it's original shape.
			swap ((str+start), (str+i));
		}
	}
}

int main() {
	char str[] = "Hello";
	int length = strlen(str);
	permutate(str,0,length);
	return 0;
}