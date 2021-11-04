package com.a1_1801040009;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // handle button click

        Button btn1 = (Button)findViewById(R.id.h1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn1.startAnimation(animation);
            }
        });
        Button btn2 = (Button)findViewById(R.id.h2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn2.startAnimation(animation);
            }
        });
        Button btn3 = (Button)findViewById(R.id.h3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn3.startAnimation(animation);
            }
        });
        Button btn4 = (Button)findViewById(R.id.h4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn4.startAnimation(animation);
            }
        });
        Button btn5 = (Button)findViewById(R.id.h5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn5.startAnimation(animation);
            }
        });
        Button btn6 = (Button)findViewById(R.id.h6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn6.startAnimation(animation);
            }
        });
        Button btn7 = (Button)findViewById(R.id.h7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn7.startAnimation(animation);
            }
        });
        Button btn8 = (Button)findViewById(R.id.h8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn8.startAnimation(animation);
            }
        });
        Button btn9 = (Button)findViewById(R.id.h9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn9.startAnimation(animation);
            }
        });
        Button btn10 = (Button)findViewById(R.id.h10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn10.startAnimation(animation);
            }
        });
        Button btn11 = (Button)findViewById(R.id.h11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn11.startAnimation(animation);
            }
        });
        Button btn12 = (Button)findViewById(R.id.h12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn12.startAnimation(animation);
            }
        });
        Button btn13 = (Button)findViewById(R.id.h13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn13.startAnimation(animation);
            }
        });
        Button btn14 = (Button)findViewById(R.id.h14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn14.startAnimation(animation);
            }
        });
        Button btn15 = (Button)findViewById(R.id.h15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn15.startAnimation(animation);
            }
        });
        Button btn16 = (Button)findViewById(R.id.h16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn16.startAnimation(animation);
            }
        });
        Button btn17 = (Button)findViewById(R.id.h17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn17.startAnimation(animation);
            }
        });
        Button btn18 = (Button)findViewById(R.id.h18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn18.startAnimation(animation);
            }
        });
        Button btn19 = (Button)findViewById(R.id.h19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn19.startAnimation(animation);
            }
        });
        Button btn20 = (Button)findViewById(R.id.h20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn20.startAnimation(animation);
            }
        });
        Button btn21 = (Button)findViewById(R.id.h21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn21.startAnimation(animation);
            }
        });
        Button btn22 = (Button)findViewById(R.id.h22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn22.startAnimation(animation);
            }
        });
        Button btn23 = (Button)findViewById(R.id.h23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn23.startAnimation(animation);
            }
        });
        Button btn24 = (Button)findViewById(R.id.h24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn24.startAnimation(animation);
            }
        });
        Button btn25 = (Button)findViewById(R.id.h25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn25.startAnimation(animation);
            }
        });
        Button btn26 = (Button)findViewById(R.id.h26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn26.startAnimation(animation);
            }
        });
        Button btn27 = (Button)findViewById(R.id.h27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn27.startAnimation(animation);
            }
        });
        Button btn28 = (Button)findViewById(R.id.h28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn28.startAnimation(animation);
            }
        });
        Button btn29 = (Button)findViewById(R.id.h29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn29.startAnimation(animation);
            }
        });
        Button btn30 = (Button)findViewById(R.id.h30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn30.startAnimation(animation);
            }
        });
        Button btn31 = (Button)findViewById(R.id.h31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn31.startAnimation(animation);
            }
        });
        Button btn32 = (Button)findViewById(R.id.h32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn32.startAnimation(animation);
            }
        });
        Button btn33 = (Button)findViewById(R.id.h33);
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn33.startAnimation(animation);
            }
        });
        Button btn34 = (Button)findViewById(R.id.h34);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn34.startAnimation(animation);
            }
        });
        Button btn35 = (Button)findViewById(R.id.h35);
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn35.startAnimation(animation);
            }
        });
        Button btn36 = (Button)findViewById(R.id.h36);
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn36.startAnimation(animation);
            }
        });
        Button btn37 = (Button)findViewById(R.id.h37);
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn37.startAnimation(animation);
            }
        });
        Button btn38 = (Button)findViewById(R.id.h38);
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn38.startAnimation(animation);
            }
        });
        Button btn39 = (Button)findViewById(R.id.h39);
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn39.startAnimation(animation);
            }
        });
        Button btn40 = (Button)findViewById(R.id.h40);
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn40.startAnimation(animation);
            }
        });
        Button btn41 = (Button)findViewById(R.id.h41);
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn41.startAnimation(animation);
            }
        });
        Button btn42 = (Button)findViewById(R.id.h42);
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn42.startAnimation(animation);
            }
        });
        Button btn43 = (Button)findViewById(R.id.h43);
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn43.startAnimation(animation);
            }
        });
        Button btn44 = (Button)findViewById(R.id.h44);
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn44.startAnimation(animation);
            }
        });
        Button btn45 = (Button)findViewById(R.id.h45);
        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn45.startAnimation(animation);
            }
        });
        Button btn46 = (Button)findViewById(R.id.h46);
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn46.startAnimation(animation);
            }
        });
        Button btn47 = (Button)findViewById(R.id.k1);
        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn47.startAnimation(animation);
            }
        });
        Button btn48 = (Button)findViewById(R.id.k2);
        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn48.startAnimation(animation);
            }
        });
        Button btn49 = (Button)findViewById(R.id.k3);
        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn49.startAnimation(animation);
            }
        });
        Button btn50 = (Button)findViewById(R.id.k4);
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn50.startAnimation(animation);
            }
        });
        Button btn51 = (Button)findViewById(R.id.k5);
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn51.startAnimation(animation);
            }
        });
        Button btn52 = (Button)findViewById(R.id.k6);
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn52.startAnimation(animation);
            }
        });
        Button btn53 = (Button)findViewById(R.id.k7);
        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn53.startAnimation(animation);
            }
        });
        Button btn54 = (Button)findViewById(R.id.k8);
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn54.startAnimation(animation);
            }
        });
        Button btn55 = (Button)findViewById(R.id.k9);
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn55.startAnimation(animation);
            }
        });
        Button btn56 = (Button)findViewById(R.id.k10);
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn56.startAnimation(animation);
            }
        });
        Button btn57 = (Button)findViewById(R.id.k11);
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn57.startAnimation(animation);
            }
        });
        Button btn58 = (Button)findViewById(R.id.k12);
        btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn58.startAnimation(animation);
            }
        });
        Button btn59 = (Button)findViewById(R.id.k13);
        btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn59.startAnimation(animation);
            }
        });
        Button btn60 = (Button)findViewById(R.id.k14);
        btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn60.startAnimation(animation);
            }
        });
        Button btn61 = (Button)findViewById(R.id.k15);
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn61.startAnimation(animation);
            }
        });
        Button btn62 = (Button)findViewById(R.id.k16);
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn62.startAnimation(animation);
            }
        });
        Button btn63 = (Button)findViewById(R.id.k17);
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn63.startAnimation(animation);
            }
        });
        Button btn64 = (Button)findViewById(R.id.k18);
        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn64.startAnimation(animation);
            }
        });
        Button btn65 = (Button)findViewById(R.id.k19);
        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn65.startAnimation(animation);
            }
        });
        Button btn66 = (Button)findViewById(R.id.k20);
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn66.startAnimation(animation);
            }
        });
        Button btn67 = (Button)findViewById(R.id.k21);
        btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn67.startAnimation(animation);
            }
        });
        Button btn68 = (Button)findViewById(R.id.k22);
        btn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn68.startAnimation(animation);
            }
        });
        Button btn69 = (Button)findViewById(R.id.k23);
        btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn69.startAnimation(animation);
            }
        });
        Button btn70 = (Button)findViewById(R.id.k24);
        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn70.startAnimation(animation);
            }
        });
        Button btn71 = (Button)findViewById(R.id.k25);
        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn71.startAnimation(animation);
            }
        });
        Button btn72 = (Button)findViewById(R.id.k26);
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn72.startAnimation(animation);
            }
        });
        Button btn73 = (Button)findViewById(R.id.k27);
        btn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn73.startAnimation(animation);
            }
        });
        Button btn74 = (Button)findViewById(R.id.k28);
        btn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn74.startAnimation(animation);
            }
        });
        Button btn75 = (Button)findViewById(R.id.k29);
        btn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn75.startAnimation(animation);
            }
        });
        Button btn76 = (Button)findViewById(R.id.k30);
        btn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn76.startAnimation(animation);
            }
        });
        Button btn77 = (Button)findViewById(R.id.k31);
        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn77.startAnimation(animation);
            }
        });
        Button btn78 = (Button)findViewById(R.id.k32);
        btn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn78.startAnimation(animation);
            }
        });
        Button btn79 = (Button)findViewById(R.id.k33);
        btn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn79.startAnimation(animation);
            }
        });
        Button btn80 = (Button)findViewById(R.id.k34);
        btn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn80.startAnimation(animation);
            }
        });
        Button btn81 = (Button)findViewById(R.id.k35);
        btn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn81.startAnimation(animation);
            }
        });
        Button btn82 = (Button)findViewById(R.id.k36);
        btn82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn82.startAnimation(animation);
            }
        });
        Button btn83 = (Button)findViewById(R.id.k37);
        btn83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn83.startAnimation(animation);
            }
        });
        Button btn84 = (Button)findViewById(R.id.k38);
        btn84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn84.startAnimation(animation);
            }
        });
        Button btn85 = (Button)findViewById(R.id.k39);
        btn85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn85.startAnimation(animation);
            }
        });
        Button btn86 = (Button)findViewById(R.id.k40);
        btn86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn86.startAnimation(animation);
            }
        });
        Button btn87 = (Button)findViewById(R.id.k41);
        btn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn87.startAnimation(animation);
            }
        });
        Button btn88 = (Button)findViewById(R.id.k42);
        btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn88.startAnimation(animation);
            }
        });
        Button btn89 = (Button)findViewById(R.id.k43);
        btn89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn89.startAnimation(animation);
            }
        });
        Button btn90 = (Button)findViewById(R.id.k44);
        btn90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn90.startAnimation(animation);
            }
        });
        Button btn91 = (Button)findViewById(R.id.k45);
        btn91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn91.startAnimation(animation);
            }
        });
        Button btn92 = (Button)findViewById(R.id.k46);
        btn92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                btn92.startAnimation(animation);
            }
        });
    }

    // switch button animation

    public void kataClicked(View v) {
        Button button = (Button) findViewById(R.id.Kata2);
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.HiraganaLayout);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.KataganaLayout);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.VISIBLE);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sample_anim);
        button.startAnimation(animation);
    }

    public void hiraClicked(View v) {
        Button button = (Button) findViewById(R.id.Hira);
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.HiraganaLayout);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.KataganaLayout);
        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.GONE);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sample_anim);
        button.startAnimation(animation);
    }

}