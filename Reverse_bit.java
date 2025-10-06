import java.util.Scanner;
public class Main{
   public static void main(String[] args){
     int result=0;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<32;i++){
       result<<=1;
       result |=(n&1);
       n>>=1;}
      sc.close();
     System.out.println(result);}
}


//Another method
import java.util.Scanner;
public class Main{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String binary=String.format("%32s",Integer.toBinaryString(n)).replace('','0');
      String res=new StringBuilder(binary).reverse().toString();
      int num=Integer.parseInt(res,2);
      System.out.println(num);
      sc.close(); 
   }
}
   
 
      
  
