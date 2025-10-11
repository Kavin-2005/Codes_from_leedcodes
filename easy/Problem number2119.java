import java.util.Scanner;
public class Main{
   public static void Main(String[] args){
     Scanner sc = new Scanner(System.in);
     int num=sc.nextInt();
     if(num==0){
       System.out.println("true");// Reversing 0 → 0, so it always stays the same
     else if (num%10==0){
       //1200 → reverse → 21 → reverse again → 12 (not same)
      // Numbers ending with 0 will lose the trailing zeros permanently
       System.out.println("false");
     }
     retunr true;//526 → reverse → 625 → reverse → 526 (same)
   }  
}

 
    
