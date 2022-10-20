package assign5_template;

import java.util.Scanner;

/*
CIS2168 Data Structures 005
VSCODE
Anthony Poole 
tun48981@temple.edu 
Assign 5 
Program name:
Change ChangeDispenser 
Program description:
    Takes in User Input in order to make a stack or queue of employees 
*/
public class ChangeDispenser {

    //public wrapper
    //NOTE - your wrapper method does NOT have to be a void method.
    public static void makeChange(int amount) {
        //add your code
        
        //Hints:
        //Use a list to store the denomination values of coins in decreasing order.
	//Use a second list to store the names of coins in the same order as their denomination value list.
      
        //call the private recursive counterpart and pass the corresponding
        //   arguments.
    }

    //private recursive counterpart
    //NOTE - your recursive method does NOT have to be a void method.
    // example:
    // private static void makeChange(parameter list) {
    //   HintS -
    //       Your recursive method uses the coin value list and the coin name list. 
    //       In each call to the recursive method, the count of the first coin in the list 
    //          (coin in largest denomination value) is calculated and printed out. 
    //       Then the first coin is removed from the lists. 
    //       The remaining amount of money is calculated. 
    //       The coin lists and the remaining amount are passed to the next recursive call. 
    //       The recursion ends when no money is left.
    //}
    
    public static void main(String[] args) {

        //add your code to do the following:
        //Making a Scanner for user input 
        Scanner User = new Scanner(System.in);
        //Variable to store user input, store as double and 
        int UserMoney= User.nextInt();

        //prompt the user to enter the amount in dollars and cents
        //get the amount
        //convert the amount to all cents
        //call the public wrapper method
        
        //NOTE -
        // test your code using $2.91, $0.91, $0.78, $0
    }

}
