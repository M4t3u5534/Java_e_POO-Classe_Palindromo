//NOME: Mateus Ribeiro Cerqueira
//RA: 10443901
//REFERÊNCIAS: https://www.guj.com.br/t/tirando-espacos-em-branco-com-metodo-trim/45589
//             https://www.alura.com.br/artigos/trocando-caracteres-de-uma-string-no-java#:~:text=M%C3%A9todo%20replaceAll(),que%20passarmos%20por%20outro%20caractere.

class Palindromo {
    private String texto;
    //Cronstrutor sem parâmetros, cria um objeto que contêm uma string vazia.
    public Palindromo(){
        texto = "";
    }
    //Cronstrutor que cria um objeto que contêm a string recebida como parâmetro do cronstrutor.
    public Palindromo(String texto){
        this.texto = texto;
    }
    //Metódos get e set.
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        if(texto == null)
            this.texto = "";
        else
            this.texto = texto;
    }
    //Método que verifica se a string é ou não um palíndromo.
    public boolean verificar(){
        //Chamada do método otimizar que retorna uma string otimizada para a verificação.
        char[] frase = otimizar();
        //Variável pontuação que recebe a quantidade de caracteres de pontuação da frase + 1.
        int pontuacao = 1 + frase[frase.length - 1];
        //Verificação da variável pontuação caso a frase não possua pontuação.
        if(pontuacao >= frase.length)
            pontuacao = 1;
        //Loop que verifica o palíndromo.
        for(int i=0;i<frase.length/2;i++){
            if(frase[i] != frase[frase.length - i - pontuacao])
                return false;
        }
        return true;
    }
    //Método para otimizar a string para a verificação.
    private char[] otimizar(){
        //Retira os espaços em branco e converte o texto para maiúsculo.
        texto = texto.toUpperCase();
        texto = texto.replaceAll(" ","");
        //Cria um array de char com o texto maiúsculo.
        char[] frase = texto.toCharArray();
        char[] digitos = new char[frase.length];
        int indice=0;
        int pontuacao=0;
        //Atribui um vetor com o texto sem pontuação.
        for(int i=0;i<frase.length;i++){
            if((int) frase[i] < 65){
                pontuacao++;
                continue;
            }
            else{
                digitos[indice] = frase[i];
                indice++;
            }
        }
        //Caso haja pontuação no texto inclui a quantidade de caracters de pontuação no espaço deixado pelas pontuações no final do vetor.
        if(pontuacao>0)
            digitos[indice] = (char) pontuacao;
        //Transforma letras com acentos nas letras correspondentes em acentuação.
        char[] acentos = {'Ç','Ä','Å','Á','Â','À','Ã','É','Ê','Ë','È','Í','Î','Ï','Ö','Ó','Ô','Ò','Õ','Ü','Ú','Û','Ù','Ñ','Ý'};
        for(int i=0;i<digitos.length;i++){
            for(int j=0;j<acentos.length;j++){
                if(digitos[i] == acentos[j]){
                    if(j==1)
                        digitos[i] = 'C';
                    else
                        if(j<7)
                            digitos[i] = 'A';
                        else
                            if(j<11)
                                digitos[i] = 'E';
                            else
                                if(j<15)
                                    digitos[i] = 'I';
                                else
                                    if(j<21)
                                        digitos[i] = 'O';
                                    else
                                        if(j<25)
                                            digitos[i] = 'U';
                                        else
                                            if(j==25)
                                                digitos[i] = 'N';
                                            else
                                                digitos[i] = 'Y';
                }
            }
        }
        //Retorna o vetor otimizado.
        return digitos;
    }
}