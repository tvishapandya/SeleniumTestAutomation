package Logical;

public class LenString {

    public static int strlength(String input) {
        int count = 0;
        int i = 0;
        while (i >= 0) {
            try {
                input.charAt(i);
                count = count + 1;

            } catch (Exception e) {
                break;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = LenString.strlength("testIsMandatory And");
        System.out.println(n);
    }
}
