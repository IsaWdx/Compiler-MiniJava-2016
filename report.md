# ����ԭ�� MiniJava ������ǰ�˱���

Auther: 
������ 13307130444 
��Զ 12307130066

## Ŀ¼

* һ ��ĿҪ��������
* �� ��Ŀ����
* �� ANTLR����
* �� AST������
* �� �﷨�Ķ�˵��
* �� AST����
* �� ����������������鼰���ͼ��
* �� �������������ͼ�����
* �� ��Ŀ������


### һ ��ĿҪ��������
1. ��ȷ�Ĵʷ�/�﷨������������Ӧ���ķ��ļ�2�� ��  
    + MiniJava.g4
2. �����ȷ�ĳ����﷨��	5�� ��
    + testProgram �� 10 �������ļ������ɵ��﷨���� result ��
3. ��������
	1. ��ʾ�������ͣ��ʷ������﷨�����������ȣ�������λ�õ� 5�� ��
        + �ʷ������﷨����: ANTLRĬ����Ϊ
        + ͨ���﷨�����������ض����͵Ĵ���
        + �����������
        1.  ��������\��\����ʱ���ظ�������飬���Ա������������˴���
        2.  ʹ�ñ���\��\����ʱ�Ĵ����Լ�飬���Ա������������˴���
        3.  ��̳д���ѭ���̳С�δ�������ࣩ
        4.  �����Ƶ������ͼ�飺
            + �����
            + �����±�
            + '=' ��ֵ
            + .lengthֻ��������������
            +  ��������ֵ���Ͳ�ƥ��
        5.  ��������ʱ�������͡���Ŀ����
            + ����ʹ�ø����βεķ���������ʹ������ʵ��

	2. �����޸�  3��  ��  
        + ANTLRĬ����Ϊ single-token insertion and single-token deletion
4. ������������ʹ���������ƾ��� 5�� �� 
    + �޸����﷨��ʹ������������ȼ�����
    + ʵ���˱���\����\�������������ͼ��
    + �Լ̳����˴������ͼ��ʱ������ȷ����̳�
    + ����ʹ�ò�ͬ�����ĺ��������أ��ڵ��ú���ʱ��ȷ�����������
