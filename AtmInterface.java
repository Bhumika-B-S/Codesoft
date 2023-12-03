import java.util.Scanner;
public class AtmInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int correctpin=2004;
		int availablebalance=53777;
		System.out.println("Enter your card into the slot!");
		System.out.println("enter the pin number");
		int pin=sc.nextInt();
		if(pin==correctpin)
		{
			System.out.println("pin is correct welcome to dedit page");
		}
		else
		{
			System.out.println("pin is invalid");
		}
		while(pin==2004)
		{
            System.out.println("AUTOMATED TELLER MACHINE");
		    System.out.println("************************");
		    System.out.println("1.withdraw");
		    System.out.println("2.desposit");
		    System.out.println("3.Balance");
		    System.out.println("4.exit");
	        System.out.println("enter your choice");
		    int ch=sc.nextInt();
		    switch(ch)
		    {
			  case 1:System.out.println("enter the aount to withdraw");
			         int withdraw=sc.nextInt();  
			         if(availablebalance>=withdraw)
					 {
				       availablebalance=availablebalance-withdraw;
					   
				       System.out.println("transcation is done successfully with sufficient balance :"+availablebalance);
			         }
			         else
			         {
                      System.out.println("transcation is failed due to insufficient balanace");
			         }
			         break;
			  case 2:System.out.println("enter the amount for desposit");
						int despoist=sc.nextInt();   
				      availablebalance=availablebalance+despoist;
				     System.out.println("your amount has been successfully despoisted: "+availablebalance);
				     break;
              case 3:System.out.println(" Minimal statement is : "+ availablebalance);
		             break;
              case 4:System.out.println("exit(0)");
		             break; 
		     }
	      }
	  }
}
	
	
	
	
	
	
