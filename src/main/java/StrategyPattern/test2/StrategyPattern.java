package StrategyPattern.test2;


//测试类
public class StrategyPattern
{
    public static void main(String[] args)
    {

        StrategyFactory strategyFactory = new StrategyFactory();
        Strategy concreteStrategyA = new ConcreteStrategyA();
        Strategy concreteStrategyB = new ConcreteStrategyB();
        strategyFactory.put("a",concreteStrategyA);
        strategyFactory.put("b",concreteStrategyB);
        strategyFactory.get("a").strategyMethod();

    }
}