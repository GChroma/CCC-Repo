flips = input()
if len(flips) > 1000000:
    exit()
#ur means up right, dl means down left, etcetera
ul = 1
ur = 2
dl = 3
dr = 4
#p stands for past
pul = 1
pur = 2
pdl = 3
pdr = 4
for x in flips:
    if x == "H":
        ul = pur
        ur = pul
        dl = pdr
        dr = pdl

        pul = ul
        pur = ur
        pdl = dl
        pdr = dr
    if x == "V":
        ul = pdl
        ur = pdr
        dl = pul
        dr = pur

        pul = ul
        pur = ur
        pdl = dl
        pdr = dr

print(str(ul) + " " + str(ur) + "\n" + str(dl) + " " + str(dr))