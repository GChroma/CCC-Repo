linenum = int(input())
counter = 0
cmessages = []

while counter != linenum:
    smessage = str(input())
    cmessages.append(smessage)
    counter += 1

ccounter = 1
fmessages = []

for x in range(0, len(cmessages)):
    fmessage = cmessages[x]
    tempmessages = []
    for x in range(1, len(fmessage)):
        if fmessage[x - 1] == fmessage[x]:
            ccounter += 1
            if (x + 1) == len(fmessage):
                tempmessages.append(str(ccounter) + " " + str(fmessage[x - 1]))
                break
        else:
            tempmessages.append(str(ccounter) + " " + str(fmessage[x - 1]))
            ccounter = 1
    fmessages.append(" ".join(tempmessages))

print("\n".join(fmessages))
