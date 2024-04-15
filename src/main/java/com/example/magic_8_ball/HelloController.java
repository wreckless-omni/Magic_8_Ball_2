package com.example.magic_8_ball;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.*;
import java.util.Random;
import java.util.Random;
import java.util.stream.Stream;
import javax.sound.sampled.*;



public class HelloController  {

    public TextField QuestionField;
    Random rand = new Random();
    @FXML
    private Label welcomeText;

    public HelloController() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
    }

    @FXML
    protected void onEnterButtonClick() throws LineUnavailableException, IOException {



        QuestionField.clear();
        String n = "No";
        String y = "Yes!";
        String m = "Maybe...";
        String a = "It's likely";
        String d = "I wouldn't tell anyone else you asked!";
        String ag = "I'm distracted, ask again...";
        String result = "I'm distracted, ask again";
        int x = 0;
        int upperbound = 7;

        int z = x;
        x = rand.nextInt(upperbound);

        while (x == z){
            x = rand.nextInt(upperbound);
        }



        switch (x){

            case 1: x = 1;
            result = n;
            break;

            case 2: x = 2;
                result = y;
                break;

                case 3: x = 3;
                result = m;
                break;

                case 4: x = 4;
                result = a;
                break;

            case 5: x = 5;
                result = d;
                break;

            default:
                result = ag;
                break;

        }

        welcomeText.setText(result);


     //   audiostuff




        try{
           /* File sound = new File ("C:\\Users\\justi\\SoftDev1 intellij project folder\\" +
                    "Magic_8_ball\\src\\fantasyclip.wav");*/
          //  File sound = new File ("C:\\Users\\justi\\SoftDev1 intellij project folder\\Magic_8_ball\\src\\main\\resources\\fantasyclip.wav");
           // AudioInputStream audioinput = AudioSystem.getAudioInputStream(sound);
            AudioInputStream audioinput = (AudioInputStream) getClass().getResourceAsStream("fantasyclip.wav");

            Clip c = AudioSystem.getClip();
            c.open(audioinput);
            c.start();
          //  Thread.sleep(2000);
           // c.close();


        } catch (Exception e) {e.printStackTrace();}
    }


}