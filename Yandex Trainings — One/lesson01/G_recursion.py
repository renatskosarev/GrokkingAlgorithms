def solve(N, K, M):
    if K > N or M > K:
        return 0

    # базовый случай - не хватает сплава на изготовление заготовок
    if (N // K == 0):
        return 0
    
    # рекурсивный случай
    excess = N % K  # избыток
    preform_count = N // K

    detail_count = (K // M) * preform_count
    excess += (K % M) * preform_count
    detail_count += solve(excess, K, M)
    return detail_count


N, K, M = map(int, input().split())
print(solve(N, K, M))
