package BuilderPattern;

public class ConcreteBuilderA extends Builder
{
    public void buildPartA()
    {
        product.setPartA("ConcreteBuilderA: 建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartB("ConcreteBuilderA: 建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartC("ConcreteBuilderA: 建造 PartC");
    }
}
