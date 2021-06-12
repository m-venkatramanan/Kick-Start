import java.util.Scanner;

public class Word_Count {

	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				String name=s.nextLine();
				char[] c=name.toCharArray();
				int length=name.length();
				for(int i=0;i<length;i++)
				{
					int count=0;
					for(int j=0;j<length;j++)
					{
						if(c[i]==c[j])
						{
							count++;
						}
					}
					System.out.println(c[i]+" --> "+count);
				}	
			}
}
