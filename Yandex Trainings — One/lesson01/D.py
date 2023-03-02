def solve(a, b, c):
    if c < 0:
        return "NO SOLUTION"
    if a == 0 and b == c ** 2:
        return "MANY SOLUTIONS"
    if a == 0:
        return "NO SOLUTION"
    result = (c ** 2 - b) / a
    if result % 1 != 0:
        return "NO SOLUTION"
    return int(result)


a = int(input())
b = int(input())
c = int(input())
print(solve(a, b, c))
