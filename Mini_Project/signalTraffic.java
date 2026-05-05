import java.util.Scanner;

public class signalTraffic {
          public static void main(String[] args) {
                    System.out.println("Traffic lights programs!!");
                    int signal;
                    Scanner sc = new Scanner(System.in);

                    // Anoucement
                    System.out.println("1. GREEN LIGHT");
                    System.out.println("2. Yellow LIGHT");
                    System.out.println("3. Red Light");

                    System.out.println("Enter choice (1-3): ");
                    signal = sc.nextInt();

                    switch (signal) {
                              case 1:
                                        System.out.println("YOU CAN GO");
                                        break;
                              case 2: 
                                        System.out.println("SLOW VEHICLE");
                                        break;
                              case 3:
                                        System.out.println("STOP!!");
                                        break;
                              default:
                                        break;
                    }
                    sc.close();
          }
}
