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

    }
}
