def search(arr, item_to_find):
    low = 0
    high = len(array) - 1

    while low <= high:
        mid = (low + high) // 2
        guess = arr[mid]
        if guess == item_to_find:
            return mid
        if guess < item_to_find:
            low = mid + 1
        else:
            high = mid - 1
    return None


array = [5]
item_to_find = int(input())

print(search(array, item_to_find))
