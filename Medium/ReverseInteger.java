import java.util.Scanner;
import java.util.Math;
import java.util.ArrayList;
class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        ArrayList<Character> al = new ArrayList<>();
        String str = Integer.toString(x);

        for (char ch : str.toCharArray()) {
            al.add(ch);
        }

        int st = al.size();
        long result = 0;   // Use long

        for (int i = 0; i < st; i++) {
            int num = x % 10;
            x = x / 10;

            if (num == 0)
                continue;

            result += (long) num * (long) Math.pow(10, st - i - 1);

            if (result > Integer.MAX_VALUE)
                return 0;
        }

        result *= sign;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;

        return (int) result;
    }
}
class Main{
  public Static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Solution s=new Solution();
    System.out.println(s.reverse(sc));
  }
}
