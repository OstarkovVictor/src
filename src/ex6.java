public class ex6 {
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size];
        char i = 'a';
        char ExChars [] = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int x = 0; x < chars.length; i++)
        {
            for (int y = 0; y < ExChars.length; y++)
            {
                if (i == ExChars[y]) {
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("Элемент массива ["+x+"] = " + chars[x]);
            x++;
        }
        System.out.println("конец массива\n");
    }




}

