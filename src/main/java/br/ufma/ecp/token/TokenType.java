package br.ufma.ecp.token;

import java.util.List;
//import java.util.Map;

public enum TokenType {
        PLUS,MINUS, EQ, SEMICOLON,

        // Literals.
        NUMBER,
        IDENT,
        STRING,

        // keywords
        WHILE, CLASS,CONSTRUCTOR,FUNCTION,
        METHOD,FIELD,STATIC,VAR,INT,
        CHAR,BOOLEAN,VOID,TRUE,FALSE,
        NULL,THIS,LET,DO,IF,ELSE, RETURN,
        EOF,
     
        // symbols
        LPAREN,RPAREN,
        LBRACE, RBRACE,
        LBRACKET,RBRACKET,
        COMMA, DOT,
        ASTERISK, SLASH,
        AND, OR, NOT,
        LT, GT,
        ILLEGAL;



     static public boolean isSymbol (char c) {
        String symbols = "{}()[].,;+-*/&|<>=~";
        return symbols.indexOf(c) > -1;
    }


    static public boolean isKeyword (TokenType type) {
        List<TokenType> keywords  = 
            List.of(
                METHOD,
                WHILE,
                IF,
                CLASS,
                CONSTRUCTOR
            );
            return keywords.contains(type);
    }

}
