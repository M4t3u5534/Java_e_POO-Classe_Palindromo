//NOME: Mateus Ribeiro Cerqueira
//RA: 10443901
//REFERÊNCIAS: https://www.guj.com.br/t/tirando-espacos-em-branco-com-metodo-trim/45589

class Palindromo {
    private String texto;

    public Palindromo(){
        texto = "";
    }

    public Palindromo(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        if(texto == null)
            this.texto = "";
        else
            this.texto = texto;
    }

    public boolean verificar(){
        String[] frase = texto.trim().split("");
        for(int i=0;i<frase.length/2;i++){
            if(!frase[i].equalsIgnoreCase(frase[frase.length - 1 - i]))
                return false;
        }
        return true;
    }
}