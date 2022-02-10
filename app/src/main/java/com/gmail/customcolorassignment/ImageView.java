package com.gmail.customcolorassignment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

public class ImageView extends SurfaceView {
    private ImageModel imageModel;
    Paint trunkPaint = new Paint();
    Paint leafPaint = new Paint();
    Paint skyPaint = new Paint();
    Paint grassPaint = new Paint();
    Paint sunPaint = new Paint();
    Paint cloudPaint = new Paint();
    View imageView = findViewById(R.id.imageView);


    public ImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        imageModel = new ImageModel();

        setWillNotDraw(false);

        trunkPaint.setColor(0xFF6E442A);
        trunkPaint.setStyle(Paint.Style.FILL);
        imageModel.setTrunkPaint(trunkPaint);
        leafPaint.setColor(0xFF008024);
        leafPaint.setStyle(Paint.Style.FILL);
        imageModel.setLeafPaint(leafPaint);
        grassPaint.setColor(0xFF0DBA3E);
        grassPaint.setStyle(Paint.Style.FILL);
        imageModel.setGrassPaint(grassPaint);
        skyPaint.setColor(0xFF005CF0);
        skyPaint.setStyle(Paint.Style.FILL);
        imageModel.setSkyPaint(skyPaint);
        sunPaint.setColor(0xFFE8F000);
        sunPaint.setStyle(Paint.Style.FILL);
        imageModel.setSunPaint(sunPaint);
        cloudPaint.setColor(0xFFFFFFFF);
        cloudPaint.setStyle(Paint.Style.FILL);
        imageModel.setCloudPaint(cloudPaint);
    }
public class drawSky {
    public void drawSky(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, (float) imageView.getRight(), (float) imageView.getBottom(), imageModel.getSkyPaint());

    }
}
public class drawTree {
    public void drawTree(Canvas canvas) {
        canvas.drawRect(180.0f, 250.0f, 230.0f, 520.0f, imageModel.getTrunkPaint());
    }

}
public class drawLeaves{
        public void drawLeaves(Canvas canvas){
            canvas.drawOval(110.0f, 150.0f, 300.0f, 330.0f, imageModel.getLeafPaint());
        }
}
public class drawLand {
    public void drawLand(Canvas canvas) {
        canvas.drawRect(0.0f, (float) imageView.getBottom() / 2.0f, (float) imageView.getRight(), (float) imageView.getBottom(), imageModel.getGrassPaint());
    }
}
public class drawSun {
    public void drawSun(Canvas canvas) {
        canvas.drawOval((float) imageView.getRight() - 170.0f, 30.0f, (float) imageView.getRight() - 30.0f, 170.0f, imageModel.getSunPaint());
    }
}
public class drawCloud {
    public void drawCloud(Canvas canvas, Paint cloudColor) {
        canvas.drawOval(580, 30, 720, 110, cloudColor);
        canvas.drawOval(600, 10, 700, 60, cloudColor);
        canvas.drawOval(580, 20, 620, 60, cloudColor);
        canvas.drawOval(670, 20, 720, 60, cloudColor);

        canvas.drawOval(1080, 40, 1220, 120, cloudColor);
        canvas.drawOval(1100, 20, 1200, 70, cloudColor);
        canvas.drawOval(1080, 30, 1120, 70, cloudColor);
        canvas.drawOval(1170, 30, 1220, 70, cloudColor);
    }
}
    public void onDraw(Canvas canvas){
        drawTree tree = new drawTree();
        drawCloud cloud = new drawCloud();
        drawSun sun = new drawSun();
        drawSky sky = new drawSky();
        drawLand land = new drawLand();
        drawLeaves leaves = new drawLeaves();

        sky.drawSky(canvas);
        sun.drawSun(canvas);
        land.drawLand(canvas);
        tree.drawTree(canvas);
        leaves.drawLeaves(canvas);
        cloud.drawCloud(canvas, imageModel.getCloudPaint());
    }
    public ImageModel getImageModel(){ return imageModel;}

}

