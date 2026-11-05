public class PrimerParcial {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Ingrese un valor.");
            return;
        }

        String entrada = args[0];

        if (entrada.matches("-?\\d+")) {

            Integer valor = Integer.parseInt(entrada);
            Dato<Integer> dato = new Dato<>(valor);
            dato.mostrar();

        } else if (entrada.matches("-?\\d+\\.\\d+[fF]")) {

            Float valor = Float.parseFloat(entrada);
            Dato<Float> dato = new Dato<>(valor);
            dato.mostrar();

        } else if (entrada.matches("-?\\d+\\.\\d+")) {

            Double valor = Double.parseDouble(entrada);
            Dato<Double> dato = new Dato<>(valor);
            dato.mostrar();

        } else if (entrada.length() == 1) {

            Character valor = entrada.charAt(0);
            Dato<Character> dato = new Dato<>(valor);
            dato.mostrar();

        } else {

            Dato<String> dato = new Dato<>(entrada);
            dato.mostrar();
        }
    }
}