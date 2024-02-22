public class Main
{
    public static void main(String[] args)
    {
        System.out.println("---------Abstract fabric----------");
        CarFabric carFabric=new CarFabric();
       BMW bmw= carFabric.createBMW();
       Mercedes mercedes=carFabric.createMercedes();
       bmw.getInfo();
       mercedes.getInfo();

        System.out.println("---------Strategy----------");
        System.out.println("------using car strategy-------");
        StrategyContext strategyContext1=new StrategyContext();
        strategyContext1.setStrategy(new ByCar());
        strategyContext1.strategy.strategy();
        System.out.println("------using foot strategy-------");
        StrategyContext strategyContext2=new StrategyContext();
        strategyContext2.setStrategy(new OnFoot());
        strategyContext2.strategy.strategy();
        System.out.println("------using bicycle strategy-------");
        StrategyContext strategyContext3=new StrategyContext();
        strategyContext3.setStrategy(new ByBicycle());
        strategyContext3.strategy.strategy();
    }
}
