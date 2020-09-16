//Sara Alsaifi
//AP CS A Period 2
//16 September 2020

import java.io.*;
import java.util.*;
public class Lab4RanNumUI{
  public static void main(String args[]){
   /*
   Challenge 1: this code will create two random int numbers in the range that is created from user input.
   */
   Scanner randNum = new Scanner(System.in);
   System.out.println("Type a negative whole number");
   int negNum = randNum.nextInt();
   System.out.println("Type a whole number that is greater than " + (Math.abs(negNum)));
   int posNum = randNum.nextInt();
   int rand1 = ((int)(Math.random()*(posNum - negNum)) + negNum);
   int rand2 = ((int)(Math.random()*(posNum - negNum)) + negNum);
   System.out.println("You got a " + rand1 + " " + "and a " + rand2);
   /*
   Challenge 2: this code will print a Madlibs story from user input. 
   */
   Scanner places = new Scanner(System.in); 
	 System.out.println("Give an ecosystem");
	 String eco = places.nextLine();
		   
	 System.out.println("Give a country");
	 String country = places.nextLine(); 

	 Scanner noun = new Scanner(System.in);
	 System.out.println("Give a one word noun");
	 String mlNoun = noun.next();
				
	 Scanner name = new Scanner(System.in); 
	 System.out.println("Give a first and last name that rhyme with the noun you chose");
	 String mlName = name.nextLine(); 

	 System.out.println("Give an animal");
	 String animal = name.nextLine();
				
	 System.out.println("Give a positive whole number");
	 int numberwhole = name.nextInt();
		   
	 System.out.println("Give another positive whole number greater than the last number");
	 int dollars = name.nextInt();
				
	 System.out.println("Give a positive decimal number smaller than the whole number");
	 double numberdeci = name.nextDouble();

	 System.out.println("State a one word emotion");
	 String emotion = name.next();

	 double calc = (dollars - numberwhole)+numberdeci; 

	 System.out.print("Once upon a time, in a distant " + eco + " in the heart of " + country + " lived a " + mlNoun + " named " + mlName + ". " + mlName + " saw a sad " + animal + ". " + mlName + " decided to give the " + animal + " " + numberwhole + " dollars even though he only had " + dollars + ". Thank you said the " + animal + " and gave " + mlName + " " + numberdeci + " dollars. Now " + mlName + " only had " + calc + " dollars, but he was still " + emotion + "!"); 
   	}
}

