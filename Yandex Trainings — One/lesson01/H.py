a = int(input())  # интервал между поездами на первом пути
b = int(input())  # интервал между поездами на втором пути
n = int(input())  # количество поездов на первом пути, которые увидела Таня
m = int(input())  # количество поездов на втором пути, которые увидела Таня

first_min = a * (n - 1) + n
first_max = a * (n + 1) + n

second_min = b * (m - 1) + m
second_max = b * (m + 1) + m

# print(first_min, first_max, second_min, second_max)
min_ = max(first_min, second_min)
max_ = min(first_max, second_max)
if (max_ < min_):
    print(-1)
else:
    print(min_, max_)
