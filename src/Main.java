//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, suma, resta, multipl, raiz1, raiz2, seno, coseno;

        System.out.println("INGRESE EL PRIMER VALOR");
        numero1 = teclado.nextDouble();
        System.out.println("INGRESE EL SEGUNDO VALOR");
        numero2 = teclado.nextDouble();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multipl = numero1 * numero2;

        raiz1 = Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);

        seno = Math.sin(numero1);
        coseno = Math.cos(numero2);

        System.out.println("LA SUMA ES: " + suma);
        System.out.println("LA RESTA ES: " + resta);
        System.out.println("LA MULTIPLICACION ES: " + multipl);
        System.out.println("LA RAIZ CUADRADA DEL PRIMER VALOR ES: " + raiz1);
        System.out.println("LA RAIZ CUADRADA DEL SEGUNDO VALOR ES: " + raiz2);
        System.out.println("EL SENO DEL PRIMER VALOR ES: " + seno);
        System.out.println("EL COSENO DEL SEGUNDO VALOR ES: " + coseno);
    }
}


