from typing import List
def remove_element(nums:List[int],val:int):->int:
  index=0
  for i in range(len(nums)):
    if nums[i]!=val:
      nums[index]=nums[i]
      index+=1
  return index


#exapmle usage
