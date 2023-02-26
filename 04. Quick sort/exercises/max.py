def max_num(arr):
    if len(arr) == 1:
        return arr[0]
    return max(max_num(arr[1:]), arr[0])



print(max_num([1, 500, 4, 15, 70, 9, 11, 99]))  # 500
print(max_num([1, 4, 15, 70, 9, 11, 99]))  # 99
print(max_num([1, 4, 15, 70, 9, 11, 20]))  # 70
