def length(arr):
    if (not arr[1:]):
        return 1
    return length(arr[1:]) + 1


print(length([1, 2, 3, 4, 5, 6, 7, 8]))
