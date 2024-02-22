public class CarFabric implements AbstractFabric
{
    public CarFabric() {
    }

    @Override
    public Mercedes createMercedes()
    {
        return new Mercedes();
    }

    @Override
    public BMW createBMW()
    {
        return new BMW();
    }
}
