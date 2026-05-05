import java.util.Scanner;

public class The_Geometry_Consultant {
          public static void main(String[] args) {
                    System.out.println("Expert The Geometry Consultant");

                    float a, b, c;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter three sides of triangle (a b c)!!");
                    System.out.println("Enter a: ");
                    a = sc.nextFloat();

                    System.out.println("Enter b: ");
                    b = sc.nextFloat();

                    System.out.println("Enter c: ");
                    c = sc.nextFloat();

                    if(a + b > c && a + c > b && b + c > a){
                              if(a == b && b == c){
                                        System.out.println("\nEquilateral Triangle");
                              }else if(a == b || a == c || b == c){
                                        System.out.println("\nIsosceles Triangle");
                              }else if((a*a + b*b == c*c)||(a*a + c*c == b*b)||(b*b + c*c == a*a)){
                                        System.out.println("\nRight-angled Triangle");
                              }else{
                                        System.out.println("Scalene Triangle!");
                              }
                              double p = (a + b + c)/2;
                              double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                              System.out.printf("\nHeron's Area: %.2f", s);
                    }else{
                              System.out.println("These sides do not form a valid triangle!!");
                    }
                    sc.close();
          }
}