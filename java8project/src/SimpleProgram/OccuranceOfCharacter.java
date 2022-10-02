package SimpleProgram;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String str="helloheo";
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]>1)
			{
				char a=(char)(97+i);
				System.out.println(a+":"+count[i]+" ");
			}
		}
		
	}

}
