// Name: Alejandro Bello 
// Class Course #: 3033 
// Date: 02/16/2025

// DESCRIPTION: <a sentence about what the purpose of this program is>
// The purpose of the program is to covert a total amount of dollar into coins. 

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 1.68;
    int centsRemaining = 0; 
    int numQuarters = 0;
    int numDimes = 0; 
    int numNickels = 0;
    int numPennies = 0; 

    double initialAmount2 = 3.80;
    int centsRemaining2 = 0; 
    int numQuarters2 = 0;
    int numDimes2 = 0; 
    int numNickels2 = 0;
    int numPennies2 = 0;

    //CALCULATION SECTION
    centsRemaining = (int) (100 * initialAmount); 
    numQuarters = centsRemaining / 25; //does integer division
    centsRemaining %= 25; //get remaining cents after exchanging quarters
                          // adding %= removes the need to add cents remaing twice
    numDimes = centsRemaining / 10; // dividing to get dimes 
    centsRemaining %= 10; //get remaining cents after exchanging for dimes
    numNickels = centsRemaining / 5; //divide to get nickels
    centsRemaining %= 5; //get remaining cents after exchanging for nickels
    /*numPennies = centsRemaining / 0*/
    
    centsRemaining2 = (int) (100 * initialAmount2); 
    numQuarters2 = centsRemaining2 / 25; //does integer division
    centsRemaining2 %= 25; //get remaining cents after exchanging quarters
    numDimes2 = centsRemaining2 / 10; // dividing to get dimes 
    centsRemaining2 %= 10; //get remaining cents after exchanging for dimes
    numNickels2 = centsRemaining2 / 5; //divide to get nickels
    centsRemaining2 %= 5;

    
    //OUTPUT SECTION
    /*System.out.println(centsRemaining); //for test
    System.out.println(numQuarters); //another test
    System.out.println(numDimes); // test 
    System.out.println(numNickels); */ //testing 

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.%n" ,initialAmount, numQuarters, numDimes, numNickels, centsRemaining);
    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.%n" ,initialAmount2, numQuarters2, numDimes2, numNickels2, centsRemaining2);

  }


}
