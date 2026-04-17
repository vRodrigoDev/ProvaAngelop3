import java.util.Scanner;
import java.util.Locale;

class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirAntes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque antes da venda: " + quantidade + " unidades");
    }

    void vender(int qtdVendida) {
        if (qtdVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidade -= qtdVendida;
            System.out.println("Venda realizada: " + qtdVendida + " unidades");
            System.out.println("Estoque atualizado: " + quantidade + " unidades");
        }
    }
}