package javapkg;

public class Ex4reverse5 {
    public static void main(String[] args) {
        String str = "Java training for testers";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed );
    }
    public static String reverseString(String str)
    {
     if (str.isEmpty())
         return str;

     return reverseString(str. substring(1)) + str. charAt(0);
    }
}
