def removeduplicates(nums):
  i=0
  for j in range(1,len(nums)):
    if nums[i]!=nums[j]:
      i+=1
      nums[i]=nums[j]
  return i+1\
# Get input from the user
user_input = input("Enter sorted list of numbers separated by spaces: ")

# Convert input string to a list of integers
nums = list(map(int, user_input.split()))

# Make sure input is sorted
nums.sort()

# Call the function
k = removeDuplicates(nums)

# Print results
print("Number of unique elements:", k)
print("List after removing duplicates:", nums[:k])
