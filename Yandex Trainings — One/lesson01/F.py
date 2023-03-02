x1, y1, x2, y2 = map(int, input().split())

variants = [(x1 + x2, max(y1, y2)), (max(x1, x2), y1 + y2), (x1 + y2, max(x2, y1)), (max(x1, y2), x2 + y1)]

min = 0
for i in range(len(variants)):
    if variants[i][0] * variants[i][1] < variants[min][0] * variants[min][1]:
        min = i

print(variants[min][0], variants[min][1])
