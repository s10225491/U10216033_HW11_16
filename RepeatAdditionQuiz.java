// U10216033
// HW 11_16

import java.util.*;

public class RepeatAdditionQuiz{

	//main method
	public static void main(String[] args){
	
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Create an integer ArrayList
		ArrayList<Integer> repeatAnswer = new ArrayList<>();
		
		//Print quiz
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		
		//Input answer
		int answer = input.nextInt();
		
		while(number1 + number2 != answer){
			
			if(repeatAnswer.contains(answer)){
				System.out.println("You already entered " + answer);
			}
			
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
			
			repeatAnswer.add(answer);
			answer = input.nextInt();
		}
	
		System.out.println("You got it!");
	
	}
}
