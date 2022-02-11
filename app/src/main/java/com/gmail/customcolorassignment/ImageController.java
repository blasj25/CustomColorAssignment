package com.gmail.customcolorassignment;

import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/** @author Joshua Blas */

public class ImageController implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private ImageView imageView;
    private ImageModel imageModel;
    private TextView redText = null;
    private TextView greenText = null;
    private TextView blueText = null;
    private TextView selectedAreaTV = null;
    private SeekBar redSB = null;
    private SeekBar greenSB = null;
    private SeekBar blueSB = null;
    private float xCord = 0;
    private float yCord = 0;

    /**
     * ImageController ctor
     * @param initImageView
     * @param initRedTextView
     * @param initGreenTextView
     * @param initBlueText
     * @param initRedSeekBar
     * @param initGreenSeekBar
     * @param initBlueSeekBar
     * @param initSelectTextView
     */

    ImageController(ImageView initImageView, TextView initRedTextView, TextView initGreenTextView,
                    TextView initBlueText, SeekBar initRedSeekBar, SeekBar initGreenSeekBar,
                    SeekBar initBlueSeekBar, TextView initSelectTextView) {
        imageView = initImageView;
        imageModel = imageView.getImageModel();
        selectedAreaTV = initSelectTextView;
        greenText = initGreenTextView;
        blueText = initBlueText;
        redText = initRedTextView;
        redSB = initRedSeekBar;
        blueSB = initBlueSeekBar;
        greenSB = initGreenSeekBar;





    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        /**set the value and text of corresponding items*/
        if (seekBar.getId() == R.id.redSeekBar) {
            imageModel.setRed(i);
            this.redText.setText("" + i);

        } else if (seekBar.getId() == R.id.blueSeekBar) {
            imageModel.setBlue(i);
            this.blueText.setText("" + i);

        } else if (seekBar.getId() == R.id.greenSeekBar) {
            imageModel.setGreen(i);
            this.greenText.setText("" + i);
        }

        this.imageView.invalidate();
    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("viewTouchEvent", "touch noted");
        float x = motionEvent.getX();
        float y = motionEvent.getY();

        /** check what area the user is tapping*/
        imageModel.setXCord(x);
        imageModel.setYCord(y);
        xCord = x;
        yCord = y;

        /** set the values according to user touch input */

        /**
         * External Citation
         * Date: 09 Feb 2022
         * Problem: couldn't figure out how to pull RGB values from a paint object
         *
         * Resource:
         * https://developer.android.com/reference/android/graphics/Color
         * Solution: I used the Color.red()/.green()/.blue() to pull color values.
         */
        String location = "Select Area";
        if (xCord > 180 && xCord < 230 && yCord > 250 && yCord < 520) {
            location = "Trunk";

            int red = Color.red(imageModel.trunkPaint.getColor());
            int green = Color.green(imageModel.trunkPaint.getColor());
            int blue = Color.blue(imageModel.trunkPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());

        } else if (xCord > 110 && xCord < 300 && yCord < 330 && yCord > 150) {
            location = "Leaves";

            int red = Color.red(imageModel.leafPaint.getColor());
            int green = Color.green(imageModel.leafPaint.getColor());
            int blue = Color.blue(imageModel.leafPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        } else if (xCord > 1700 && xCord < 2000 && yCord > 30 && yCord < 170) {
            location = "Sun";

            int red = Color.red(imageModel.sunPaint.getColor());
            int green = Color.green(imageModel.sunPaint.getColor());
            int blue = Color.blue(imageModel.sunPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        } else if (xCord > 1050 && xCord < 1300 && yCord > 20 && yCord < 120) {
            location = "Clouds";

            int red = Color.red(imageModel.cloudPaint.getColor());
            int green = Color.green(imageModel.cloudPaint.getColor());
            int blue = Color.blue(imageModel.cloudPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        } else if (xCord > 650 && xCord < 800
                && yCord > 20 && yCord < 120) {
            location = "Clouds";

            int red = Color.red(imageModel.cloudPaint.getColor());
            int green = Color.green(imageModel.cloudPaint.getColor());
            int blue = Color.blue(imageModel.cloudPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        } else if (xCord > 0 && yCord < 300) {
            location = "Sky";

            int red = Color.red(imageModel.skyPaint.getColor());
            int green = Color.green(imageModel.skyPaint.getColor());
            int blue = Color.blue(imageModel.skyPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        } else if (xCord > 0 && yCord > 300) {
            location = "Grass";

            int red = Color.red(imageModel.grassPaint.getColor());
            int green = Color.green(imageModel.grassPaint.getColor());
            int blue = Color.blue(imageModel.grassPaint.getColor());
            imageModel.setRed(red);
            imageModel.setGreen(green);
            imageModel.setBlue(blue);

            this.redSB.setProgress((int)imageModel.getRed());
            this.greenSB.setProgress((int)imageModel.getGreen());
            this.blueSB.setProgress((int)imageModel.getBlue());
        }
        this.selectedAreaTV.setText(location);


        return true;
    }
}
