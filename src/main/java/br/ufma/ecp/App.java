//https://code.visualstudio.com/docs/java/java-tutorial#_coding-pack-for-java
//https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code
//já tá reconhecendo inteiros, keywords, símbolos, identificadores, a única coisa que o professor deu a mais (do que o que foi visto em sala) foram as Strings, que ele também já reconhece agora
//não trabalharemos com o Parser por agora, e sim com o desenvolvimento do analisador léxico. (07/02/23)
package br.ufma.ecp;

import static br.ufma.ecp.token.TokenType.*;



import br.ufma.ecp.token.Token; 

public class App 
{

    
    public static void main( String[] args )
    {
        	
        String input = """
            /* incio do program
            bem simples
            */
            if (a > 10) // teste simples"
            {
                let a = a + 1;
            }
            /* acabou
            de verdade
            */
            while ( x > 6) {
                y = 56;
            }
            
            """;        
        
        Scanner scan = new Scanner (input.getBytes());

        for (Token tk = scan.nextToken(); tk.type != EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }

        /*
        Parser p = new Parser (input.getBytes());
        p.parse();
        */


        //Parser p = new Parser (fromFile().getBytes());
        //p.parse();

        /*
        String input = "489-85+69";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        Token tk = new Token(NUMBER, "42");
        System.out.println(tk);
        */
    }
}
