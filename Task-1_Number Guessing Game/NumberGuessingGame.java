import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1;

        int trycount = 0;
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the Difficulty Level( easy , medium , hard ) : ");
            String level = sc.next();

            if(level.equals("easy")){

            int health = 10;
            System.out.println("You Have choose Easy Difficulty Level ");
            System.out.println("You have " + health + " numbers of tries to guess the number ");
            System.out.println();

            while(health>0){
                
                System.out.print("Enter your guess (0-100): ");
                int guess = sc.nextInt();
                trycount++;
                
                if(health==0){
                    System.out.println("You have 0 attempts left");
                    System.out.println();
                    System.out.println("\t\t\t\t GAME OVER ");
                    break;
                }

                if(guess==randomnumber){
                    System.out.println("Your Guess is correct, You WIN...");
                    System.out.println("The number is " + randomnumber);
                    System.out.println("You take " + trycount + " tries to guess the number");
                    break;
                }

                else if(guess<0 || guess>100){
                    System.out.println("Invalid Number");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess<randomnumber){
                    System.out.println("Your Guess is low ");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess>randomnumber){
                    System.out.println("your Guess is high");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

            }
            if(health==0){
                System.out.println("The Number is " + randomnumber);
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------- GAME OVER-------------------------------------------------------------------- ");
            }
        }

        else if (level.equals("medium")){

            int health = 7;
            System.out.println("You Have choose Medium Difficulty Level ");
            System.out.println("You have " + health + " numbers of tries to guess the number ");
            System.out.println();

            while(health>0){
                
                System.out.print("Enter your guess (0-100): ");
                int guess = sc.nextInt();
                trycount++;
                
                if(health==0){
                    System.out.println("You have 0 attempts left");
                    System.out.println();
                    System.out.println("\t\t\t\t GAME OVER ");
                    break;
                }

                if(guess==randomnumber){
                    System.out.println("Your Guess is correct, You WIN...");
                    System.out.println("The number is " + randomnumber);
                    System.out.println("You take " + trycount + " tries to guess the number");
                    break;
                }

                else if(guess<0 || guess>100){
                    System.out.println("Invalid Number");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess<randomnumber){
                    System.out.println("Your Guess is low ");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess>randomnumber){
                    System.out.println("your Guess is high");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

            }
            if(health==0){
                System.out.println("The Number is " + randomnumber);
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------- GAME OVER-------------------------------------------------------------------- ");
            }

        }

        else if(level.equals("hard")){

            int health = 5;
            System.out.println("You Have choose Hard Difficulty Level ");
            System.out.println("You have " + health + " numbers of tries to guess the number ");
            System.out.println();

            while(health>0){
                
                System.out.print("Enter your guess (0-100): ");
                int guess = sc.nextInt();
                trycount++;
                
                if(health==0){
                    System.out.println("You have 0 attempts left");
                    System.out.println();
                    System.out.println("\t\t\t\t GAME OVER ");
                    break;
                }

                if(guess==randomnumber){
                    System.out.println("Your Guess is correct, You WIN...");
                    System.out.println("The number is " + randomnumber);
                    System.out.println("You take " + trycount + " tries to guess the number");
                    break;
                }

                else if(guess<0 || guess>100){
                    System.out.println("Invalid Number");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess<randomnumber){
                    System.out.println("Your Guess is low ");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

                else if(guess>randomnumber){
                    System.out.println("your Guess is high");
                    System.out.println("You have " + --health + " attempts remaining ");
                    System.out.println();
                }

            }
            if(health==0){
                System.out.println("The Number is " + randomnumber);
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------- GAME OVER-------------------------------------------------------------------- ");
            }
        }
    }
    }
}