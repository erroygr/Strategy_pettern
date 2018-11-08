package model;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy=strategy;
    }

    public String executeStrategy(String num1,String num2){
        return strategy.doOperation(num1, num2);
    }


}
