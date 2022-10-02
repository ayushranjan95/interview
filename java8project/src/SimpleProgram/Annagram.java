package SimpleProgram;

public class Annagram {
	public static boolean isannagram(String a,String b)
	{
		int count[]=new int[256];
		int count1[] =new int[256];
		if(a.length()!=b.length())
		{
			return false;
		}
		for(int i=0;i<a.length();i++)
		{
			count[a.charAt(i)]++;
			count1[b.charAt(i)]--;
			
			
		}
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
			{
				return false;
			}
		
		}
		return true;
	}
	public static void main(String[] args) {
		String a="hello";
		String b="ollhp";
		if(isannagram(a,b))
		{
			System.out.println("This is annagram:");
		}
		else
		{
			System.out.println("this is not an annagram");
		}
		
	}

}
