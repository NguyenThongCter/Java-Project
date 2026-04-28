import java.util.Scanner;

public class SwapLogic {
          public static void main(String[] args) {
                    System.out.println("Tody with Toidicodelai make swap number");
                    int first_number, Second_number;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter first number = ");
                    first_number = sc.nextInt();

                    System.out.println("Enter Second number = ");
                    Second_number = sc.nextInt();

                    int temp = first_number;
                    first_number = Second_number;
                    Second_number = temp;
                    System.out.printf("\nThat number is swapped: %d %d", first_number, Second_number);
                    sc.close();
          }
}
