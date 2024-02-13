public class Product
{
    static  String companyName;
    int priductID;
    {
         priductID=1000;
    }
    {
        priductID++;
    }
    static
    {
        companyName="MyCompany";
    }
    {

    }

    public Product(String name)
    {

        this.companyName=name;

    }


    public static String getCompanyName() {
        return companyName;
    }
}
