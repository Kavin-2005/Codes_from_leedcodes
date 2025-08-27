class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        words = s.strip().split()   # remove extra spaces and split by spaces
        return len(words[-1]) if words else None  # return last word if exists
        
