import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("Employees.txt");
        if (!f.exists()) return;
        System.out.println("Done!");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details = bf.readLine();
            System.out.println(details);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}