import java.util.Scanner;

public class theConverter {
          public static void main(String[] args) {
                    System.out.println("THE CONVERTER PROGRAMS");
                    System.out.println("========= THE CONVERTER =========");
                    System.out.println("1. Currency (USD to VND)");
                    System.out.println("2. Temperature (C to F)");
                    System.out.println("3. Distance (m to cm/mm)");
                    System.out.println("4. EXIT PROGRAMS");

                    int choice;
                    Scanner sc = new Scanner(System.in);
                    choice = sc.nextInt();

                    switch(choice){
                              case 1: 
                                        System.out.println("Enter usd amount: ");
                                        double usd = sc.nextDouble();
                                        double vnd = usd * 25450;
                                        System.out.printf("%.2f USD = %,.0f VND", usd, vnd);
                                        break;
                              case 2: 
                                        System.out.println("Enter Celsius degree: ");
                                        double Celsius = sc.nextDouble();
                                        double fahrenheit = (Celsius * 9/5) + 32;
                                        System.out.printf("%.1f C = %.1f F", Celsius, fahrenheit);
                                        break;
                              case 3: 
                                        System.out.println("Enter Distance (meters): ");
                                        Double meters = sc.nextDouble();
                                        System.out.printf("%.2f m = %.2f cm\n", meters, meters * 100);
                                        System.out.printf("%.2f m = %.2f mm", meters, meters * 1000);
                                        break;
                              case 4: 
                                        System.out.println("GOOD BYE ! PROGRAMS EXITED");
                                        break;
                              default:
                                        System.out.println("ERROR CHECK YOUR CHOICE (1-4)");
                                        break;
                    }
                    sc.close();
          }
}