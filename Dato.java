public class Dato<T> {
     private T valor;

    public Dato(T valor) {
        this.valor = valor;
    }

    public void mostrar() {
        System.out.println("Tipo de dato: " + valor.getClass().getSimpleName());
        System.out.println("Valor ingresado: " + valor);
    }
}
