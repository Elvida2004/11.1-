import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            File file = new File("D://ИС-3 АЛИЕВА//MyFile.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл успешно создан");
            } else {
                System.out.println("Файл уже существует");
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            int numberOfLines = 0;
            while ((line = br.readLine()) != null) {
                numberOfLines++;
                int numberOfCharacters = line.length();
                String[] words = line.split("\\s+");
                int numberOfWords = words.length;
                System.out.println("Строка " + numberOfLines + ": символов - " + numberOfCharacters + ", слов - " + numberOfWords);
            }
            System.out.println("Общее количество строк в файле: " + numberOfLines);

            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}