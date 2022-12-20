public class ex2 {
    public void main(String[] args) {
        Example ex1 = new Example();
        ex1.Setch('A', 'Z');
        ex1.showCharArray();
    }
    class Example {
        private char char1;
        private char char2;
        public void Setch(char char1, char char2)
        {this.char1 = char1;this.char2 = char2;}
        public void showCharArray() {
            int num = char1;
            int num2 = char2;
            if (char1 > char2) {
                num = char2;
                num2 = char1;

            }
            int move = 1;
            for (int i = num; i <= num2; i++) {
                System.out.println(move + " symbol = " + (char) i);
                move++;
            }
        }
    }
}