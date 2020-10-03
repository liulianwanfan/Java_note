package TypesOfVariables;
/*
* Java 局部变量
局部变量声明在方法、构造方法或者语句块中；
局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
访问修饰符不能用于局部变量；
局部变量只在声明它的方法、构造方法或者语句块中可见；
局部变量是在栈上分配的。
局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。*/

//在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中。
public class Test {
    public void  pupAge(){
        int age = 0;//int age,  age 变量没有初始化，所以在编译时会出错
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }
    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
    }
}