5. Project�ĵ�
    1. ʹ���﷨���ķ����ͣ����޸Ķ��﷨����θĶ��ȣ���������˵���� 5�� ��
        + ���޸ĵ��﷨�����˽���`
        + ��ʵ��������Ĵ�������˽���
	2. �Ա���Ŀ�﷨��ʹ�ù��ߵ���� 5�� �� 
        + ANTLR����
        + ��Ŀ������
	
###  �� ��Ŀ����
ʹ��ANTLR����,Ϊ MiniJava ����һ��������ǰ�ˣ�������� MiniJava ����ת��Ϊ�����﷨�����޸����﷨��ʹ������������ȼ����壻ʵ������\����\������������飬���ͼ�飬�����˱�������������ȷ����ͬ�����������أ���ȷ����̳У�

����������

����Ŀ������Э����
+ MacOS 10.12 bash / Windows10 64λ IntelliJ IDEA 14.1.3
+ Antlr 4.5.3

### �� ANTLR����
[ANTLR](www.antlr.org) (ANother Tool for language Recognition). ����Terence Parr(University of San Francisco).

+ ANTLR ����ʶ���һ������ (ANother Tool for Language Recognition ) ��һ�����Թ��ߣ����ṩ��һ����ܣ�����ͨ������ Java, C++, �� C# ������action�����﷨��������������ʶ�������������ͽ������� ��������ԵĽ����Ѿ������һ�ַǳ��ձ�Ĺ��������ⷽ������ۺ͹��߾����� 40 ��ķ�չ�Ѿ��൱���죬ʹ�� Antlr ��ʶ�𹤾���ʶ�𣬽�����������������ֹ���̸������ף�ͬʱ�����ĳ���Ҳ������ά����
+ �ʹ��������ʶ�𹤾�һ����Antlr ʹ���������޹��ķ��������ԡ����µ� Antlr ��һ������ LL(*) ������ʶ�������� Antlr ��ͨ�������û��Զ�����������޹��ķ����Զ����ɴʷ������� (Lexer)���﷨������ (Parser) ���������� (Tree Parser)��

<center> <img src="./img/overview.png"></center>

����ͼ��ʾ����Դ�ļ�ת����AST����Ҫһ�� Lexer �� Parser��Lexer ��Դ�ļ����룬�ֳ� token ���С�Ȼ�� Parser ���� Lexer ������ tokens ���� AST���� ANTLR �ṩ�� Lisenter �� Visitor ���ַ�ʽ�����������﷨����`����Ŀ��Ҫ���ý�����Visitor�ӿڱ��������﷨����ʵ�����Ϲ���`��

## �� AST������

<center> <img src="./img/gen.png"></center>

ANTLR��һ���Ƚϳ���Ĺ��ߣ�[�ٷ���ҳ](www.antlr.org) �Ͻ����� ANTLR �İ�װ����������Ŀ�ο���The Definitive ANTLR 4 Reference����

Ϊ������ AST����Ҫ��� grammer �����ļ� MiniJava.g4 . ����Ŀ������ķ��� Project Ҫ�������ͬ��Ϊ��ʹ������������ȼ����壬�� expression ������ϸ����Ϊ�����ͼ��ʱ�����㣬���﷨��boolean expression�����˷���չ����

	antlr4 MiniJava.g4 -visitor

�������ĵ����û����󣩺� ANTLR ���Զ�����

+ MiniJavaLexer.java
+ MiniJavaLexor.tokens
+ MiniJavaParser.java
+ MiniJavaBaseListener.java
+ MiniJavaListener.java
+ MiniJavaBaseVisitor.java
+ MiniJavaVisitor.java

���� MiniJavaLexer.java �� ANTLR �����﷨�����ļ� g4 ���ɵ�Lexer��

MiniJavaParser.java �Ƕ�Ӧ�� Parser��

MiniJavaVisitor.java ��ǰ���ᵽ�� Visitor ��ʽ�ĳ����﷨���Ľӿڣ�MiniJavaBaseBaseVisitor.java������ӿڵ�һ������ʵ�֡�����Ŀͨ���̳� MiniJavaBaseVisitor �������м�ķ���ʵ����Ҫ���ܡ�

	grun MiniJava program -tree test.minijava  # ����ı���Ϣ
	grun MiniJava program -gui test.minijava   # ����ͼ��

#### MiniJava.g4 �﷨�ļ�

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



### �� �﷨�Ķ�˵��
�﷨��γ�Ҫ�������ͬ���������¼���С�Ķ�

#### expression ���ֵ�չ��
+ Ϊ�˱��ڼ�����ͣ���expression��Ϊintexpression��booleanexpression���֣�����booleanexpression��Ϊ�ϸ񲼶����͡�
+ �������������ȼ����壬�� expression �������ʵ�չ�������ù������﷨�ļ��е��Ⱥ�˳��ȷ���Ⱥ�˳��ʹ�ü�������ȷ�Ľ���ԣ��磺  1 * 2 - 3 * 4 - (5 - 6) * 7 < 8 / 9 / 10 && 11 - 12 - 13 < 14 - 100

<img src="./img/expr.png">

### �� AST����

#### Usage: java MiniJava path/to/your/file (-c)
#### ��ʹ�ò���-cʱ������ĳ�ּ�������Ȼ������һ�ּ�黭��AST����֮�����м�����飬���޴��󻭳�AST.

### ���ʾ�� 1 testProgram/Factorial.txt
        class Factorial{
            public static void main(String[] a){
                System.out.println(new Fac().ComputeFac(10));
            }
        }

        class Fac {
            public int ComputeFac(int num){
                int num_aux ;
                if (num < 1) num_aux = 1 ;
                else num_aux = num * (this.ComputeFac(num-1)) ;
                return num_aux ;
            }
        }
        class Fat {
            int x;
            int y;
            int[] xarray;
            public int check_x(int num) {
                x = 100; // Can reach out to x.
                return x;
            }
            public int ComputeFat(int num){ // Actually return int[] later
                int z;
                int z;// Duplicate
                int x; // x in this method
                Fac f;
                Fat fake;
                f = new Fac();
                x = 100;
                y = 100!=5+5; // Type are inconsistent when using right priority for != and +
                x = f.ComputeFac(num);
                x = f.ComputeFat(num); // No such method
                y = fake.ComputeFac(num);
                x = f.ComputeFat(num); // No such method
                y = fake.ComputeFac(num); // No variable fake
                z = x.length; // .length only applicable to array
                y = xarray.length;
                return xarray;
         }
        }

<img src="./img/errors.jpg">
������Ϊֻ������������ANTLR4û�и������󴦣���ͼ����ȷ��mainclass��ASTͼ��
<img src="./img/mainclass.png">

### �� ������
#### MiniJava.javaͨ��Visitor���α���AST�������﷨�����飬����ͼ��
������Visitor�����α�����

#### OurMiniJavaVisitor00.java
* ��������class�����ƣ����������š�arrayType=0�� booleanType=1��intType = 2, illegalType = 3, ������Ϊ4������Ϊ5��6��7...
* ����Ϣ�洢��classMap, numberClassMap, classNumberMap, totalClassNumber�С�
* ����ظ������ࡣ

#### OurMiniJavaVisitor01.java
* ��¼���б��������������ͣ�����ظ�������
* ��¼���з����������䷵�����ͣ�����ظ���������¼�������β����ͣ���¼�β����ơ�
* ���ѭ���̳кͼ̳в����ڵ��ࡣ

#### OurMiniJavaVisitor02.java
* �����δ����ķ������á�����ʱ�������͡���Ŀ����
* �����δ����ı�����ʵ�Σ������ڵ�ǰ��������������ĳ�Ա������
* �����δ���������ʹ�á�
* ������expression�ķ���ֵ�������á���OurMiniJavaBaseListener��Ҳ�޸���һ���ַ���ֵ��
* (CANCELED) Check if there exists a child class instance as a member in a parent class, but the child could have a reference to its parent as a member var.
* ����˸�ֵʱ��ʽ�������Ͳ�ƥ�������
* ���㣨�Ӽ��˳��������ͼ��
* �����±�����ͼ��

## �� ��Ŀ������
+ ANTLR ��һ�ַ���ı�����ǰ�˿������ߡ�
+ ��֧�� BNF ��ʽ��ʹ����ƴʷ����ķ����������ס�
+ ANTLR ͨ�� LL(*) �������ķ���������ʹ��֧��һ���̶��ϵ���ݹ��ķ���������߽���˺ܶ�����
+ ANTLR ֧��һ���̶��ϵ������ķ�������������ʱ�����Ⱥ���˳������ȼ������ǳ�����
+ ANTLR �Ĵʷ��������﷨������Ĭ�ϵĴ�����ʹ���ʽ�������˹�����
+ ANTLR �ṩ�˱����﷨�����������ֽӿ� Listener �� Visitor ���Ա�����������ϵĶԳ����﷨�����б�������Ȼһ��ʼ���������ģʽ��̫��⣬��ͨ��ѧϰ�������Ĺ��̻��ǳ�ֵ���ᵽ�����ַ�ʽ�ı���ԣ���Ч�����˶����ɵĳ����﷨�����¶���ͷ�����
+ �����Ŀ��ʡ������һ��Ȥζ�Եģ��ر�����������ȼ��﷨������Ʊ�д������Ĳ���ʱ�������ڶ������ɹ��߲�̫��Ϥ�������˺ܳ�ʱ���ڶ� ANTLR ���ĵ��������ϣ���������ϻ����ϻ������ܶԷ��������ɹ�����һЩ����ϸ�Ľ��ܣ����ſ����Ĺ��̻���ӱ�����Ҳ��ʹ����������������