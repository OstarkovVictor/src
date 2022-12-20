import java.util.*;
public class ex3 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите num");
            int num1 = id.nextInt();
            System.out.println("Введите num1");
            int num2 = id.nextInt();
            Example ex_1 = new Example();
            Example ex_2 = new Example(num1);
            Example ex_3 = new Example(num1,num2);
        }
        static class Example {
            private int privnum1;
            private int privnum2;
            Example(){
                System.out.println("Koнcтpyиpoвaниe без передачи аргумента");
            }

            Example(int exnum1){
                System.out.println("Koнcтpyиpoвaниe с передачей одного аргумента");
                this.privnum1 = exnum1;
                System.out.println("num1^num1 = "+ Exp1arg(exnum1)+"\n");
            }
            public int Exp1arg(int num1) {
                this.privnum1 = num1;
                int result=1;
                for (int i=1; i <= num1;i++) {
                    result = num1*result;
                }
                return result;
            }

            Example(int num1, int num2){
                System.out.println("Koнcтpyиpoвaниe с передачей двух аргументов");
                this.privnum1 = num1;
                this.privnum2 = num2;
                System.out.println("num1^num2 = "+ Exp2arg(num1,num2)+"\n");
            }
            public int Exp2arg(int n1, int n2){
                n1 = privnum1;
                n2 = privnum2;
                int result=1;
                for (int i = 1; i <= privnum2; i++) {
                    result = privnum1 *result;
                }
                return result;
            }
        }
    }