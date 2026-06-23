package components;
import java.util.HashMap;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SoundsDict {
    private HashMap<String, String> sounds;

    public SoundsDict() {
        sounds = new HashMap<>();
    }

    public String getSound(String key) {
        return sounds.get(key);
    }

    public void setSound(String key, String value) {
        sounds.put(key, value);
    }

    // My SPECIAL Methods :D
    public static void insertNewSound(String key, String path){
        try {
            FileWriter writer = new FileWriter("sounds.txt", true);

            String keyPath = "\n" + key + "=" + path;
            writer.write(keyPath);

            writer.close();
            System.out.println("File written Successfully!");

        } catch (IOException e) {
            System.out.println("Something went awry...");
            e.printStackTrace();
        }
    }
    
    public static HashMap<String, String> getAllSounds() {
        HashMap<String, String> sounds = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(Path.of("sounds.txt"));

            for (String line : lines) {
                if (line.isBlank()) {
                    continue;
                }
                String[] parts = line.split("=", 2);
                String key = parts[0];
                String path = parts[1];
                sounds.put(key, path);
            }
            System.out.println("Files read Successfully!");
            System.out.println("Soundboard ready for use!");
            
        } catch (IOException e) {
            System.out.println("Error: Files could not be read...");
            e.printStackTrace();
        }
        return sounds;
    }
}

