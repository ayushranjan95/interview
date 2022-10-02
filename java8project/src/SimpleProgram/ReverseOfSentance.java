package SimpleProgram;

public class ReverseOfSentance {
	public static void reverse(String str1)
	{
		char ch;
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			ch=str1.charAt(i);
			str2=ch+str2;
		}
		System.out.print(str2+" ");
	}
	public static void main(String[] args) {
		String str="hello how are you";
		String word[]=str.split(" ");
		for(String w:word)
		{
			reverse(w);
		}
	}

}
