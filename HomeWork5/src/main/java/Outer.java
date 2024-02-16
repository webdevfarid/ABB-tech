public class Outer
{
    static class Inner {
        private static int count = 0;

        public Inner()
        {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }
}
