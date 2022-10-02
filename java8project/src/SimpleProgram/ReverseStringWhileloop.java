package SimpleProgram;

public class ReverseStringWhileloop {
	public static void reverse(String str1)
	{
		int i=0;
		int j=str1.length()-1;
		char rev[]=str1.toCharArray();
		while(i<j)
		{
			char temp=rev[i];
			rev[i]=rev[j];
			rev[j]=temp;
			i++;
			j--;
			
		}
		for(char ch:rev)
		{
			System.out.print(ch);
		}
		
		System.out.println("");
		
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
