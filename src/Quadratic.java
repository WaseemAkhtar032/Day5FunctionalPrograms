   /*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)

    */
    public class Quadratic {
        static double a = 2.3, b = 4, c = 5.6;
       static double root1, root2;
       public void quadRatic(){
           if (determinant > 0) {

               root1 = (-b + Math.sqrt(determinant)) / (2 * a);
               root2 = (-b - Math.sqrt(determinant)) / (2 * a);

               System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
           }

           else if (determinant == 0) {
               root1 = root2 = -b / (2 * a);
               System.out.format("root1 = root2 = %.2f;", root1);
           }

           else {

               double real = -b / (2 * a);
               double imag = Math.sqrt(-determinant) / (2 * a);
               System.out.format("root1 = %.2f+%.2fi", real, imag);
               System.out.format("\nroot2 = %.2f-%.2fi", real, imag);
           }
       }
       static double determinant = b * b - 4 * a * c;
        public static void main(String[] args) {
            Quadratic q  = new Quadratic();
            q.quadRatic();
        }
    }

