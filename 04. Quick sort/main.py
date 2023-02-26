def quick_sort(array):
    if len(array) < 2:
        return array
    pivot = array[0]
    less = [i for i in array[1:] if i < pivot]
    greater = [i for i in array[1:] if i > pivot]
    return quick_sort(less) + [pivot] + quick_sort(greater)


array = [2, 12, 201, 73, 1, 82, 47, 192, 17, 99, 104, 65, 50]
print(quick_sort(array))
