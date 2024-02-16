public class TenthTask
{
    static void tenthTask(int a)
    {
        int rows = a;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("reversed----");

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
