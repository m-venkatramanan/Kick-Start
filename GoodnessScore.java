/*
 * Charles defines the goodness score of a string as the number of indices i such that 
 * Si≠SN−i+1 where 1≤i≤N/2 (1-indexed). 
 * For example, the string CABABC has a goodness score of 2 since S2≠S5 and S3≠S4.

   Charles gave Ada a string S of length N,
   consisting of uppercase letters and asked her to convert it into a string with a goodness score of K.
   In one operation, Ada can change any character in the string to any uppercase letter. 
   Could you help Ada find the minimum number of operations required to 
   transform the given string into a string with goodness score equal to K?
   
   
   Input:2
         5 1
         ABCAA
         4 2
         ABAA
    
   output:case#1:0
          case#2:1
       
 * */


import java.util.Scanner;

public class GoodnessScore {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		int[] n=new int[test];
		int[] k=new int[test];
		String[] name=new String[test];
		if(1<=test && test<=100)
		{
		for(int i=0;i<test;i++)
		{
			n[i]=s.nextInt();
			k[i]=s.nextInt();
			name[i]=s.next();
		}
		}
		int no=1;
		for(int i=0;i<test;i++)
		{
			if(n[i]==name[i].length())
			{
				if(0<=k[i] && k[i]<=n[i]/2)
				{
					int count=0;
					for(int j=0;j<name[i].length()/2;j++)
					{
						if(name[i].charAt(j)!=name[i].charAt(n[i]-1)) 
						{
							count++;
						}
					}
					if(k[i]==count)
					{
						System.out.println("Case #"+no+++":"+0);
					}
					else if(k[i]<count)
					{
						System.out.println("Case #"+no+++":"+(count-k[i]));
					}
					else
					{
						System.out.println("Case #"+no+++":"+(k[i]-count));
					}
				}
			}
		}
	}
}
