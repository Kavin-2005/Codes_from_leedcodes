def removeduplicates(nums):
  i=0
  for j in range(1,len(nums)):
    if nums[i]!=nums[j]:
      i+=1
      nums[i]=nums[j]
  return i+1\
# Get input from the user
num = input()
# Convert input string to a list of integers
nums = list(map(int, num.split()))
# Make sure input is sorted
nums.sort()
# Call the function
k = removeDuplicates(nums)
# Print results
print("List after removing duplicates:", nums[:k])
