import java.util.Scanner;

public class GPA_CALCULATOR {
          public static void main(String[] args) {
                    System.out.println("Today let's build your GPA with Toidicodelai!!");
                    System.out.println("\nEnter your Math, Physics and Chemistry scores: ");
                    float Math, Physics, Chemistry;
                    Scanner sc = new Scanner(System.in);

                    Math = sc.nextFloat();
                    Physics = sc.nextFloat();
                    Chemistry = sc.nextFloat();
                    // logic AVG scores
                    float Average_Scores = (Math + Physics + Chemistry) / 3;
                    System.out.printf("\nyour Average scores: %.2f", Average_Scores);

                    // Logic calculator GPA
                    float GPA = (Average_Scores / 10) * 4;
                    System.out.printf("\nYour GPA: %.2f", GPA);
                    sc.close();
          }
}
