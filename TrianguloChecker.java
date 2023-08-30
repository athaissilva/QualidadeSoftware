public class TrianguloChecker {
   public static boolean verificaTriangulo(double lado1, double lado2, double lado3) {
       if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
           return false; // Lados não podem ser negativos ou zero
       }

       if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
           // Verifica a desigualdade triangular
           return true;
       }

       return false;
   }

   public static void main(String[] args) {
       double lado1 = 5.0;
       double lado2 = 4.0;
       double lado3 = 3.0;

       if (verificaTriangulo(lado1, lado2, lado3)) {
           System.out.println("Os lados formam um triângulo.");
       } else {
           System.out.println("Os lados não formam um triângulo.");
       }
   }
}