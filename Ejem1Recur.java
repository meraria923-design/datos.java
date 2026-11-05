
public class Ejem1Recur {

    public Ejem1Recur(int a) {
        System.out.println("El factorial de " + a + " es: " + factorial(a));
    }

    private void suma(int a) {
      if (a<10) suma (a+1);
      else System.out.println("El valor es: " + a);
      System.out.println("El valor es: " + a);
    }

    private int factorial(int a) {
        if (a == 1) return 1;
        else return a * factorial(a - 1);
    }


    public static void main(String[] args) {
        new Ejem1Recur(10);  
    }
}