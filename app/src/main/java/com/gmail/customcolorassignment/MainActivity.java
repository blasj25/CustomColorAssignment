package com.gmail.customcolorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        setContentView(R.layout.activity_main);

        /**Create instances of views*/
        TextView redTV = findViewById(R.id.redVal);
        TextView greenTV = findViewById(R.id.greenVal);
        TextView blueTV = findViewById(R.id.blueVal);
        TextView selectedAreaTV = findViewById(R.id.selectedAreaTV);
        ImageView imageView = findViewById(R.id.imageView);
        SeekBar redSB = findViewById(R.id.redSeekBar);
        SeekBar greenSB = findViewById(R.id.greenSeekBar);
        SeekBar blueSB = findViewById(R.id.blueSeekBar);


        /**Add Controllers*/
        ImageController imageController = new ImageController(imageView, redTV, greenTV, blueTV,
                redSB, greenSB, blueSB, selectedAreaTV);


        imageView.setOnTouchListener(imageController);
        selectedAreaTV.setOnTouchListener(imageController);

        /**Red SeekBar*/

        redSB.setOnSeekBarChangeListener(imageController);
        imageView.getImageModel().setRed(redSB.getProgress());



        /**Green SeekBar*/

        greenSB.setOnSeekBarChangeListener(imageController);
        imageView.getImageModel().setGreen(greenSB.getProgress());



        /**Blue SeekBar*/

        blueSB.setOnSeekBarChangeListener(imageController);
        imageView.getImageModel().setBlue(blueSB.getProgress());



    }
}