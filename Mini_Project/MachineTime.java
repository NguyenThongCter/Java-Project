import java.util.Scanner;

public class MachineTime {
          public static void main(String[] args) {
                    System.out.println("\nTime Machine: Converting Seconds to H:M:S with Toidicodelai!");
                    int total_Seconds;
                    System.out.println("\nEnter total Seconds: ");
                    Scanner sc = new Scanner(System.in);
                    total_Seconds = sc.nextInt();

                    int hours = total_Seconds/3600;
                    int remaining_seconds = total_Seconds % 3600;
                    int minutes = remaining_seconds / 60;
                    int final_Seconds = remaining_seconds % 60;

                    System.out.printf("\nConverted Time: %02d:%02d:%02d\n", hours, minutes, final_Seconds);
                    sc.close();
          }
}
