
public class StringOperation {

	public static void main(String[] args) {
		String s="Java Program"; 
		convertolower(s);
		converttoupper(s);
	    reverse(s);
	    //last two character to move first two position 
	    changeSeq(s);
	}

	private static void changeSeq(String s) {
		int length=s.length();
		for(int j=length-2;j<length;j++)
		{
			System.out.print(s.charAt(j));
		}
		for(int i=0;i<length-2;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
	}

	private static void reverse(String s) {
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			System.out.print(s.charAt(i));
		}	
		System.out.println();
	}

	private static void converttoupper(String s) {
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int value=c[i];
			if(value>=97 && value<=122) {
			int total=value-32;
			char b=(char)+total;
			System.out.print(b);
			}
			else
			{
				System.out.print(c[i]);
			}
		}
		System.out.println();
		
		
	}

	private static void convertolower(String s) {
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int value=c[i];
			if(value<=90 && value>=65) {
			int total=value+32;
			char b=(char)+total;
			System.out.print(b);
			}
			else
			{
				System.out.print(c[i]);
			}
		}
		System.out.println();


	}

}
