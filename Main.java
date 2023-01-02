import java.util.Arrays;
import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method

      //Storing the letters for "CODE" in a string array
      String[] data ={"C", "O", "D", "E"};

      //while loop checking to if x is greater or equal to 0
      while(x >= 0){

        //for loop using the int i to move along the array
        for(int i = 0;i < data.length; i++){

          //if statement checking to see if i is less than the length of the array and checking to see if x is greater than or equal to 0
          if(i < data.length && x >= 0){
            System.out.println(x + " " + data[i]);
            x = x - 1;

            //if statement checking to see if i is greater than the length of the array and if so setting the value of i to 0
            if(i > data.length){
              i = 0;
            }
          }

                
        }
    
      }

    }

    public static void question1() {
        // COMPLETE THIS METHOD
      int x = Console.getInt("Please enter a positve integer: ");
      countdown(x);

    }

    // Challenge Question 2    
    public static void question2() {
        // Create an interactive program that calls the methods in the morse class to prove they work
       // Morse.messageToMorse("the quick brown") and Morse.messageFromMorse("._ / ....") to prove they work


    }


    public static void main(String[] args) {
        
        question1();
        //question2();

    }




}