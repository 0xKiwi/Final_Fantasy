package src;

import javax.swing.JApplet;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.InputStream;
import java.net.URL;


public class Heal extends JApplet
{
	public Heal(){
		init();
	}
	
	public class Sound{
		public AudioClip song;
		public URL songPath;
		Sound(){try{songPath = new URL(getCodeBase(), "Heal.wav"); song = Applet.newAudioClip(songPath); }catch (Exception e) {} }
		
		public void playSoundOnce(){  try
		  {
		    InputStream inputStream = getClass().getResourceAsStream("Heal.wav");
		    AudioStream audioStream = new AudioStream(inputStream);
		    AudioPlayer.player.start(audioStream);
		  }
		  catch (Exception e)
		  {
		    
		  }}
	}
	public void init(){
		Sound test = new Sound();
		test.playSoundOnce();
	}

}