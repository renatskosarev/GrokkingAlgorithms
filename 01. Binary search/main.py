def search(arr, item_to_find):
    low = 0
    high = len(array) - 1

    while low < high:
        mid = int((low + high) / 2)
        guess = arr[mid]
        if guess == item_to_find:
            return mid
        if guess > item_to_find:
            high = mid
        else:
            low = mid
    return None


array = [1, 4, 9, 12, 31, 47, 55, 61, 102, 204, 515]
item_to_find = int(input())

print(search(array, item_to_find))
