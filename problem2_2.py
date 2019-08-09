spaces = int(input())
lastday = input()
thisday = input()
counter = 0
samespot = 0

if 1 <= spaces <= 100:
    pass
else:
    print("too many total parking spaces")
    exit()

if len(lastday) != spaces or len(thisday) != spaces:
    print("too many or too little parking spaces")
    exit()

for x in lastday:
    if x == "C" or x == ".":
        pass 
    else:
        print("wrong format")
        exit()
    if thisday[counter] == "C" and x == "C":
        samespot += 1
    counter += 1

print(str(samespot))