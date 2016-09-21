package com.kimhyojung.android.makecalculator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalculatorMain extends AppCompatActivity {

    Button answerButton;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);


        answerButton = (Button) findViewById(R.id.answerbutton);

        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);


    }


    public void moveNum1(View player) {
        String num = "1";
        int buttonx = (int)button1.getX();
        int buttony = (int)button1.getY();
        move(player, num, buttonx, buttony);
        button1.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum2(View player) {
        String num = "2";
        int buttonx = (int)button2.getX();
        int buttony = (int)button2.getY();
        move(player, num, buttonx, buttony);
        button2.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum3(View player) {
        String num = "3";
        int buttonx = (int)button3.getX();
        int buttony = (int)button3.getY();
        move(player, num, buttonx, buttony);
        button3.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum4(View player) {
        String num = "4";
        int buttonx = (int)button4.getX();
        int buttony = (int)button4.getY();
        move(player, num, buttonx, buttony);
        button4.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum5(View player) {
        String num = "5";
        int buttonx = (int)button5.getX();
        int buttony = (int)button5.getY();
        move(player, num, buttonx, buttony);
        button5.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum6(View player) {
        String num = "6";
        int buttonx = (int)button6.getX();
        int buttony = (int)button6.getY();
        move(player, num, buttonx, buttony);
        button6.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum7(View player) {
        String num = "7";
        int buttonx = (int)button7.getX();
        int buttony = (int)button7.getY();
        move(player, num, buttonx, buttony);
        button7.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum8(View player) {
        String num = "8";
        int buttonx = (int)button8.getX();
        int buttony = (int)button8.getY();
        move(player, num, buttonx, buttony);
        button8.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void moveNum9(View player) {
        String num = "9";
        int buttonx = (int)button9.getX();
        int buttony = (int)button9.getY();
        move(player, num, buttonx, buttony);
        button9.setText(num);
        opacity(player, 0);
        remove(player);
        inverseopacity(player, 1);
    }

    public void move(View player, String numanswer, int x, int y){

        int answerx = (int)(answerButton.getX()-x+answerButton.getWidth()/2-button1.getWidth()/2+50);
        int answery = (int)(answerButton.getY()-y+answerButton.getHeight()/2-button1.getHeight()/2+50);

        ObjectAnimator ani1 = ObjectAnimator.ofFloat(player,"translationX", answerx);
        ObjectAnimator ani2 = ObjectAnimator.ofFloat(player,"translationY", answery);

        AnimatorSet aniset = new AnimatorSet();
        aniset.setDuration(3000);
        aniset.playTogether(ani1, ani2);

        aniset.start();
        answerButton.setText(numanswer);

        answerx = 0;
        answery = 0;
        x=0;
        y=0;
    }

    public void opacity(View player, float p){
        ObjectAnimator ani = ObjectAnimator.ofFloat(player,"alpha", p);
        ani.setStartDelay(3010);
        ani.setDuration(1000);
        ani.start();
    }

    public void remove(View player){

        ObjectAnimator ani1 = ObjectAnimator.ofFloat(player,"translationX", 0);
        ObjectAnimator ani2 = ObjectAnimator.ofFloat(player,"translationY", 0);

        AnimatorSet aniset = new AnimatorSet();
        aniset.setStartDelay(4100);
        aniset.playTogether(ani1, ani2);

        aniset.start();
    }

    public void inverseopacity(View player, float p){
        ObjectAnimator ani = ObjectAnimator.ofFloat(player,"alpha", p);
        ani.setStartDelay(4500);
        ani.setDuration(1000);
        ani.start();
    }
}


