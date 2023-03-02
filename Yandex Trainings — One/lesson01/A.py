current, expected = list(map(int, input().split()))
mode = input()

if mode == 'heat':
    print(expected if expected > current else current)
elif mode == 'freeze':
    print(expected if expected < current else current)
elif mode == 'auto':
    print(expected)
elif mode == 'fan':
    print(current)
