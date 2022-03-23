package Logical;

public class ReversalRecursive {
    public static String stringReversalRecursive(String str) {

        if (str.length() == 0) {
            return str;
        } else {

            return (str.charAt(str.length() - 1) + stringReversalRecursive(str.substring(0, str.length() - 1)));
        }
    }
    public static void main(String[] args){

        System.out.println(ReversalRecursive.stringReversalRecursive("Gav"));
        String str = "test";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(0,2));

    }
}
