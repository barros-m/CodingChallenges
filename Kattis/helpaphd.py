'''
    author: mattheusbarroos

    description: https://open.kattis.com/problems/helpaphd

'''

def sumNums(nums): # they are ints
    sum = 0
    for i in nums:
        sum = sum + int(i)
    return sum

def main():
    n = int(input())

    for i in range(n):
        str = input()

        if "=" in str:
            print("skipped")
        else:
            nums = str.split("+")
            print(sumNums(nums))

if __name__ == "__main__":
    main()