package TemplateMethodPattern.test1;

public class TemplateMethodPattern
{
    public static void main(String[] args)
    {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
        //((ConcreteClass) tm).show();
    }
}