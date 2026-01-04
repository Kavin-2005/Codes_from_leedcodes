public class Main {
  void Anagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		str1.replace(" ", "");
		str2.replace(" ", "");
		if(str1.length()!=str2.length()) {
			System.out.println("Not a Anagram");
		}
		int count[]=new int[26];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
			count[str2.charAt(i)-'a']--;
		}
		for(int c:count) {
			if(c!=0) {
				System.out.println("Its is not a anagram");
			}
		
		}
		System.out.println("Its is a anagram");
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str="qwertyuioplkjhgfdsazxcvbnm";
		String str1="Silent";
		String str2="listen";
		Main m=new Main();
		m.panagram(str);
		m.panagram(st);
		m.Anagram(str2,str1);
		sc.close();
	}

}
