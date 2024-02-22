public class StrategyContext
{
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void searchStrategy()
    {
        if (strategy!=null)
        {
            strategy.strategy();
        }
        else {
            System.out.println("you have to search strategy");
        }
    }
}
