package santana.alcebiades.exercicio8;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio8Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio8Application.class, args);

        int a = 10256, b = 512;

        System.out.println("\n\n======================== Exercicio 8 com valor acima de 1.000.000 ===============================");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Result: " + mixTwoNumbers(a, b));
        System.out.println("=================================================================================================");

        a = 135;
        b = 246;

        System.out.println("\n\n======================== Exercicio 8 com valor abaixo de 1.000.000 ==============================");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Result: " + mixTwoNumbers(a, b));
        System.out.println("=================================================================================================\n\n");

        new Scanner(System.in).nextLine();
    }

    private static int mixTwoNumbers(final int a, final int b) {

        String valueA = String.valueOf(a);
        String valueB = String.valueOf(b);

        /**
         * Considerando que os dois parametros de entrada sao inteiros, caso a
         * contatenacao dos dois passar de 7 digitos significa que o valor a ser
         * processado ja ultrapassou o valor maximo de 1.000.000, sendo assim
         * nao ha necessidade do processamento dos valores, neste caso o sistema
         * retorna o valor -1 conforme o requisito.
         */
        if ((valueA.concat(valueB)).length() > 7) {
            return -1;
        }

        int length = valueA.length() > valueB.length() ? valueA.length() : valueB.length();

        String valueC = "";

        for (int i = 0; i < length; i++) {
            if ((i + 1) <= valueA.length()) {
                valueC += valueA.charAt(i);
            }
            if ((i + 1) <= valueB.length()) {
                valueC += valueB.charAt(i);
            }
        }

        int ret = Integer.parseInt(valueC);

        return ret > 1000000 ? -1 : ret;
    }
}
