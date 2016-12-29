# Compiler-MiniJava-2016
Compiler course 2016

gist: https://gist.github.com/taineleau/35e5de53e14770738ff4cf30cdce238d


### Visitor三次遍历

#### OurMiniJavaVisitor00
* 读入所有class的名称，给所有类编号。arrayType=0， booleanType=1，intType = 2, illegalType = 3, 主类编号为4，其他为5，6，7...
* 类信息存储在classMap, numberClassMap, classNumberMap, totalClassNumber中。
* 检查重复定义类。

#### OurMiniJavaVisitor01
* 记录所有变量声明及其类型，检查重复声明。
* 记录所有方法声明及其返回类型，检查重复声明。记录方法的形参类型，记录形参名称。
* 检查循环继承和继承不存在的类。

#### OurMiniJavaVisitor02
* 检查了未定义的方法调用。调用时参数类型、数目错误。
* 检查了未定义的变量、实参（定义在当前函数，或者是类的成员函数）
* 检查了未声明的类的使用。
* 对所有expression的返回值做了设置。（OurMiniJavaBaseListener中也修改了一部分返回值）
* Check if there exists a child class instance as a member in a parent class, but the child could have a reference to its parent as a member var.
* 检查了赋值时等式两边类型不匹配的问题
* 运算（加减乘除）的类型检查

### TODO
* 数组下标的类型检查

