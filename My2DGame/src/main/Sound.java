package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.net.URL;

public class Sound {
    Clip clip;
    URL soundUrl[] = new URL[30];
    public Sound() {
        soundUrl[0] = getClass().getResource("/res/sound/main2.wav");
        soundUrl[1] = getClass().getResource("/res/sound/main.wav");
        soundUrl[2] = getClass().getResource("/res/sound/bossMain.wav");
        soundUrl[3] = getClass().getResource("/res/sound/coin.wav");
        soundUrl[4] = getClass().getResource("/res/sound/powerup.wav");
        soundUrl[5] = getClass().getResource("/res/sound/unlock.wav");
        soundUrl[6] = getClass().getResource("/res/sound/fanfare.wav");
        soundUrl[7] = getClass().getResource("/res/sound/bell.wav");
        soundUrl[8] = getClass().getResource("/res/sound/faster.wav");
        soundUrl[9] = getClass().getResource("/res/sound/run.wav");

    }
    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundUrl[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
        }
    }

    public void play() {
        clip.start();
    }

    public void setMainVolume() {
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-15);
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop() {
        clip.stop();
    }
}
