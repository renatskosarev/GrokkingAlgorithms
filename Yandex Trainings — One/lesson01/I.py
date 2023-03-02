A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())

if (A <= D and B <= E) or (B <= D and A <= E) or (A <= D and C <= E) or (A <= E and C <= D) or (B <= D and C <= E) or (B <= E and C <= D):
    print('YES')
else:
    print('NO')
    