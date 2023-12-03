import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
 public static void main(String[] args)
 {
   System.out.println("it is a number guessing game,you have only 3 changes");
   Scanner sc=new Scanner(System.in);
   Random rand=new Random();
   int min=1,max=100,x=3,count=3;
   while(x>0)
   {
     int guess=rand.nextInt(100)+1;
     for( count=1;count<=x;count++)
     {
       System.out.println("enter the number:");
       int number=sc.nextInt();
       if(number==guess)
       {
         System.out.println("Congrats you have guess the correct number");
       }
       else if(number<guess)
       {
         System.out.println("its  too low");
	      x--;
	   } 

       else
       {
         System.out.println("its too high");
		 x--;
        
	   }
	 }  
   }
   if(count>x)
   {
		   System.out.println("sorry, better luck next time");
   }
   }    
 }

 
