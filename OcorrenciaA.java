import java.util.Scanner;

public class OcorrenciaA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a String: ");
        String texto = sc.nextLine();
        boolean verificador = false;
        int cont = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                verificador = true;
                cont++;
            }
        }
        if (verificador) {
            System.out.println("A letra 'A' aparece " + cont + " vezes na String.");
        } else {
            System.out.println("A letra 'A' não aparece na String.");
        }
    }
}
