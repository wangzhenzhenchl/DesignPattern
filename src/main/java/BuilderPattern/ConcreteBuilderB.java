package BuilderPattern;

public class ConcreteBuilderB extends Builder
{
    public void buildPartA()
    {
        product.setPartA("ConcreteBuilderB: 建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartB("ConcreteBuilderB: 建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartC("ConcreteBuilderB: 建造 PartC");
    }
}
