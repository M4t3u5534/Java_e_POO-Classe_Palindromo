//NOME: Mateus Ribeiro Cerqueira
//RA: 10443901
//REFERÊNCIAS: https://www.guj.com.br/t/tirando-espacos-em-branco-com-metodo-trim/45589
//             https://www.alura.com.br/artigos/trocando-caracteres-de-uma-string-no-java#:~:text=M%C3%A9todo%20replaceAll(),que%20passarmos%20por%20outro%20caractere.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verificacao = "";
        while(true){
            System.out.println("Informe um texto qualquer:");
            verificacao = scanner.nextLine();
            if(verificacao.equals("/sair"))
                break;
            Palindromo texto = new Palindromo(verificacao);
            System.out.println("O texto informado é um palindromo? " + texto.verificar());
        }
        scanner.close();
    }
}
