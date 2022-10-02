package SimpleProgram;

public class PallindromOfString {
	public static boolean ispallindron(String st)
	{
		int i=0;
		int j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
		
	}
public static void main(String[] args) {
	String str="hi i am pallindrom anna";
	String words[]=str.split(" ");
	for(String word:words)
	{
		if(ispallindron(word))
		{
			System.out.println("this is pallindrom number");
		}
		else
		{
			System.out.println("this is not pallindrom number:");
		}
	}
}
}
