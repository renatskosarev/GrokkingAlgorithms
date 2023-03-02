def is_ascending(arr):
    for i in range(1, len(arr)):
        if arr[i] <= arr[i - 1]:
            return False
    return True


arr = list(map(int, input().split()))
print('YES' if is_ascending(arr) else 'NO')
