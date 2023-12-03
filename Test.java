import java.util.Scanner;
class Test  
{
	public static void main(String[] args) 
	{
		int i,n=4,marks,sum=0;
		float avg,percentage;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=n;i++)
		{
			System.out.println("enter the marks of subject"+(i));
		    sum=sum+sc.nextInt();
	    }
		System.out.println("the sum of marks is:"+sum);
		avg=sum/n;
		System.out.println("Average of all subject is"+avg);
		percentage=(sum*100)/400;
		System.out.println("percentage of subject is:"+percentage);
		if(percentage>=90)
			System.out.println("A1");
		else if(percentage>=80)
			System.out.println("A2");
		else if(percentage>=65)
			System.out.println("B1");
		else if(percentage>=55)
			System.out.println("B2");
		else if(percentage>=35)
			System.out.println("pass");
		else
			System.out.println("fail");
    }
}