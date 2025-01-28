import java.util.Scanner;
public class Quadratic {
public double[] findRoots(double a, double b, double c) {
double delta = Math.pow(b, 2) - 4 * a * c;
if (delta > 0) {
double root1 = (-b + Math.sqrt(delta)) / (2 * a);
double root2 = (-b - Math.sqrt(delta)) / (2 * a);
return new double[]{root1, root2};
} else if (delta == 0) {
double root = -b / (2 * a);
return new double[]{root};
} else {
return new double[0];
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of a: ");
double a = sc.nextDouble();
System.out.print("Enter value of b: ");
double b = sc.nextDouble();
System.out.print("Enter value of c: ");
double c = sc.nextDouble();
Quadratic quadratic = new Quadratic();
double[] roots = quadratic.findRoots(a, b, c);
if (roots.length == 0) {
System.out.println("No real roots.");
} else {
System.out.print("Roots: ");
for (double root : roots) {
System.out.print(root + " ");
}
System.out.println();
}
sc.close();
}
}
