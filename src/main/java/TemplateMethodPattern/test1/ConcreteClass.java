package TemplateMethodPattern.test1;

//具体子类
class ConcreteClass extends AbstractClass
{
    public void abstractMethod1()
    {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2()
    {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void show(){
        System.out.println("我是具体类中的一个自己的方法");
    }
}