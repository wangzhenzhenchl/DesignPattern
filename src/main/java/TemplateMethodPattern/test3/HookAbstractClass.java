package TemplateMethodPattern.test3;

//含钩子方法的抽象类
abstract class HookAbstractClass
{
    public void TemplateMethod() //模板方法
    {
        abstractMethod1();
        HookMethod1();
        if(HookMethod2())
        {
            SpecificMethod();
        }
        abstractMethod2();
    }
    public void SpecificMethod() //具体方法
    {
        System.out.println("抽象类中的具体方法被调用...");
    }
    public void HookMethod1(){}  //钩子方法1
    public boolean HookMethod2() //钩子方法2
    {
        return true;
    }
    public abstract void abstractMethod1(); //抽象方法1
    public abstract void abstractMethod2(); //抽象方法2
}