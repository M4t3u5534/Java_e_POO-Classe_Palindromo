//NOME: Mateus Ribeiro Cerqueira
//RA: 10443901
//REFERÊNCIAS: https://www.guj.com.br/t/tirando-espacos-em-branco-com-metodo-trim/45589
//             https://www.alura.com.br/artigos/trocando-caracteres-de-uma-string-no-java#:~:text=M%C3%A9todo%20replaceAll(),que%20passarmos%20por%20outro%20caractere.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Criação da variável para verificar o texto digitado para continuar ou encerrar o programa.
        String verificacao = "";
        //Lopp que verifica e encerra o programa caso o usuário digite:/sair.
        while(true){
            //Input e criação do objeto texto da classe palíndromo.
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
