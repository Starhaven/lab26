//A+ Computer Science  -  www.apluscompsci.com
//Name - Kyle dodds
//Date - 2 February 2017
//Class - Period 5
//Lab  - 26

import java.util.Scanner;
import static java.lang.System.out;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		
		out.print("Enter 1st monster's name: ");
		String name1 = scan.nextLine();
		out.print("Enter 1st monster's size: ");
		String size1 = scan.nextLine();
		out.print("Enter 2nd monster's name: ");
		String name2 = scan.nextLine();
		out.print("Enter 2nd monster's size: ");
		String size2 = scan.nextLine();
		
		Skeleton skeleton = new Skeleton(name1,Integer.parseInt(size1));
		goblin goblin = new goblin(name2,Integer.parseInt(size2));
		
		out.println("Monster 1 : "+skeleton.getName());
		out.println("Monster 2 : "+goblin.getName());
		
		if(skeleton.isBigger(goblin)){
			out.println("Monster 1 is bigger than Monster 2.");
		}else{
			out.println("Monster 1 is smaller than Monster 2.");
		}
		
		if(skeleton.namesTheSame(goblin)){
			out.println("Monster 1 and Monster 2 have the same name.");
		}else{
			out.println("Monster 1 does not have the same name as Monster 2.");
		}
	}
}