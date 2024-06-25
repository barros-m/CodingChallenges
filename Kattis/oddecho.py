'''
    Problem: https://open.kattis.com/problems/oddecho
'''

n = 0

n = int(input())
arr = []

for i in range(0, n):
    num = input()
    if i % 2 == 0:
        arr.append(num)

for item in arr:
    print(item)

# 48.7
# fiu: 110.2