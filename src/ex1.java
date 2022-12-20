public class ex1 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.viewCode();Example1.Set('e');
        System.out.println("Symbol code = " + Example1.getCodeSymbol());

        Example1.viewCode();
}
}
class Example {
    private char char1;
    public void Set(char ch) {
        this.char1 = ch;
    }
    public int getCodeSymbol() {
        return (int) char1;
    }
    public void viewCode() {
        System.out.println("symbol = " + char1);
        System.out.println("symbol = " + getCodeSymbol());
    }
}