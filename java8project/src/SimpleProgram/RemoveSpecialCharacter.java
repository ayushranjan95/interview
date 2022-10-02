package SimpleProgram;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str="hello   !@#4";
		String str1=" ";
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))&& !Character.isLetter(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
