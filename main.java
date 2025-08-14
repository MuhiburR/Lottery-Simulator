import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		System.out.println("Lottery Simulator!");

		//Defining variables
		Scanner s = new Scanner(System.in);
		
		int whiteBall[] = new int[5];
		int redBall[] = new int [1];
		
		int userNums[] = new int [5];
		

		//User input
		System.out.println("these numbers can range anywhere from 1 - 69");
		System.out.println("Please enter your lottery 5 numbers:");
		for (int count = 0; count < 5; count++) {
		 userNums[count] = s.nextInt();
		}

		//Closing Scanner
		s.close();

		//Empty Space
		System.out.println();

		//Big For Loop for one time lottery
		for (int repeat = 0; repeat < 1; repeat++){
			System.out.println("White Balls");

		for (int i = 0; i < 5; i++){
			whiteBall[i] = (int)(Math.random() * 69) + 1;

			boolean isNewNumber = true;
				for (int check = 0; check < i; check++){
					if (whiteBall[i] == whiteBall[check]){
						isNewNumber = false;
					}// end of if statement
				} // end of inner inner for loop
			if (isNewNumber){
				System.out.println(whiteBall[i]);
			} // Print if statement

		} // end of inner for loop

			redBall[repeat] = (int)(Math.random() * 26) + 1;
				System.out.println("Red Ball");
			System.out.println(redBall[repeat]);

		} //end of outer for loop
	
		int whiteBallMatches = 0;
		for(int userNum : userNums) {
			for (int white : whiteBall) {
				if (userNum == white) {
					whiteBallMatches++;
				}
			}
		}
			
		
	boolean hasRedBallMatch = false;
		for (int userNum : userNums) {
				 if (userNum == redBall[0]) {
					 hasRedBallMatch = true;
				 }
		}

//if you won or didn't win; Print Statements
if ((hasRedBallMatch) && (whiteBallMatches == 5)){
	System.out.println("Congratulations, you won THE GRAND PRIZE!");
	}
else if (whiteBallMatches == 5){
	System.out.println("Congratulations, you won $1 Million!");
	}
else if ((hasRedBallMatch) && (whiteBallMatches == 4)){
	System.out.println("Congratulations, you won $50,000!");
	}
else if (((hasRedBallMatch) && (whiteBallMatches == 3)) || (whiteBallMatches == 4)){
	System.out.println("Congratulations, you won $100!");
	}
else if (((hasRedBallMatch) && (whiteBallMatches == 2)) || (whiteBallMatches == 3)){
	System.out.println("Congratulations, you won $7!");
	}	
else if ((hasRedBallMatch) || ((hasRedBallMatch) && (whiteBallMatches == 1))) {
	System.out.println("Congratulations, you won $4!");
	}
else {
	System.out.println("Unfortunately you didn't win any prizes. \nPlease try again!");
}

		
	} // end of main
} // end of class
