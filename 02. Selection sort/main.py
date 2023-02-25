def find_smallest(arr):
    smallest_index = 0
    for i in range(1, len(arr)):
        if arr[i] < arr[smallest_index]:
            smallest_index = i
    return smallest_index


def selection_sort(arr):
    new_arr = []
    for _ in range(len(arr)):
        smallest = find_smallest(arr)
        new_arr.append(arr.pop(smallest))
    return new_arr


array = [2, 12, 201, 73, 1, 82, 47, 192, 17, 99, 104, 65, 50]
print(selection_sort(array))
