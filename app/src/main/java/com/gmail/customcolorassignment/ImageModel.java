package com.gmail.customcolorassignment;


import android.graphics.Color;
import android.graphics.Paint;
import android.widget.SeekBar;

/** @author Joshua Blas */

public class ImageModel {
    Paint trunkPaint = new Paint();
    Paint leafPaint = new Paint();
    Paint skyPaint = new Paint();
    Paint grassPaint = new Paint();
    Paint sunPaint = new Paint();
    Paint cloudPaint = new Paint();
    float red = 0;
    float green = 0;
    float blue = 0;
    float xCord;
    float yCord;

    public void setXCord(float initX) {
        xCord = initX;
    }

    public void setYCord(float initY) {
        yCord = initY;
    }

    /**set the color according to the seekBar values*/
    public void setRed(float red) {
        this.red = red;
        int newColor = Color.rgb((int) red, (int) green, (int) blue);

        /**checks what location the user has selected*/
        if (xCord > 180 && xCord < 230 && yCord > 250 && yCord < 520) {
            trunkPaint.setColor(newColor);
        } else if (xCord > 110 && xCord < 300 && yCord < 330 && yCord > 150) {
            leafPaint.setColor(newColor);
        } else if (xCord > 1700 && xCord < 2000
                && yCord > 30 && yCord < 170) {
            sunPaint.setColor(newColor);
        } else if (xCord > 1050 && xCord < 1300
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 650 && xCord < 800
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 0 && yCord < 300) {
            skyPaint.setColor(newColor);
        } else if (xCord > 0 && yCord > 300) {
            grassPaint.setColor(newColor);
        }

    }

    public float getRed() {
        return red;
    }

    /** set the color according to the seekBar values */
    public void setGreen(float green) {
        this.green = green;


        int newColor = Color.rgb((int) red, (int) green, (int) blue);

        if (xCord > 180 && xCord < 230 && yCord > 250 && yCord < 520) {
            trunkPaint.setColor(newColor);
        } else if (xCord > 110 && xCord < 300 && yCord < 330 && yCord > 150) {
            leafPaint.setColor(newColor);
        } else if (xCord > 1700 && xCord < 2000
                && yCord > 30 && yCord < 170) {
            sunPaint.setColor(newColor);
        } else if (xCord > 1050 && xCord < 1300
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 650 && xCord < 800
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 0 && yCord < 300) {
            skyPaint.setColor(newColor);
        } else if (xCord > 0 && yCord > 300) {
            grassPaint.setColor(newColor);
        }


    }

    public float getGreen() {return green;}

    /** set the color according to the seekBar values */
    public void setBlue(float blue) {
        this.blue = blue;
        int newColor = Color.rgb((int) red, (int) green, (int) blue);

        if (xCord > 180 && xCord < 230 && yCord > 250 && yCord < 520) {
            trunkPaint.setColor(newColor);

        } else if (xCord > 110 && xCord < 300 && yCord < 330 && yCord > 150) {
            leafPaint.setColor(newColor);
        } else if (xCord > 1700 && xCord < 2000
                && yCord > 30 && yCord < 170) {
            sunPaint.setColor(newColor);
        } else if (xCord > 1050 && xCord < 1300
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 650 && xCord < 800
                && yCord > 20 && yCord < 120) {
            cloudPaint.setColor(newColor);
        } else if (xCord > 0 && yCord < 300) {
            skyPaint.setColor(newColor);
        } else if (xCord > 0 && yCord > 300) {
            grassPaint.setColor(newColor);
        }
    }

    public float getBlue() {
        return blue;
    }


    public void setTrunkPaint(Paint initTrunkPaint) {
        this.trunkPaint = initTrunkPaint;
    }


    public Paint getTrunkPaint() {
        return trunkPaint;
    }

    public void setLeafPaint(Paint initLeafPaint) {
        this.leafPaint = initLeafPaint;
    }

    public Paint getLeafPaint() {
        return leafPaint;
    }

    public void setSkyPaint(Paint initSkyPaint) {
        this.skyPaint = initSkyPaint;
    }

    public Paint getSkyPaint() {
        return skyPaint;
    }

    public void setGrassPaint(Paint grassPaint) {
        this.grassPaint = grassPaint;
    }

    public Paint getGrassPaint() {
        return grassPaint;
    }

    public void setSunPaint(Paint sunPaint) {
        this.sunPaint = sunPaint;
    }

    public Paint getSunPaint() {
        return sunPaint;
    }

    public void setCloudPaint(Paint cloudPaint) {
        this.cloudPaint = cloudPaint;
    }

    public Paint getCloudPaint() {
        return cloudPaint;
    }


}
