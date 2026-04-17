import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        // Entrada
        p.nome = sc.nextLine();
        p.preco = sc.nextDouble();
        p.quantidade = sc.nextInt();
        int vendida = sc.nextInt();

        // Saída
        p.exibirAntes();
        p.vender(vendida);

        sc.close();
    }
}