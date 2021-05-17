import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class TestFile {

    public static void main(String[] args) {

        ArrayList<Employees> es = new ArrayList<>();
        es.add(new Employees("001","A A A",100));
        es.add(new Employees("002","B B B",200));
        es.add(new Employees("003","C C C",300));

        File f = new File("employees2.txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employees x: es){
                pw.println(x.getId()+","+x.getName()+","+x.getSalary());
            }
            fw.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}