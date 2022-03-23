package Logical;

public class Reversal {
    public static String stringReversal(String input) {
        String output = "";
        int size = input.length();
        for (int i = size - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            output = output + ch;
        }
        return output;
    }
    public static void main(String[] args) {
        String str = Reversal.stringReversal("Boot Camp");
        System.out.println(str);
    }
}
