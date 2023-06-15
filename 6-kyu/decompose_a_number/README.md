## INSTRUCTIONS

Decompose a number into an array (tuple in Haskell, array of arrays `long[][]` in C# or Java) in the form [ [k1, k2, k3, ...], r ] such that:

`num = 2k1 + 3k2 + 4k3 + ... + nkn-1 + r`
Where every `ki > 1` and every `ki` is maximized (first maximizing for 2, then 3, and so on)

### Examples
```
0   -->  [ [], 0 ]
3   -->  [ [], 3 ]        # because there is no `k` more than 1
26  -->  [ [4, 2], 1 ]    # 26 = 2^4 + 3^2 + 1
8330475  -->  [ [22, 13, 10, 8, 7, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2], 0 ]
# 8330475 = 2^22 + 3^13 + 4^10 + ... + 22^2 + 23^2 + 24^2 + 0
```
