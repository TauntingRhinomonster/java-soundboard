package components;
import java.util.HashMap;

public class SoundsDict {
    private HashMap<String, String> sounds;

    public SoundsDict() {
        sounds = new HashMap<>();

        sounds.put("5", "src/sounds/500-cigarettes-shortened.wav");
        sounds.put("F", "src/sounds/a-few-moments-later-sponge-bob-sfx-fun.wav");
        sounds.put("W", "src/sounds/anime-wow-sound-effect.wav");
        sounds.put("A", "src/sounds/anya-waka-kodumun.wav");
        sounds.put("C", "src/sounds/atla-secretunnel.wav");
        sounds.put("D", "src/sounds/attack-on-titan-rojo.wav");
        sounds.put("E", "src/sounds/avatar-intro-water-earth-fire-air.wav");
        sounds.put("G", "src/sounds/black-suit-spider-man.wav");
        sounds.put("B", "src/sounds/bone-crack.wav");
        sounds.put("H", "src/sounds/bonk_7zPAD7C.wav");
        sounds.put("I", "src/sounds/bruh-sound-effect_WstdzdM.wav");
        sounds.put("J", "src/sounds/downer_noise.wav");
        sounds.put("K", "src/sounds/dry-fart.wav");
        sounds.put("L", "src/sounds/dun-dun-dun-sound-effect-brass_8nFBccR.wav");
        sounds.put("Enter", "src/sounds/error_CDOxCYm.wav");
        sounds.put("N", "src/sounds/fortnite-death.wav");
        sounds.put("O", "src/sounds/heavenly-music-gaming-sound-effect-hd-mp3cut.wav");
        sounds.put("P", "src/sounds/i-dont-care-that-you-broke-your-elbow.wav");
        sounds.put("Q", "src/sounds/i-dont-like-sand_1qxxPuD.wav");
        sounds.put("R", "src/sounds/im-gonna-put-some-dirt-in-your-eye.wav");
        sounds.put("S", "src/sounds/im-spongebob.wav");
        sounds.put("T", "src/sounds/j-jonah-jameson-laugh-spiderman-2.wav");
        sounds.put("U", "src/sounds/jixaw-metal-pipe-falling-sound.wav");
        sounds.put("V", "src/sounds/loud-explosion.wav");
        sounds.put("X", "src/sounds/man-screaming-aaaah.wav");
        sounds.put("Y", "src/sounds/minecraft_click.wav");
        sounds.put("Z", "src/sounds/mr-sandman-audiotrimmer.wav");
        sounds.put("0", "src/sounds/oh-my-gah.wav");
        sounds.put("1", "src/sounds/punch-gaming-sound-effect-hd_RzlG1GE.wav");
        sounds.put("2", "src/sounds/rehehehe.wav");
        sounds.put("3", "src/sounds/run-vine-sound-effect.wav");
        sounds.put("4", "src/sounds/smoke-alarm-beep.wav");
        sounds.put("6", "src/sounds/strongpunch.wav");
        sounds.put("7", "src/sounds/the-very-best-of-willem-dafoes-green-goblin.wav");
        sounds.put("8", "src/sounds/vine-boom.wav");
        sounds.put("9", "src/sounds/yeah-boiii-i-i-i.wav");
        sounds.put("M", "src/sounds/yippeeeeeeeeeeeeee.wav");
    }

    public String getSound(String key) {
        return sounds.get(key);
    }

}
