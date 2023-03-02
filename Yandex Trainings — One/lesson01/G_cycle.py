def solve(N, K, M):
    if K > N or M > K:
        return 0

    result = 0
    while (N // K != 0):
        excess = N % K
        preform_count = N // K

        result += (K // M) * preform_count
        excess += (K % M) * preform_count
        N = excess
    
    return result


N, K, M = map(int, input().split())
print(solve(N, K, M))
