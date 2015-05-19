package src;

import javax.swing.JApplet;

import src.EnemyAttack2.Sound;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.InputStream;
import java.net.URL;


public class HitOrMiss extends JApplet
{
	
	public HitOrMiss(int value){
		init(value);
	}
	
	public class Hit{
		public AudioClip song;
		public URL songPath;
		Hit(){try{songPath = new URL(getCodeBase(), "Hit.wav"); song = Applet.newAudioClip(songPath); }catch (Exception e) {} }
		
		public void playSoundOnce(){  try
		  {
		    InputStream inputStream = getClass().getResourceAsStream("Hit.wav");
		    AudioStream audioStream = new AudioStream(inputStream);
		    AudioPlayer.player.start(audioStream);
		  }
		  catch (Exception e)
		  {
		    
		  }}
	}
	public class Miss{
		public AudioClip songx;
		public URL songPathx;
		Miss(){try{songPathx = new URL(getCodeBase(), "Miss.wav"); songx = Applet.newAudioClip(songPathx); }catch (Exception e) {} }
		
		public void playSoundOnce(){  try
		  {
		    InputStream inputStreamx = getClass().getResourceAsStream("Miss.wav");
		    AudioStream audioStreamx = new AudioStream(inputStreamx);
		    AudioPlayer.player.start(audioStreamx);
		  }
		  catch (Exception e)
		  {
		    
		  }}
	}
	public void init(int yes){
		if(yes == 1){
			Miss test = new Miss();
			test.playSoundOnce();
		}else{
			Hit test = new Hit();
			test.playSoundOnce();
		}	
		}
	}



