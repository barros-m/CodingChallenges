'''
    https://open.kattis.com/problems/symmetricorder
'''

def printArray(arr):
    p(arr[0::2])
    pr(arr[1::2])

def p(arr):
    for i in arr:
        print(i)

def pr(arr):
    for i in reversed(arr):
        print(i)

def main():
    n = -1
    counter = 0
    while not n == 0:
        n = int(input())
        if n == 0:
            return
        counter += 1
        nums = []
        for i in range(n):
            a = (input())
            nums.append(a)

        print("SET", counter)
        printArray(nums)
        

if __name__ == "__main__":
    main()