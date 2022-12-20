public class ex5 {
    public static void main(String[] args) {
        Example Ex1 = new Example(1);
        System.out.println("num = " + Ex1.PrintInt());

        Ex1.Set(2);
        System.out.println("num = " + Ex1.PrintInt());

        Ex1.Set(3);
        System.out.println("num = " + Ex1.PrintInt());

        Ex1.Set(-1);
        System.out.println("num = " + Ex1.PrintInt());

        Ex1.Set();
        System.out.println("num = " + Ex1.PrintInt());
    }

    static class Example {
        private int int1;

        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;

            if (n >= 2) {
                int1 = 2;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }

        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        public int PrintInt() {
            return int1;
        }

        Example(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}

