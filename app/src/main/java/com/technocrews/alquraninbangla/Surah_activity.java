package com.technocrews.alquraninbangla;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Surah_activity extends Activity {

    static MediaPlayer mPlayer;

    TextView textView;

    private Button b1,b2,b3,b4;

    private MediaPlayer mediaPlayer;
    private double startTime = 0;
    private double finalTime = 0;

    private int forwardTime = 5000;
    private int backwardTime = 5000;
    int a,b,c,d,f;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_activity);

        textView=(TextView)findViewById(R.id.textView);



        int a = getIntent().getIntExtra("a", 0);
        int b = getIntent().getIntExtra("b", 0);
        int c = getIntent().getIntExtra("c", 0);
        int d = getIntent().getIntExtra("d", 0);
        int f = getIntent().getIntExtra("f", 0);

        if (a == 1) {
            textView.setText("সূরা ফাতিহা");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.fatiha);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.surah_fatiha);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int)startTime;

                    if((temp+forwardTime)<=finalTime){
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(),"You have Jumped forward",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Cannot jump forward",Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int)startTime;

                    if((temp-backwardTime)>0){
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(),"You have Jumped backward",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Cannot jump backward",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }



        if (d == 91) {
            textView.setText("সূরা আশ-শামস");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.shams);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_ash_shams);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int)startTime;

                    if((temp+forwardTime)<=finalTime){
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(),"You have Jumped forward",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Cannot jump forward",Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int)startTime;

                    if((temp-backwardTime)>0){
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(),"You have Jumped backward",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Cannot jump backward",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

        if (d == 92) {
            textView.setText("সূরা আল লাইল");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.lail);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_lail);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

            if (d == 93) {
                textView.setText("সূরা আদ-দুহা");
                ImageView image=(ImageView)findViewById(R.id.image);
                image.setImageResource(R.drawable.duha);

                b1 = (Button) findViewById(R.id.forward);
                b2 = (Button) findViewById(R.id.pause);
                b3 = (Button) findViewById(R.id.play);
                b4 = (Button) findViewById(R.id.back);

                mediaPlayer = MediaPlayer.create(this, R.raw.sura__ad_doha);

                b2.setEnabled(false);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();

                        finalTime = mediaPlayer.getDuration();
                        startTime = mediaPlayer.getCurrentPosition();


                        b2.setEnabled(true);
                        b3.setEnabled(false);
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                        mediaPlayer.pause();
                        b2.setEnabled(false);
                        b3.setEnabled(true);
                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int temp = (int) startTime;

                        if ((temp + forwardTime) <= finalTime) {
                            startTime = startTime + forwardTime;
                            mediaPlayer.seekTo((int) startTime);
                            Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int temp = (int) startTime;

                        if ((temp - backwardTime) > 0) {
                            startTime = startTime - backwardTime;
                            mediaPlayer.seekTo((int) startTime);
                            Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }


            if (d == 94) {
                textView.setText("সূরা আল ইনশিরাহ");
                ImageView image=(ImageView)findViewById(R.id.image);
                image.setImageResource(R.drawable.inshirah);

                b1 = (Button) findViewById(R.id.forward);
                b2 = (Button) findViewById(R.id.pause);
                b3 = (Button) findViewById(R.id.play);
                b4 = (Button) findViewById(R.id.back);

                mediaPlayer = MediaPlayer.create(this, R.raw.sura_al__insherah);

                b2.setEnabled(false);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();

                        finalTime = mediaPlayer.getDuration();
                        startTime = mediaPlayer.getCurrentPosition();


                        b2.setEnabled(true);
                        b3.setEnabled(false);
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                        mediaPlayer.pause();
                        b2.setEnabled(false);
                        b3.setEnabled(true);
                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int temp = (int) startTime;

                        if ((temp + forwardTime) <= finalTime) {
                            startTime = startTime + forwardTime;
                            mediaPlayer.seekTo((int) startTime);
                            Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int temp = (int) startTime;

                        if ((temp - backwardTime) > 0) {
                            startTime = startTime - backwardTime;
                            mediaPlayer.seekTo((int) startTime);
                            Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        if (d == 95) {
            textView.setText("সূরা আত্‌-ত্বীন");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.tin);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_at_teen);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (d == 96) {
            textView.setText("সূরা আলাক্");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.alak);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_alaque);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 97) {
            textView.setText("সূরা ক্বদর");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.kodor);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_qadar);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 98) {
            textView.setText("সূরা বাইয়্যিনাহ্");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.baiyenah);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_bayenah);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 99) {
            textView.setText("সূরা যিলযাল");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.zilzal);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_az_zelzal);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 100) {
            textView.setText("সূরা আল-আদিয়াত");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.adiyat);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_adiat);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 101) {
            textView.setText("সূরা ক্বারিয়াহ");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.kariyah);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_alqaria);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 102) {
            textView.setText("সূরা তাকাসুর");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.takasur);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_at_takasur);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 103) {
            textView.setText("সূরা আছর");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.asor);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_asar);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (f == 104) {
            textView.setText("সূরা হুমাযাহ্");
            ImageView image=(ImageView)findViewById(R.id.image);
            image.setImageResource(R.drawable.humajah);

            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);

            mediaPlayer = MediaPlayer.create(this, R.raw.sura_al_humazah);

            b2.setEnabled(false);

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();


                    b2.setEnabled(true);
                    b3.setEnabled(false);
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    b2.setEnabled(false);
                    b3.setEnabled(true);
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp + forwardTime) <= finalTime) {
                        startTime = startTime + forwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped forward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump forward", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int temp = (int) startTime;

                    if ((temp - backwardTime) > 0) {
                        startTime = startTime - backwardTime;
                        mediaPlayer.seekTo((int) startTime);
                        Toast.makeText(getApplicationContext(), "You have Jumped backward", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot jump backward", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


        }


    protected void onDestroy() {
        super.onDestroy();
        // TODO Auto-generated method stub
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}
