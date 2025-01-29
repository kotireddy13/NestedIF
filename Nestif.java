import java.util.Scanner;
public class Nestif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("A is max");
            }else{
                System.out.println("C is max");
            }
        }else{
            if(b>c){
                System.out.println("B is max");
            }else{
                System.out.println("C is max");
            }
        }
        }
    }


