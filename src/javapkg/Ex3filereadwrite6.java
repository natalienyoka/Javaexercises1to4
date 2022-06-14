package javapkg;

import javax.sql.rowset.spi.SyncFactory;
import java.io.*;

public class Ex3filereadwrite6 {
    public static void main(String[] args) throws IOException {
        String Test = "C:\\CAT\\exercise4.txt";
        File FC = new File(Test);
        FC.createNewFile();

        FileWriter file1 = new FileWriter(Test);
        BufferedWriter file2 = new BufferedWriter(file1);

        file2.write("Never eat Silk worms");
        file2.newLine();
        file2.write("Every dog has its own day");
        file2.newLine();
        file2.write("Experience is the teacher of all things ");
        file2.close();

        FileReader file3 = new FileReader(Test);
        BufferedWriter file4;



    }
}
