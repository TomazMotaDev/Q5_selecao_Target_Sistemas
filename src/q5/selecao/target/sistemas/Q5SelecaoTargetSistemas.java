package q5.selecao.target.sistemas;

import java.util.Scanner;

public class Q5SelecaoTargetSistemas {

    public static void main(String[] args) {
        //o scanner para leitura do usuario no console
        Scanner in = new Scanner(System.in);
        
        //variaveis para a palavra e o resultado final
        String palavra, palavraFinal = "";
        
        //pedido para inserir uma palavra
        System.out.println("Insira uma palavra:");
        //quardando na variavel a palavra inserida
        palavra = in.nextLine();
        
        //leitura da variavel de acordo com seu tamanho a partir da ultima letra
        //guardar na palavra final as letras
        for (int i = palavra.length()-1; i >= 0; i--) {
            palavraFinal += palavra.charAt(i);
        }
        
        //mostrando na tela a palavra ao contrarioá
        System.out.println("O contrário de "+palavra+" é \""+palavraFinal+"\"");
    }
    
}
