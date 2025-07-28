def isvalid(s:str)->bool:
  stack=[]
  bracket_map={')':'(','}':'{',']':'['}
  for c in s:
    if c in bracket_map.values():
      stack.append(c)
    elif not stack or stack[-1]!=bracket_map[c]:
      return False
     stack.pop()
    else:
      return False
  return not stack
s=input("enter the string here")
print(isvalid(s))


#another method

def isvalid(s:str)->bool:
  stack=[]
  bracket_map={')':'(','}':'{',']':'['}
  for c in s:
    if c not in bracket_map:
      stack.append(c)
    else:
      if not stack or stack.pop()!=bracket_map[c]:
        return False
  return len(stack)==0
s=input("enter the string here")
print(isvalid(s))
    
