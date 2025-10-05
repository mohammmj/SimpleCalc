grammar SimpleCalc;

program
    : statement+
    ;

statement
    : variableDecl
    | assigment
    | whileLoop
    | printStmt
    ;

variableDecl
    : 'variable' ID '=' expr
    ;

assigment
    : ID '=' expr
    ;

whileLoop
    : 'while' condition 'do' statement+ 'end'
    ;

printStmt
    : 'print' expr
    ;

condition
    : expr compareOp expr
    ;

compareOp
    : '<' | '>' | '<=' | '>=' | '==' | '!='
    ;

expr
    : expr mulOp expr
    | expr addOp expr
    | ID
    | NUMBER
    | '(' expr ')'
    ;

addOp
    : '+' | '-'
    ;

mulOp
    : '*' | '/'
    ;

ID
     : [a-zA-Z_][a-zA-Z_0-9]*
     ;

NUMBER
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;