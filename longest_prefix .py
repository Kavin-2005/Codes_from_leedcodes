# Longest prefix in the given input
def longestprefix(strs:list[str])-> str:
   # Sort the words in lexicographical order
  strs.sort()

  # Take the first and last string after sorting
  first = strs[0]
  last = strs[-1]
  i = 0
  # Loop to find the common prefix 
  while i<len(first) and i<len(last) and first[i]==last[i]:
    i+=1
  return first[:i]

#input 
words = ["flower", "flow", "flight"]
#main function calling
print("Longest Common Prefix:", longestprefix(words))
  
  
