import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (a == 0){
            if (b == 0) {
                System.out.println("Pt vo nghiem.");
            }else System.out.println("Pt co nghiem : " + (-c/b));
        }else {
            double delta = quadraticEquation.getDiscriminant();
            if (delta < 0){
                System.out.println("Pt vo nghiem.");
            }else if (delta == 0){
                System.out.println("Pt co nghiem : " + (-b/(2*a)));
            }else {
                System.out.println("Pt co 2 nghiem : R1= " + quadraticEquation.root1() + "va R2 = " + quadraticEquation.root2());
            }
        }

    }
}
