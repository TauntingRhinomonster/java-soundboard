// These are what AI gave me to download so that I could run the program globally
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.io.File;

import java.util.HashMap;

// These imports are for getting the sounds to be played.
import javax.sound.sampled.*;

import components.Menu;
// These are my PERSONAL imports.
import components.SoundsDict;

public class Main implements NativeKeyListener {
    private static HashMap<String, String> sounds;

    // THIS IS THE MAIN WHERE STUFF ACTUALLY HAPPENS
    public static void main(String[] args) {
        sounds = SoundsDict.getAllSounds();

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        
        GlobalScreen.addNativeKeyListener(new Main());

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        String soundURL = displaySoundUrl(returnKeyPress(e));
        playSound(soundURL);
    }

    public String returnKeyPress(NativeKeyEvent e) {
        String key = NativeKeyEvent.getKeyText(e.getKeyCode());
        return key;
    }
    // This class builds upon the returnKeyPress method
    public String displaySoundUrl(String key) {
        if (key.equals("Escape")) {
            Menu menu = new Menu();
            menu.menu();
        }
        String url = sounds.get(key);
        return url;
    }
    // Finally, play the sound so that the user can hear it.
    private Clip currentClip;
    public void playSound(String path) {
        if (path == null) {
            return;
        }
        try {
            if (currentClip != null && currentClip.isRunning()){
                currentClip.stop();
                File soundFile = new File(path);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                currentClip = AudioSystem.getClip();
                currentClip.open(audioStream);
                currentClip.start();
                return;
            }
            File soundFile = new File(path);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            currentClip = AudioSystem.getClip();
            currentClip.open(audioStream);
            currentClip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
    }
}