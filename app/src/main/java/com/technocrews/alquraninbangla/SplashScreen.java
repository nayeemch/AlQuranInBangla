package com.technocrews.alquraninbangla;


import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by nym
 */

public class SplashScreen extends Activity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    /**
     * Called when the activity is first created.
     */
    Thread splashTread;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        StartAnimations();

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        Typeface face1 = Typeface.createFromAsset(getAssets(), "Action_Force.ttf");
        tv1.setTypeface(face1);

        TextView tv2 = (TextView) findViewById(R.id.tv2);
        Typeface face2 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        tv2.setTypeface(face2);

        TextView tv3 = (TextView) findViewById(R.id.tv3);
        Typeface face3 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        tv3.setTypeface(face3);

//        TextView tv4 = (TextView) findViewById(R.id.dev);
//        Typeface face4 = Typeface.createFromAsset(getAssets(), "Underw.ttf");
//        tv4.setTypeface(face4);

        TextView tv5 = (TextView) findViewById(R.id.nym);
        Typeface face5 = Typeface.createFromAsset(getAssets(), "nym.TTF");
        tv5.setTypeface(face5);




    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l = (LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);


        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView lv1 = (ImageView) findViewById(R.id.team);
        lv1.clearAnimation();
        lv1.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        TextView lv2 = (TextView) findViewById(R.id.tv1);
        lv2.clearAnimation();
        lv2.startAnimation(anim);


        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 5500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(SplashScreen.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    SplashScreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    SplashScreen.this.finish();
                }

            }
        };
        splashTread.start();

    }
}

