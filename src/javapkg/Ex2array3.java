package javapkg;

public class Ex2array3 {
    public static void main(String[] args) {
        String province[] = new String[7];

        province[0]="G";
        province[1]="L";
        province[2]="M";
        province[3]="W";
        province[4]="E";
        province[5]="F";
        province[6]="k";

        /*
        for(int r=0;r=<province.length;r++ )
        {
        System.out.printIn(province[r]);
        }
         */
        int r=0;
        do {
            System.out.println(province[r]);
            r++;
        }while (r<province.length);
    }
}
