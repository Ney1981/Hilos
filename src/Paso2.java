import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.applet.AudioClip;

public class Paso2 extends Thread{
   
    @Override
    public void run(){   
        Scanner sou = new Scanner(System.in);
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Music.wav"));
        Sound.play();
    } 
}