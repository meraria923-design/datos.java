import java.util.Scanner;
public class Primero<T, U> {

    T valor1;

    U valor2;

    public Primero(T valor1, U valor2) {

        this.valor1 = valor1;

        this.valor2 = valor2;
        verificatipo();
    }
    public T getValor1() {
        return valor1;
    }
    public U getValor2() {
        return valor2;
    }
    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }
    public void setValor2(U valor2) {
        this.valor2 = valor2;
    }

    public void verificatipo () {
        if (valor1 instanceof String && valor2 instanceof String) {
            concatenar();
        } else if (valor1 instanceof Integer && valor2 instanceof Integer) {
            operaciones();
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
            operaciones();
        } else if (valor1 instanceof Boolean && valor2 instanceof Boolean) {
            System.out.println("Ambos valores son de tipo Boolean");
        } else if (valor1 instanceof Character && valor2 instanceof Character) {
            System.out.println("Ambos valores son de tipo Character");
        } else if (valor1 instanceof Float && valor2 instanceof Float) {
            operaciones();
        }
        else {
            System.out.println("Los valores son de tipos diferentes");
        }
    }
private void concatenar() {
        System.out.println("La concatenacion es: " + valor1.toString() + valor2.toString());
    }
 public void operaciones () {
        Scanner scanner = new Scanner(System.in);
        int opcion;
    }
      
    public void mostrarValores() {
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }

}
