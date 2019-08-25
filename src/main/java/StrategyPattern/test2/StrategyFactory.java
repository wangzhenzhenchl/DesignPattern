package StrategyPattern.test2;

import java.util.HashMap;

public class StrategyFactory {
    private HashMap<String,Strategy> strategyHashMap=new HashMap<>();

    public void put(String key,Strategy sy){
        strategyHashMap.put(key,sy);
    }
    //{
    //    strategyHashMap.put("a",new ConcreteStrategyA());
    //}
    public Strategy get(String key){
        return strategyHashMap.get(key);
    }
    public void strategyMethod(String key){
        get(key).strategyMethod();
    }
}
