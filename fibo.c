// Recursive Fibonacci

int fibRecursive(int n) {
	if (n <= 1) {
		return n;
	}
	return fib(n-1) + fib(n-2);
}

// Dynamic Programming Fibonacci

int fibDP(int n) {
	int f[n+2];
	f[0] = 0;
	f[1] = 1;

	for (int i = 2; i <= n; i++) {
		f[i] = f[i-1] + f[i-2];
	}

	return f[n];
}