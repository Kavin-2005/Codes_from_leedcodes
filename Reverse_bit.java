import java.util.Scanner;
public class main{
   public Static void main(String[] args){
     int result=0;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<32,i++){
       result<<=1;
       result |=(n&1);
       n>>=1;}
     return result;}
}
    
 
      
  
