class Solution {
    public int primePalindrome(int n) {

    if (n <= 2) return 2;

    while (true) {

        
        if (n % 2 == 0) {
            n++;
            continue;
        }

        if (isPalindrome(n) && isPrime(n)) {
            return n;
        }

        n++;

        if (10000000 < n && n < 100000000) {
            n = 100000000;
        }
    }
}

private boolean isPalindrome(int num) {
    int original = num, rev = 0;

    while (num > 0) {
        rev = rev * 10 + num % 10;
        num /= 10;
    }

    return original == rev;
}

private boolean isPrime(int num) {
    if (num < 2) return false;
    if (num % 2 == 0) return num == 2;

    for (int i = 3; i * i <= num; i += 2) {
        if (num % i == 0) return false;
    }

    return true;
}
}