package com.technocrews.alquraninbangla;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Instructions extends Activity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    Thread splashTread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        StartAnimations();



        TextView text1 = (TextView) findViewById(R.id.tv1);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        text1.setTypeface(font1);

        TextView text2 = (TextView) findViewById(R.id.link1);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        text2.setTypeface(font2);

        TextView text3 = (TextView) findViewById(R.id.link2);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        text3.setTypeface(font3);

        TextView text4 = (TextView) findViewById(R.id.tv2);
        Typeface font4 = Typeface.createFromAsset(getAssets(), "BenSenHandwriting.ttf");
        text4.setTypeface(font4);


        TextView myClickableUrl1 = (TextView) findViewById(R.id.link1);
        myClickableUrl1.setText("info@technocrews.com");
        Linkify.addLinks(myClickableUrl1, Linkify.EMAIL_ADDRESSES);

        TextView myClickableUrl2 = (TextView) findViewById(R.id.link2);
        myClickableUrl2.setText("www.facebook.com/TechnoCrews/");
        Linkify.addLinks(myClickableUrl2, Linkify.WEB_URLS);
    }


    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.textanime);
        anim.reset();
        LinearLayout lv=(LinearLayout) findViewById(R.id.animate);
        lv.clearAnimation();
        lv.startAnimation(anim);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 100000) {
                        sleep(30000);
                        waited += 100;
                    }
                    Intent intent = new Intent(Instructions.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Instructions.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Instructions.this.finish();
                }

            }
        };
        splashTread.start();

    }
}


