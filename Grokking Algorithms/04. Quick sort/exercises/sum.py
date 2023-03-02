def sum(arr):
    # базовый случай
    if len(arr) == 1:
        return arr[0]
    # рекурсивный случай
    return arr[0] + sum(arr[1:])

print(sum([1, 3, 5, 7]))
