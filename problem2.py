linenum = int(input())
termsdict = {}
counter = 0
while counter != linenum:
    smessage = str(input())
    amount = int(smessage.split(" ")[0])
    if amount > 80:
        exit()
    symbol = str(smessage.split(" ")[1])
    termsdict.update({amount : symbol})
    counter += 1

for x in termsdict:
    counter2 = 0
    message = []
    while counter2 != x:
        message.append(termsdict[x])
        counter2 += 1
    print("".join(message))
