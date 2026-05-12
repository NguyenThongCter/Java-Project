import java.util.Scanner;

public class GeometryMenu {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int choice;

                    do{
                              System.out.println("--- GEOMETRY MENU ---");
                              System.out.println("1. Calculate Heron's Area");
                              System.out.println("2. Draw Star Triangle");
                              System.out.println("3. Exit");
                              System.out.println("Your choice: ");
                              choice = sc.nextInt();

                              switch(choice){
                                        case 1:
                                                  System.out.println("Running Hero Logic ......");
                                                  double a, b, c;
                                                  System.out.println("Enter a number: ");
                                                  a = sc.nextDouble();
                                                  System.out.println("Enter b number: ");
                                                  b = sc.nextDouble();
                                                  System.out.println("Enter c number: ");
                                                  c = sc.nextDouble();
                                                  if(a + b > c && a + c > b && b + c > a){
                                                            double p = (a + b + c)/2;
                                                            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                                                            System.out.printf("\nHeron Area : %.2f", s);
                                                  }
                                                  break;
                                        case 2:
                                                  System.out.println("Running Star triangle..........");
                                                  int n = 5;
                                                  for (int i = 1; i <= n; i++) {
                                                            for(int j = 1; j <= i; j++){
                                                                      System.out.printf("* ");
                                                            }
                                                            System.out.println();
                                                  }
                                                  break;
                                        case 3:
                                                  System.out.println("Bye bye");
                                                  break;
                                        default:
                                                  System.out.println("Error your choice");
                                                  break;
                              }
                    }while(choice != 3);
                    sc.close();
          }
}
