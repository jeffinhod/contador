public class CalculaSoma {

    public static void main(String[] args) {
        int limite = 12;
        int resultado = 0;
        int contador = 1;

        while (contador < limite) {
            contador = contador + 1;
            resultado = resultado + contador;
        }

        System.out.println(resultado);
    }
}