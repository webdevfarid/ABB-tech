public class PhoneNumber
{
    private String phoneNumber;
    public PhoneNumber(String number)
    {
        this.phoneNumber=number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        if (phoneNumber.matches("^\\+994 (50|51|55)\\d{3}-\\d{2}-\\d{2}$"))
        {
            this.phoneNumber = phoneNumber;
        } else
        {
            System.out.println("Invalid phone number ");
        }
    }





}
