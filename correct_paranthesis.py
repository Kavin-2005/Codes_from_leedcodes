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
    
