package week3.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length;i++)
			if(i%2==0)
				System.out.print(Character.toUpperCase(ch[i]));
			else
				System.out.print(ch[i]);
			
	}

}
