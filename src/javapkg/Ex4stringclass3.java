package javapkg;

import static java.lang.System.in;

public class Ex4stringclass3 {
    public static void main(String[] args) {
        String str1 = "Limpopo is far away from Gauteng";
        String Str2 = "Mpumalanga is the biggest province in South Africa";
        boolean equals1 = str1.length()== Str2.length();

        System.out.println("The index of letter s South Africa: " + Str2.indexOf("S",28));
        System.out.println("The index of the letter S in South Africa:" + str1.substring(17,35));

        //Compare the length of the two strings and provide a boolean results
        if ( str1.length()==str1.length())
        {
            System.out.println(equals1);
        }
        else
        {
            System.out.println(!equals1);
        }
        System.out.println("The index of the beginning of the word away in string 1: "+ str1.indexOf("a", 13));
        System.out.println("The index of the last occurrence of the word  in string2: "+ Str2.lastIndexOf("in")  );
    }
}
