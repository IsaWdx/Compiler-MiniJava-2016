grammar MiniJava;

goal:               mainClass classDeclaration* ;
mainClass:          'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}' ;
classDeclaration:   'class' identifier ( 'extends' identifier )? '{' varDeclaration* methodDeclaration* '}' ;
varDeclaration:     type identifier ';' ;
methodDeclaration:  'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' varDeclaration* statement* 'return' (intexpression|booleanexpression) ';' '}' ;
type:               (('int' '[' ']')
    |               'boolean'
    |               'int'
    |               identifier)
    ;
statement:          '{' statement* '}'
         |          'if' '(' (intexpression|booleanexpression) ')' statement ('else' statement)?
         |          'while' '(' (intexpression|booleanexpression) ')' statement
         |          'System.out.println' '(' (intexpression|booleanexpression) ')' ';'
         |          identifier '=' (intexpression|booleanexpression) ';'
         |          identifier '[' intexpression ']' '=' intexpression ';'
         ;
intexpression:      intexpression op=( '*' | '/' ) intexpression
             |      intexpression op=( '+' | '-' ) intexpression
             |      intexpression '[' intexpression ']'
             |      intexpression '.' 'length'
             |      intexpression '.' identifier '(' ( (intexpression|booleanexpression) ( ',' (intexpression|booleanexpression) )* )? ')'
             |      INTEGER_LITERAL
             |      identifier
             |      'this'
             |      'new' 'int' '[' intexpression ']'
             |      'new' identifier '(' ')'
             |      '(' intexpression ')'
             ;
booleanexpression:  booleanexpression '&&' booleanexpression
                 |  booleanexpression '||' booleanexpression
                 |  booleanexpression op=( '==' | '!=' ) booleanexpression
                 |  intexpression '&&' intexpression
                 |  intexpression '||' intexpression
                 |  intexpression op=( '>' | '<' | '>=' | '<=' | '==' | '!=' ) intexpression
                 |  intexpression '&&' booleanexpression
                 |  intexpression '||' booleanexpression
                 |  booleanexpression '&&' intexpression
                 |  booleanexpression '||' intexpression
                 |  'true'
                 |  'false'
                 |  '!' (intexpression|booleanexpression)
                 |  '(' booleanexpression ')'
                 ;
identifier:         IDENTIFIER ;

MULTI:              '*';
DVIDE:              '/';
ADD:                '+';
MINUS:              '-';
EQUAL:              '==';
N_EQL:              '!=';
LRGER:              '>';
SMLLR:              '<';
L_EQL:              '>=';
S_EQL:              '<=';

COMMENTI:           '//' .*? '\n' -> skip ;
COMMENTII:          '/*' .*? '*/' -> skip ;
IDENTIFIER:         [a-zA-Z_][a-zA-Z0-9_]* ;
INTEGER_LITERAL:    [0-9]+ ;
WS:                 [ \t\r\n]+ -> skip ;

