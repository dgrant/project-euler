import time
startTime = time.time()
max=20

def check(n):
    for i in [19,18,17,16,15,14,13,12,11]:
        if n % i != 0:
            return False
    return True

guess=max
while True:
    if check(guess):
        break
    else:
        guess += 20
print(guess)
print("took=",time.time() - startTime)
