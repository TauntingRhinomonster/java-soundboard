package components;
import java.util.Scanner; 
import components.SoundsDict;

public class Menu {
    // Variables
    public String choice;

    // Consructor
    public Menu() {

    }

    // My Methods :D
    // This Method returns the menu the user will use to incorporate the logic
    public void menu(){
        System.out.println("What would you like to do?");
        System.out.println("1) Add new sound (Insert)");
        System.out.println("2) Map existing sound to different button (Swap).");
        System.out.print("Type 1 or 2, then press 'Enter': ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        System.out.println();
        switch (choice) {
            case "1":
                insertNewSound();
                break;
            case "2":
                swapSoundKey();
                break;
            default:
                System.out.println("Invalid input...");
                break;
        }
    
    }

    public void insertNewSound() {
        System.out.println("What sound would you like to insert?");
        System.out.print("Key: ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        System.out.print("Path: ");
        String path = scanner.nextLine();
        SoundsDict.insertNewSound(key, path); // Don't worry, this isn't recursion. They just have the same name okay...
        SoundsDict.getAllSounds();
    }
    
    public void swapSoundKey() {
        System.out.println("What keys would you like to swap?");
        System.out.print("First Key: ");
        System.out.println();
        String key1 = System.in.toString();
        System.out.print("Second Key: ");
        String key2 = System.in.toString();
    }
}
