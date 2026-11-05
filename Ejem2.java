public class Ejem2 {

    public void Suma() {
        int a = 7;
        int b = 3;
        int c = a + b;
        System.out.println("El valor de la Suma es " + c);
        mensaje();
    }

    public void mensaje() {
        System.out.println("Bienvenida a Estructura de datos");
    }

    public static void main(String args[]) {
        Ejem2 obj = new Ejem2();
        obj.Suma();
        obj.mensaje();
    }
}