def applyRules(lhch):
    rhstr = ""
    if lhch == 'A':
        rhstr = 'B'   # Rule 1
    elif lhch == 'B':
        rhstr = 'AB'  # Rule 2
    else:
        rhstr = lhch # no rules apply so keep the character
    return rhstr

def processString(oldStr):
    newstr = ""
    for ch in oldStr:
        newstr = newstr + applyRules(ch)
    return newstr

def createLSystem(numIters,axiom):
    startString = axiom
    endString = ""
    for i in range(numIters):
        endString = processString(startString)
        startString = endString
    return endString

#10 iteracji wzrostu alg startując z A
print(createLSystem(10,"A"))
