import java.util.Scanner;

public class theSecretnumber {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    // Update them ve mang
                    int [] history = new int[100];
                    // Random number (1 - 100)
                    int secret = (int)(Math.random() * 100) + 1;
                    int currguess;
                    int count = 0;

                    System.out.println("=== THE SECRET NUMBER GAME ===");
                    System.out.println("I have picked a number between 1 and 100. Can you guess it?");
                    do{
                              System.out.println("Enter each guess: ");
                              currguess = sc.nextInt();
                              history[count] = currguess;
                              count++;
                              // If wrong guess: suggest max/min
                              if(currguess > secret){
                                        System.out.println("Too high! Try a smaller number!!");
                              }else if(currguess < secret){
                                        System.out.println("Too low! Try a larger number!!");
                              }else{
                                        System.out.println("------------------------------------");
                                        System.out.println("CONGRATULATIONS! You found it: "+secret);
                                        System.out.println("Total attempts: "+count);
                                        // History guessing
                                        System.out.println("Your Guessing History: ");
                                        for(int i = 0; i < count; i++){
                                                  System.out.println(history[i] + "");
                                        }
                                        // Bonus rank after guess
                                        if(count <= 5){
                                                  System.out.println("Rank: King guess!!");
                                        }else if (count <= 10){
                                                  System.out.println("Rank: Guess Good");
                                        }else{
                                                  System.out.println("Need some Lucky!!");
                                        }
                              }
                    }while(currguess != secret);
                    sc.close();
          }
}
