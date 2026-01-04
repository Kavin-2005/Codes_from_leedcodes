package day4;
import java.util.Scanner;

public class Main {
	void panagram(String str){
		str=str.toLowerCase();
		boolean[]arr=new boolean[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				arr[ch-'a']=true;
			}
		}
		for (boolean value:arr) {
			if(!value) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true+"	It is a Panagram");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str="qwertyuioplkjhgfdsazxcvbnm";
		Main m=new Main();
		m.panagram(str);
		m.panagram(st);
		sc.close();
	}

}
