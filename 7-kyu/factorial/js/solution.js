function factorial(n)
{
    if (n >= 0 && n <= 12) {
        return n > 1 ? n * factorial(n - 1) : 1;
    } else {
        throw RangeError;
    }
}