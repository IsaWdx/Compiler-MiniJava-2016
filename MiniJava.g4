grammar MiniJava;

goal:               mainClass (classDeclaration)* ;
mainClass:          'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}' ;
classDeclaration:   'class' identifier ( 'extends' identifier )? '{' varDeclaration* methodDeclaration* '}' ;
varDeclaration:     type identifier ';' ;
methodDeclaration:  'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' varDeclaration* statement* 'return' (intexpression|booleanexpression) ';' '}' ;
type:               ('int' '[' ']')       #arrayType
    |               'boolean'             #booleanType
    |               'int'                 #intType
    |               identifier            #identifierType
    ;
statement:          '{' statement* '}'    #braceStatement
         |          'if' '(' (intexpression|booleanexpression) ')' statement ('else' statement)?	#ifStatement
         |          'while' '(' (intexpression|booleanexpression) ')' statement						#whileStatement
         |          'System.out.println' '(' (intexpression|booleanexpression) ')' ';'				#printStatement
         |          identifier '=' (intexpression|booleanexpression) ';'							#assignStatement
         |          identifier '[' intexpression ']' '=' intexpression ';'							#assignArrayStatement
         ;
intexpression:      intexpression op=( '*' | '/' ) intexpression	#mulInt
             |      intexpression op=( '+' | '-' ) intexpression	#addInt
             |      intexpression '[' intexpression ']'				#arrayInt
             |      identifier '.' 'length'						    #lengthInt
             |      intexpression '.' identifier '(' ( (intexpression|booleanexpression) ( ',' (intexpression|booleanexpression) )* )? ')'	#methodInt
             |      INTEGER_LITERAL									#literalInt
             |      identifier										#identifierInt
             |      'this'											#thisInt
             |      'new' 'int' '[' intexpression ']'				#newArrayInt
             |      'new' identifier '(' ')'						#newIdentifierInt
             |      '(' intexpression ')'							#parenInt
             ;
booleanexpression:  booleanexpression '&&' booleanexpression		#andbbBoolean
                 |  booleanexpression '||' booleanexpression		#orbbBoolean
                 |  booleanexpression op=( '==' | '!=' ) booleanexpression		#equalbbBoolean
                 |  intexpression '&&' intexpression				#andiiBoolean
                 |  intexpression '||' intexpression				#oriiBoolean
                 |  intexpression op=( '>' | '<' | '>=' | '<=' | '==' | '!=' ) intexpression	#equaliiBoolean
                 |  intexpression '&&' booleanexpression			#andibBoolean
                 |  intexpression '||' booleanexpression			#oribBoolean
                 |  booleanexpression '&&' intexpression			#andbiBoolean
                 |  booleanexpression '||' intexpression			#orbiBoolean
                 |  'true'											#trueBoolean
                 |  'false'											#falseBoolean	
                 |  '!' (intexpression|booleanexpression)			#notBoolean
                 |  '(' booleanexpression ')'						#parenBoolean
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

