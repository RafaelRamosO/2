import java.util.Scanner;
    public class P3P10_1S21{
        public static double factorial(double a){
            double n=a;
            double r=0;
            double fac=1;
            for (double i=0;1<n;i++){
                fac *= i+1;
                r=(Math.pow(n,3)*fac);
                System.out.println(r);
            }
            return a;
        }
        public static double factorial_1(double a){
            double n=a;
            int fac=1;
            for (int i=0;i<n;i++){
                fac*=i+1;
            }
            System.out.println(fac);
            return a;
        }
        public static void main(String[] args) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingrese el valor para realizar la operacion: ");
            double a=teclado.nextInt();
            double acumulador=0;
            for (double i=0;i<a;i++){
                acumulador +=(factorial(a)/factorial_1(a));
                System.out.println("El resultado de la sumatoria es: "+acumulador);
            }
        }
    }