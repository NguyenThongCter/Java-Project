import java.util.Scanner;

public class atmBankingSystem {
          public static void main(String[] args) {
                    System.out.println("ATM BANKING PROGRAMS");
                    System.out.println("------ATM SYSTEM------");
                    System.out.println("1. Check Balanced");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. EXIT PROGRAMS");

                    double Balanced = 1000000.0;
                    double amount = 0;

                    int choice;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Please choice (1-4): ");
                    choice = sc.nextInt();
                    switch(choice){
                              case 1: 
                                        System.out.printf("Your Balanced is: %f", Balanced);
                                        break;
                              case 2: 
                                        System.out.println("Enter amount to deposit money: ");
                                        amount = sc.nextDouble();
                                        if(amount > 0){
                                                  Balanced += amount;
                                                  System.out.printf("Deposit success!! New Balanced is: %.2f", Balanced);
                                        }else{
                                                  System.out.println("FAILED");
                                        }
                                        break;
                              case 3:
                                        System.out.println("Enter amount to withdraw money: ");
                                        amount = sc.nextDouble();
                                        if(amount > 0 && Balanced >= amount){
                                                  Balanced -= amount;
                                                  System.out.println("Withdraw success");
                                        }else{
                                                  System.out.println("please check your Balanced");
                                        }
                                        break;
                              case 4: 
                                        System.out.println("EXIT ATM BANKING, THANK YOU FOR USING");
                                        break;
                              default: 
                                        System.out.println("ERROR-PLEASE CHOICE AGAIN");
                                        break;
                    }
                    sc.close();
          }
}
