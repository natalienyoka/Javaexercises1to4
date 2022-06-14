package javapkg;

import java.util.ArrayList;

public class Ex4arraylist1 {
    public static void main(String[] args) {

        ArrayList<String> New1 = new ArrayList<String>();
        New1.add("Thato");
        New1.add("Radha");
        New1.add("Rambuda");
        New1.add("Mark");
        New1.add("Kelesto");
        New1.add("Tata");
        New1.add("Nkose");

        for (int i=0; i<New1.size();i++) {
            System.out.println(New1.get(i));
        }
        System.out.println("**************Remove Mark and print**************");

        New1.remove("Mark");
        for (int i=0; i<New1.size();i++){
            System.out.println(New1.get(i));
        }
        System.out.println("**************Add Jacobs to second position***************");
        New1.add(1, "Jacobs");

        for (int i=0; i<New1.size(); i++) {
            System.out.println(New1.get(i));
        }
        System.out.println("***************Remove the element from index (4)***************");

        New1.remove(4);
        for (int i=0; i<New1.size();i++) {
            System.out.println(New1.get(i));
        }
    }
}
