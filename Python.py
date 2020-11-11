c,d = input().split()
m = int(c)
n = int(d)
if(n > m):
    a = n
    b = m
else:
    a = m
    b = n
if(a % b == 0):
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
