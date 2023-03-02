def get_nearest_num(arr, num):
    result = arr[0]
    for i in range(1, len(arr)):
        if abs(arr[i] - num) < abs(result - num):
            result = arr[i]
    return result


N = input()
arr = list(map(int, input().split()))
num = int(input())
print(get_nearest_num(arr, num))
