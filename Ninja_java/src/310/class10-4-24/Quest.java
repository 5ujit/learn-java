import java.io.*;

public class Quest {
    public static void merged(String file1, String file2, String output) throws IOException {
        FileReader fs = new FileReader(file1);
        BufferedReader br = new BufferedReader(fs);
        String data = "";
        FileReader fs1 = new FileReader(file2);
        BufferedReader br1 = new BufferedReader(fs1);
        String data1 = "";
        FileWriter w1 = new FileWriter(output);
        BufferedWriter w1b = new BufferedWriter(w1);
        while ((data = br.readLine()) != null && (data1 = br1.readLine()) != null) {
            w1b.write(data1);
            w1b.write(data);
            w1b.newLine();
        }
        br.close();
        br1.close();
        w1b.close();
    }

    public static void main(String[] args) {
        try {
            merged("omm.txt", "omm1.txt", "omw.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading or writing files");
        }
    }
}