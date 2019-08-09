a1 = int(input("How many 1-point free throws did the apples score? \n:"))
if 0 <= a1 <100:
    pass
else:
    print("Not within 100 and 0")
    exit()
a2 = int(input("How many 2-point field goals did the apples score? \n:"))
if 0 <= a2 < 100:
    pass
else:
    print("Not within 100 and 0")
    exit()
a3 = int(input("How many 3-point shots did the apples score? \n:"))
if 0 <= a3 < 100:
    pass
else:
    print("Not within 100 and 0")
    exit()
b1 = int(input("How many 1-point free throws did the bananas score? \n:"))
if 0 <= b1 < 100:
    pass
else:
    print("Not within 100 and 0")
    exit()
b2 = int(input("How many 2-point field goals did the bananas score? \n:"))
if 0 <= b2 < 100:
    pass
else:
    print("Not within 100 and 0")
    exit()
b3 = int(input("How many 3-point shots did the bananas score? \n:"))
if 0 <= b3 < 100:
    pass
else:
    print("Not within 100 and 0")
    exit()


aTotal = a1 + a2*2 + a3*3
bTotal = b1 + b2*2 + b3*3

if aTotal > bTotal:
    print("A")
elif bTotal > aTotal:
    print("B")
else:
    print("T")