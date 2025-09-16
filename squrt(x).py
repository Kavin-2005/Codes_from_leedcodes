#without built in method 
class squreroot(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 2:
            return x

        left = 1
        right = x // 2
        ans = 0   # to store the last valid mid

        while left <= right:
            mid = (left + right) // 2
            m = mid * mid

            if m == x:
                return mid
            elif m < x:
                ans = mid       # mid is valid, store it
                left = mid + 1  # try for a larger one
            else:
                right = mid - 1  # try smaller

        return ans
