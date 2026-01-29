import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private static final String FILE_NAME = "kasa_verisi.safe";

    public static void kaydet(ArrayList<PasswordEntry> liste) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (PasswordEntry e : liste) pw.println(e.toString());
        } catch (IOException e) { System.out.println("Kayıt Hatası!"); }
    }

    public static ArrayList<PasswordEntry> oku() {
        ArrayList<PasswordEntry> liste = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return liste;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 3) liste.add(new PasswordEntry(p[0], p[1], p[2]));
            }
        } catch (Exception e) { }
        return liste;
    }
}