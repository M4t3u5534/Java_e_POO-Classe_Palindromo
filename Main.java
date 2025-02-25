//NOME: Mateus Ribeiro Cerqueira
//RA: 10443901
//REFERÊNCIAS: https://www.guj.com.br/t/tirando-espacos-em-branco-com-metodo-trim/45589

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um texto qualquer:");
        Palindromo texto = new Palindromo(scanner.nextLine());
        System.out.println("O texto informado é um palindromo? " + texto.verificar());
        scanner.close();
    }
}
