import java.util.Scanner;

public class Academic_Advisor {
          public static void main(String[] args) {
                    System.out.println("Let's build Academic advisor with Java Language");
                    double gpa10, gpa4;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter average GPA(10): ");
                    gpa10 = sc.nextDouble();

                    // Calculate gpa4
                    gpa4 = (gpa10 / 10) * 4;
                    System.out.printf("My scores: %.2f", gpa4);


                    if(gpa4 >= 3.6){
                              System.out.println("\nYou excellent");
                    }else if(gpa4 >= 3.2){
                              System.out.println("\nGood boy");
                    }else if(gpa4 >= 2.5){
                              System.out.println("\nIt's okay");
                    }else if(gpa4 >= 2.0){
                              System.out.println("\nYou poor!!");
                    }else{
                              System.out.println("\nNeed study harder");
                    }
                    String Result = (gpa4 >= 2.0)?"PASSED":"FAILED";
                    System.out.println("Final Result: "+Result);

                    sc.close();
          }
}