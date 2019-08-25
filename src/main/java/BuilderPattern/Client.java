package BuilderPattern;

public class Client
{
    public static void main(String[] args)
    {
        Builder builder=new ConcreteBuilderB();
        Director director=new Director(builder);

        Product product=director.construct();
        product.show();
    }
}