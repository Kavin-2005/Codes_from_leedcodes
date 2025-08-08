from typing import List
def remove_element(nums:List[int],val:int):->int:
  index=0
  for i in range(len(nums)):
    if nums[i]!=val:
      nums[index]=nums[i]
      index+=1
  return index


#exapmle usage
nums=[3,4,5,6,78,9,0,1,2,3,4,5,6]
val=3
rc=remove_element(nums,val)
print("New length:", new_length)
print("Modified list:", nums[:new_length])
