import java.util.Scanner;

class DoubleChar
{
	public static void main(String [] args)
	{
		int l,n,m,count;
		String str1="";
		char c=' ';
		System.out.println("Enter a sentence: ");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		DoubleChar obj=new DoubleChar();
		m=0;
		n=str.indexOf(c);
		while (n>0)
		{
			str1=str.substring(m,n);
			if (obj.doubleTest(str1))
				count+=1;
			m=n;
			n=str.indexOf(c,n);
		}
		System.out.println("

	






	
	boolean doubleTest(String x);
	{
		int len=x.length();
		for (int i=0; i<len; i++)
		{
			if (x.charAt(i)==x.charAt(i+1))
				return True;
			else
				return False;
		}
	}
