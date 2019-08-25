package TemplateMethodPattern.test3;

public class HookTemplateMethod
{
    public static void main(String[] args)
    {
        HookAbstractClass tm=new HookConcreteClass();
        tm.TemplateMethod();
        System.out.println("====================================");
        HookAbstractClass hookConcreteClass2 = new HookConcreteClass2();
        hookConcreteClass2.TemplateMethod();
    }

}