package com.example.simpleboardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    ImageView iv11, iv12, iv13, iv14, iv15,
            iv21, iv22, iv23, iv24, iv25,
            iv31, iv32, iv33, iv34, iv35,
            iv41, iv42, iv43, iv44, iv45,
            iv51, iv52, iv53, iv54, iv55;

    boolean actionUp, actionDown, actionLeft, actionRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_up).setOnTouchListener(this);
        findViewById(R.id.btn_down).setOnTouchListener(this);
        findViewById(R.id.btn_left).setOnTouchListener(this);
        findViewById(R.id.btn_right).setOnTouchListener(this);

    }

    public void movingTile() {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            switch (view.getId()) {
                case R.id.btn_up:
                    actionUp = true;
                    break;
                case R.id.btn_down:
                    actionDown = true;
                    break;
                case R.id.btn_left:
                    actionLeft = true;
                    break;
                case R.id.btn_right:
                    actionRight = true;
                    break;
            }
        } else {
            actionUp = false;
            actionDown = false;
            actionLeft = false;
            actionRight = false;
        }
        return true;
    }
}