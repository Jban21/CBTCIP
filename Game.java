import java.util.*;
class Random
{
	static int n;
	int i=0,guess,score=0;
	static int get_randomnumber(int min,int max)
	{
		n=(int)(Math.random()*(max-min))+min;
		return n;
	}
	void play()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Thank you!!Let's play the game");
		for(i=0;i<5;i++)
		{
			System.out.println("Guess a number please:");
			guess=sc.nextInt();
			if(guess==n)
			{
				System.out.println("Nice!!you guessed correct");
				score++;
				break;
			}
			else if(guess>n)
				System.out.println("Sorry!you guessed too high,try again!");
			else if(guess<n)
				System.out.println("Sorry!you guessed too less,try again!");
		}
			if(score==0)
				System.out.println("Total number of trials is over");
			else
				System.out.println("end,you won the game!!");
		
	}
	void disp()
	{
		System.out.println("Your total score is:"+score);
	}
		
}
class Game
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int x=ran.get_randomnumber(1,100);
		System.out.println("Guessing done");
		ran.play();
		ran.disp();
	}
}