package com.technocrews.alquraninbangla;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Surah_activityURI extends AppCompatActivity {

    private Button b1, b2, b3, b4;


    private double startTime = 0;
    private double finalTime = 0;


    private int forwardTime = 5000;
    private int backwardTime = 5000;

    MediaPlayer mediaPlayer;


    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    private Button startBtn;
    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_activity_uri);



//        TextView textView = (TextView) findViewById(R.id.textView);


        int b = getIntent().getIntExtra("b", 0);
        int a = getIntent().getIntExtra("a", 0);
        int c = getIntent().getIntExtra("c", 0);
        int d = getIntent().getIntExtra("d", 0);
        int f = getIntent().getIntExtra("f", 0);


        if (f == 105) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.fil);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload105();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/105__sura_al_feel.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=105 ends

        if (f == 106) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kuraish);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload106();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/106_sura_al_quraish.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=106 ends


        if (f == 107) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.maun);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload107();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/107__sura_al_maun.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=107 ends

        if (f == 108) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kausar);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload108();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/108__sura_al_kausar.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e = 108 ends


        if (f == 109) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kafirun);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload109();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/109_sura__al_kaferoon.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=109 ends

        if (f == 110) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nasor);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload110();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/110_sura_an_nasr.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=110 ends

        if (f == 111) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.lahab);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload111();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/111_sura_al_lahab.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=111 ends

        if (f == 112) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ikhlas);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload112();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/112__sura_al_ikhlas.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=112 ends

        if (f ==113) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.falak);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload113();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/113_al_falaque.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=113 ends

        if (f == 114) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nas);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload114();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/114__sura_an_nas.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //e=114 ends



        if (a == 2) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.bakara);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload2();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/baqara.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     

                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=2 ends


        if (a == 3) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.imran);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload3();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/imran.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                      
                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=3 ends

        if (a == 4) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nisa);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload4();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/nisa.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=4 ends


        if (a == 5) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mayidah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload5();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/maeda.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=5 ends

        if (a == 6) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.anam);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload6();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/anam.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=6 ends


        if (a == 7) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.araf);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload7();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/araf.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=7 ends

        if (a == 8) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.anfal);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload8();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/8_surah_an_fal.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=8 ends


        if (a == 9) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.taubah);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload9();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/tawba.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=9 ends

        if (a == 10) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.eunus);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload10();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/10_surah_younus.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=10 ends


        if (a == 11) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hud);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload11();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/hood.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=11 ends

        if (a == 12) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.eusuf);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload12();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/12_surah_yousuf..mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=12 ends


        if (a == 13) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.rad);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload13();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/13_surah_ar_raad.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=13 ends

        if (a == 14) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ibrahim);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload14();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/14_surah_ibrahem.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=14 ends


        if (a == 15) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hijr);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload15();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/15__sura_al__hejr.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=15 ends


        if (a == 16) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nahol);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload16();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/16__sura_an_nahl_part1.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=16 ends


        if (a == 17) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.boni);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload17();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/bani.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=17 ends

        if (a == 18) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kahof);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload18();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/18__sura_al_kahf.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=18 ends


        if (a == 19) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.maryam);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload19();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/19__sura_maryam.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=19 ends

        if (a == 20) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.toaha);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload20();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/20_sura_ta-ha.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=20 ends


        if (a == 21) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.amibya);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload21();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/21_sura_al_ambia.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=21 ends

        if (a == 22) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hajj);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload22();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/22__sura_al_hajj.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=22 ends


        if (a == 23) {
//            textView.setText("সূরা আল-ইমরান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.muminun);
            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload23();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/23_sura_al_momenoon.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=23 ends

        if (a == 24) {
//            textView.setText("সূরা আল-বাকারা");

            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nur);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload24();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/24_sura_an_noor.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }    //a=24 ends


//25starts
        if (b == 25) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.forkan);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload25();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/25_sura_al_forqan.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=25 ends


        if (b == 26) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.suara);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload26();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/32_sura_ash_shoara.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=26 ends


        if (b == 27) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.namol);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload27();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/27_sura_an_naml.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=27 ends


        if (b == 28) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kasas);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload28();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/28_sura__al_qasas.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=28 ends


        if (b == 29) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ankabut);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload29();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/29__sura__a_l__ankaboot.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=29 ends


        if (b == 30) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.rum);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload30();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/30__sura_ar-rom.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=30 ends


        if (b == 31) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.lokman);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload31();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/31__sura_loqman.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=31 ends

        if (b == 32) {
//            textView.setText("সূরা আস্‌-সেজদাহ্");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.sejdah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload32();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();
            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/32_sura_as_sazda.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_SHORT).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    mediaPlayer.start();

                }


            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }  //  b=32 ends


        if (b == 33) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ahjab);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload33();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/33__sura_al__ahzab.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=33 ends


        if (b == 34) {
//            textView.setText("সূরা লোক্‌মান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.saba);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload34();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/34__sura_as_saba.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=34 ends


        if (b == 35) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.fatir);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload35();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/35__sura__fatar.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=35 ends


        if (b == 36) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.yasin);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload36();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/36__sura__yeasin.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=36 ends


        if (b == 37) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.saffat);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload37();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/37__sura_as__saffat.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=37 ends


        if (b == 38) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.sowad);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload38();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/38__sura__as__swad.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=38 ends


        if (b == 39) {
//            textView.setText("সূরা লোক্‌মান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.zumar);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload39();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/39_surah_ajjumar.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=39 ends


        if (b == 40) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mumin);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload40();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/40__sura_al__mumin.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=40 ends


        if (b == 41) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hamim);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload41();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/41__sura__ha-meem_as_sajdah.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=41 ends


        if (b == 42) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.assura);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload42();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/42.ashshura.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=42 ends


        if (b == 43) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.zukhruf);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload43();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/43._jukhrof.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=43 ends
        if (b == 44) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.dokhan);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload44();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/44__sura_ad_dokhan.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=44 ends


        if (b == 45) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.jasiyah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload45();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/45__sura__al__jasiah.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
////  b=45 ends


        if (b == 46) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ahkaf);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload46();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/46__sura_al_ahqaf.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=46 ends


        if (b == 47) {
//            textView.setText("সূরা লোক্‌মান");
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.muhammad);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload47();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/47__sura__mohmmed.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=47 ends


        if (b == 48) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.fath);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload48();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/48__sura__al_fath.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=48 ends


        if (b == 49) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hujurat);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload49();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/49__sura_hujurat.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=49 ends


        if (b == 50) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kaff);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload50();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/50__sura__quaf.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=50 ends


        if (b == 51) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.zariyat);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload51();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/51__sura__aj_jariat.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=51 ends

        if (c == 52) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.tur);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload52();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/52__sura_at_toor.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=52 ends

        if (c == 53) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.najom);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload53();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/53_sura_an_najm.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=53 ends

        if (c == 54) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kamar);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload54();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/54__sura_al_qamar.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=54 ends

        if (c == 55) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.rahman);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload55();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/55_ar_rahman.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=55 ends

        if (c == 56) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.wakiyah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload56();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/56__sura_al_waqea.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=56 ends

        if (c == 57) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hadid);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload57();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/57__sura_al_hadeed.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=57 ends

        if (c == 58) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mujadalah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload58();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/58__sura_al_mojadela.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=58 ends

        if (c == 59) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hashor);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload59();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/59__sura_al_hashr.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=59 ends

        if (c == 60) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mumtahinah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload60();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/60__sura_al_momtahan.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=60 ends

        if (c == 61) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.saf);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload61();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/61_sura_as__saf.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  b=61 ends

        if (c == 62) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.jumua);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload62();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/62__sura_al_jumua.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=62 ends

        if (c== 63) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.munafikun);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload63();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/63__sura_monafeqoon.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=63 ends

        if (c == 64) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.tagabun);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload64();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/64__sura_at_tagabon.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=64 ends

        if (c == 65) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.talak);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload65();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/65_sura_at_talaque.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=65 ends

        if (c == 66) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.tahrim);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload66();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/66__sura_at_tahreem.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=66 ends

        if (c == 67) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mulk);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload67();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/67_sura_al_mulk.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=67 ends

        if (c == 68) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kalam);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload68();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/68__sura_al_qalam.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=68 ends

        if (c == 69) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.hakkah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload69();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/69__sura__al_haqqah.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=69 ends

        if (c == 70) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.maarij);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload70();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/70__sura_al_marej.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=70 ends

        if (c == 71) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.nuh);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload71();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/71_sura_nuh.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }
//  c=71 ends

        if (c == 72) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.zin);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload72();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/72_sura_al_jin.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

        //  c=72 ends

        if (c == 73) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mujammil);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload73();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/73__sura_al_muzzammel.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }


        //  c=73 ends

        if (c == 74) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.muddasssir);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload74();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/74__sura_al_muddasser.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }


        //  c=74 ends

        if (c == 75) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.kiyamah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload75();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/75_sura_al_qeamah.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//c=75 ends



        if (d == 76) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.dahor);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload76();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/76_sura_ad_dahr.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=76 ends

        if (d == 77) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mursalat);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload77();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/77_sura_al_morsalat.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=77 ends

        if (d == 78) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.naba);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload78();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/78_naba.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=78 ends

        if (d == 79) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.najirat);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload79();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/79__sura_an_nazeat.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=79 ends

        if (d == 80) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.abasa);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload80();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/80__sura_abasa.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=80 ends

        if (d == 81) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.takbir);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload81();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/81_sura_at_takweer01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=81 ends

        if (d == 82) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.infitar);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload82();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/82__sura_al_infetar01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=82 ends

        if (d == 83) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.mutaffikin);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload83();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/83_sura_mutaeeffin01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=83 ends

        if (d == 84) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.inshikak);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload84();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/84_sura_al_insheqaq01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=84 ends


        if (d == 85) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.buruj);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload85();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/85__sura_al_buruj01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=85 ends

        if (d == 86) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.tarik);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload86();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/86_sura_at_tareq01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=86 ends

        if (d == 87) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.ala);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload87();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/87_sura_al_ala01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=87 ends

        if (d == 88) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.gashiyah);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload88();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/88_sura_al__ghshiah01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=88 ends

        if (d == 89) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.fajr);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload89();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/89_sura_al_fajar01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=89 ends


        if (d == 90) {
            ImageView image = (ImageView) findViewById(R.id.image);
            image.setImageResource(R.drawable.balad);

            startBtn = (Button) findViewById(R.id.download);
            startBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startDownload90();


                }
            });


            b1 = (Button) findViewById(R.id.forward);
            b2 = (Button) findViewById(R.id.pause);
            b3 = (Button) findViewById(R.id.play);
            b4 = (Button) findViewById(R.id.back);


            mediaPlayer = new MediaPlayer();

            try {
                //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
                mediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getPath() + "/90_sura_al_balad01.mp3");

//            mediaPlayer.prepare();
//            mediaPlayer.prepareAsync();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                mediaPlayer.prepare();
                Toast.makeText(getApplicationContext(), "You can play the Surah now", Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Please DOWNLOAD the file only once by pressing the download button", Toast.LENGTH_LONG).show();
            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mediaPlayer.start();
                }

            });

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
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

            Runnable UpdateSongTime = new Runnable() {
                public void run() {
                    startTime = mediaPlayer.getCurrentPosition();


                }
            };


        }

//d=90 ends






    }





//      async 31

    private void startDownload31() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRVGZKakt5UWI1d2M";
        new DownloadFileAsync31().execute(url);


    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_DOWNLOAD_PROGRESS:
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setMessage("Downloading file.PleaseWait..");
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                mProgressDialog.setCancelable(false);
                mProgressDialog.show();
                return mProgressDialog;
            default:
                return null;
        }
    }

    class DownloadFileAsync31 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/31__sura_loqman.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);




                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


//    async file 32


    private void startDownload32() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRaG5udUlYUW5zLVE";
        new DownloadFileAsync32().execute(url);
    }


    class DownloadFileAsync32 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/32_sura_ash_shoara.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 25

    private void startDownload25() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSFcxeEExM2FVcms";
        new DownloadFileAsync25().execute(url);
    }


    class DownloadFileAsync25 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/25_sura_al_forqan.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }






//    async 26

    private void startDownload26() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRaG5udUlYUW5zLVE";
        new DownloadFileAsync26().execute(url);
    }


    class DownloadFileAsync26 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/26_sura_ash_shoara.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

//    async 27

    private void startDownload27() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWTd1d1h0Q2Nfam8";
        new DownloadFileAsync27().execute(url);
    }


    class DownloadFileAsync27 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());

                OutputStream output = new FileOutputStream("/sdcard/27_sura_an_naml.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 28

    private void startDownload28() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUUl6NWtaRkh1ZXM";
        new DownloadFileAsync28().execute(url);
    }


    class DownloadFileAsync28 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/28_sura__al_qasas.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 29

    private void startDownload29() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRY3V6Rnc5R0xQZmM";
        new DownloadFileAsync29().execute(url);
    }


    class DownloadFileAsync29 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/29__sura__a_l__ankaboot.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 30

    private void startDownload30() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRNlBsRWQzRnk1TFE";
        new DownloadFileAsync30().execute(url);
    }


    class DownloadFileAsync30 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/30__sura_ar-rom.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 33

    private void startDownload33() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRcWN6Q3N1c3VDN0k";
        new DownloadFileAsync33().execute(url);
    }


    class DownloadFileAsync33 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/33__sura_al__ahzab.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 34

    private void startDownload34() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQ0JZenk5OUVSTDQ";
        new DownloadFileAsync34().execute(url);
    }


    class DownloadFileAsync34 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/34__sura_as_saba.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 35

    private void startDownload35() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRa0h5WFZCamVCbWc";
        new DownloadFileAsync35().execute(url);
    }


    class DownloadFileAsync35 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/35__sura__fatar.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 36

    private void startDownload36() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWGYtZ2hfbUd5Z0E";
        new DownloadFileAsync36().execute(url);
    }


    class DownloadFileAsync36 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/36__sura__yeasin.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 37

    private void startDownload37() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRYTZsZU1uRmxYWHc";
        new DownloadFileAsync37().execute(url);
    }


    class DownloadFileAsync37 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/37__sura_as__saffat.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 38

    private void startDownload38() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRblRkMXlJcVBvNDg";
        new DownloadFileAsync38().execute(url);
    }


    class DownloadFileAsync38 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/38__sura__as__swad.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 39

    private void startDownload39() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRS09QZjNuLVk0SDg";
        new DownloadFileAsync39().execute(url);
    }


    class DownloadFileAsync39 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/39_surah_ajjumar.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 40

    private void startDownload40() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSE9OWWFQMTZ1bGs";
        new DownloadFileAsync40().execute(url);
    }


    class DownloadFileAsync40 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/40__sura_al__mumin.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 41

    private void startDownload41() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSENfR0t6cTdEeUk";
        new DownloadFileAsync41().execute(url);
    }


    class DownloadFileAsync41 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/41__sura__ha-meem_as_sajdah.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 42

    private void startDownload42() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRcXU4Ql9TNzgxWkE";
        new DownloadFileAsync42().execute(url);
    }


    class DownloadFileAsync42 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/42.ashshura.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 43

    private void startDownload43() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQmJZS0NiRk02Y28";
        new DownloadFileAsync43().execute(url);
    }


    class DownloadFileAsync43 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/43._jukhrof.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 44

    private void startDownload44() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSGVkcFV0bzRmSnc";
        new DownloadFileAsync44().execute(url);
    }


    class DownloadFileAsync44 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/44__sura_ad_dokhan.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }




    //    async 105

    private void startDownload105() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRVUtGZlRtSkRETzQ";
        new DownloadFileAsync105().execute(url);
    }


    class DownloadFileAsync105 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/105__sura_al_feel.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 106

    private void startDownload106() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRRDUxYkttYUExZXc";
        new DownloadFileAsync106().execute(url);
    }


    class DownloadFileAsync106 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/106_sura_al_quraish.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 107

    private void startDownload107() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQ201Mlc5Z1FrX0U";
        new DownloadFileAsync107().execute(url);
    }


    class DownloadFileAsync107 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/107__sura_al_maun.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 108

    private void startDownload108() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRNHNyeTBTLUpwdGM";
        new DownloadFileAsync108().execute(url);
    }


    class DownloadFileAsync108 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/108__sura_al_kausar.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 109

    private void startDownload109() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUGlXS3FKQnE2YWM";
        new DownloadFileAsync109().execute(url);
    }


    class DownloadFileAsync109 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/109_sura__al_kaferoon.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 110

    private void startDownload110() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWkxncy1uYTQteWM";
        new DownloadFileAsync110().execute(url);
    }


    class DownloadFileAsync110 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/110_sura_an_nasr.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 111

    private void startDownload111() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRa3FGS2UxWHpNckE";
        new DownloadFileAsync111().execute(url);
    }


    class DownloadFileAsync111 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/111_sura_al_lahab.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 112

    private void startDownload112() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUnFHOHVBc0VHMDQ";
        new DownloadFileAsync112().execute(url);
    }


    class DownloadFileAsync112 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/112__sura_al_ikhlas.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 113

    private void startDownload113() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWVNURHJuQVFOWW8";
        new DownloadFileAsync113().execute(url);
    }


    class DownloadFileAsync113 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/113_al_falaque.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async 114

    private void startDownload114() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRYm1yRzA0c2pwbFU";
        new DownloadFileAsync114().execute(url);
    }


    class DownloadFileAsync114 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/114__sura_an_nas.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 45

    private void startDownload45() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQnpXWjV0N0U5UTg";
        new DownloadFileAsync45().execute(url);
    }


    class DownloadFileAsync45 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/45__sura__al__jasiah.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 46

    private void startDownload46() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRV0Z6Rmt4dnZqYlE";
        new DownloadFileAsync46().execute(url);
    }


    class DownloadFileAsync46 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/46__sura_al_ahqaf.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 47

    private void startDownload47() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRVVpZODluOGtvQ3M";
        new DownloadFileAsync47().execute(url);
    }


    class DownloadFileAsync47 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/47__sura__mohmmed.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 48

    private void startDownload48() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUjJJWmRaUVVuYkk";
        new DownloadFileAsync48().execute(url);
    }


    class DownloadFileAsync48 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/48__sura__al_fath.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 49

    private void startDownload49() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRc2FUNjhNRFNWQlk";
        new DownloadFileAsync49().execute(url);
    }


    class DownloadFileAsync49 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/49__sura_hujurat.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 50

    private void startDownload50() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUjdaV1N1WkZMU00";
        new DownloadFileAsync50().execute(url);
    }


    class DownloadFileAsync50 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/50__sura__quaf.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 51

    private void startDownload51() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQXhSMl9OMktBNW8";
        new DownloadFileAsync51().execute(url);
    }


    class DownloadFileAsync51 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/51__sura__aj_jariat.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 52

    private void startDownload52() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRYVBnaWtCUDZwRnM";
        new DownloadFileAsync52().execute(url);
    }


    class DownloadFileAsync52 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/52__sura_at_toor.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 53

    private void startDownload53() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRZ3RzM18wbkdKcTQ";
        new DownloadFileAsync53().execute(url);
    }


    class DownloadFileAsync53 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/53_sura_an_najm.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 54

    private void startDownload54() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRRldqcUllS0VxQmc";
        new DownloadFileAsync54().execute(url);
    }


    class DownloadFileAsync54 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/54__sura_al_qamar.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 55

    private void startDownload55() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRMjVsMzF0S2tZbmc";
        new DownloadFileAsync55().execute(url);
    }


    class DownloadFileAsync55 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/55_ar_rahman.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 56

    private void startDownload56() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xROV9UY0wxTUJOd0E";
        new DownloadFileAsync56().execute(url);
    }


    class DownloadFileAsync56 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/56__sura_al_waqea.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 57

    private void startDownload57() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRbkNHWlFUQUo0QXc";
        new DownloadFileAsync57().execute(url);
    }


    class DownloadFileAsync57 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/57__sura_al_hadeed.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 58

    private void startDownload58() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRZVBUcFFXLV96ekE";
        new DownloadFileAsync58().execute(url);
    }


    class DownloadFileAsync58 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/58__sura_al_mojadela.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 59

    private void startDownload59() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRV3U5aHhlMHV0ZDg";
        new DownloadFileAsync59().execute(url);
    }


    class DownloadFileAsync59 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/59__sura_al_hashr.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 60

    private void startDownload60() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xROXR4VDkyZHd1S0U";
        new DownloadFileAsync60().execute(url);
    }


    class DownloadFileAsync60 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/60__sura_al_momtahana.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 61

    private void startDownload61() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRLS1XcHRVMnNxNms";
        new DownloadFileAsync61().execute(url);
    }


    class DownloadFileAsync61 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/61_sura_as__saf.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 62

    private void startDownload62() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRZ3EtcTZ5dXRCdHM";
        new DownloadFileAsync62().execute(url);
    }


    class DownloadFileAsync62 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/62__sura_al_jumua.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 63

    private void startDownload63() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRb0w5dTFIQ3BDREE";
        new DownloadFileAsync63().execute(url);
    }


    class DownloadFileAsync63 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/63__sura_monafeqoon.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 64

    private void startDownload64() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWFB6bFlmelR4bUk";
        new DownloadFileAsync64().execute(url);
    }


    class DownloadFileAsync64 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/64__sura_at_tagabon.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 65

    private void startDownload65() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRN1BhbUZXTW9GZUE";
        new DownloadFileAsync65().execute(url);
    }


    class DownloadFileAsync65 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/65_sura_at_talaque.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 66

    private void startDownload66() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRMWZEZUM4YVNvTlE";
        new DownloadFileAsync66().execute(url);
    }


    class DownloadFileAsync66 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/66__sura_at_tahreem.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 67

    private void startDownload67() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRckE3YnNiZGFTdE0";
        new DownloadFileAsync67().execute(url);
    }


    class DownloadFileAsync67 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/67_sura_al_mulk.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 68

    private void startDownload68() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRYlhxYVRMMmVBZlE";
        new DownloadFileAsync68().execute(url);
    }


    class DownloadFileAsync68 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/68__sura_al_qalam.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 69

    private void startDownload69() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSmlueDNWNVpWaHc";
        new DownloadFileAsync69().execute(url);
    }


    class DownloadFileAsync69 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/69__sura__al_haqqah.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 70

    private void startDownload70() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRTXNoZTVkNFJaV1E";
        new DownloadFileAsync70().execute(url);
    }


    class DownloadFileAsync70 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/70__sura_al_marej.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 71

    private void startDownload71() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSUVmUDJTN2tGV0U";
        new DownloadFileAsync71().execute(url);
    }


    class DownloadFileAsync71 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/71_sura_nuh.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 72

    private void startDownload72() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRS2hIYTdVX3RUajg";
        new DownloadFileAsync72().execute(url);
    }


    class DownloadFileAsync72 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/72_sura_al_jin.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 73

    private void startDownload73() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSUdJMlJiRnpOdkU";
        new DownloadFileAsync73().execute(url);
    }


    class DownloadFileAsync73 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/73__sura_al_muzzammel.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 74

    private void startDownload74() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRU1A3NVRSb2Qzc3M";
        new DownloadFileAsync74().execute(url);
    }


    class DownloadFileAsync74 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/74__sura_al_muddasser.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 75

    private void startDownload75() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRbE83WmpQclhCMFE";
        new DownloadFileAsync75().execute(url);
    }


    class DownloadFileAsync75 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/75_sura_al_qeamah.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    //    async 76

    private void startDownload76() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRRHU2S0dLUDFMZVk";
        new DownloadFileAsync76().execute(url);
    }


    class DownloadFileAsync76 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/76_sura_ad_dahr.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 77

    private void startDownload77() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRd2oyUzJNamZ1RXc";
        new DownloadFileAsync77().execute(url);
    }


    class DownloadFileAsync77 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/77_sura_al_morsalat.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 78

    private void startDownload78() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRajk2VGZVZm1ETVU";
        new DownloadFileAsync78().execute(url);
    }


    class DownloadFileAsync78 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/78_naba.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 79

    private void startDownload79() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQlJVVms2QUw1SFU";
        new DownloadFileAsync79().execute(url);
    }


    class DownloadFileAsync79 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/79__sura_an_nazeat.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 80

    private void startDownload80() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRM1I4STZJbHZ0UlE";
        new DownloadFileAsync80().execute(url);
    }


    class DownloadFileAsync80 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/80__sura_abasa.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 81

    private void startDownload81() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRcEx6V0x2X0ItYmM";
        new DownloadFileAsync81().execute(url);
    }


    class DownloadFileAsync81 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/81_sura_at_takweer01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 82

    private void startDownload82() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRQmN6emJGMW4xX3M";
        new DownloadFileAsync82().execute(url);
    }


    class DownloadFileAsync82 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/82__sura_al_infetar01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 83

    private void startDownload83() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRakpOU3A2eXd5eDg";
        new DownloadFileAsync83().execute(url);
    }


    class DownloadFileAsync83 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/83_sura_mutaeeffin01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 84

    private void startDownload84() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUkRadEtJaFhWblk";
        new DownloadFileAsync84().execute(url);
    }


    class DownloadFileAsync84 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/84_sura_al_insheqaq01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 85

    private void startDownload85() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xROXFGQUVGdC1VREE";
        new DownloadFileAsync85().execute(url);
    }


    class DownloadFileAsync85 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/85__sura_al_buruj01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 86

    private void startDownload86() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRamNKWlZrY0FCREk";
        new DownloadFileAsync86().execute(url);
    }


    class DownloadFileAsync86 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/86_sura_at_tareq01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 87

    private void startDownload87() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRbGRvQzh2b1JSbnM";
        new DownloadFileAsync87().execute(url);
    }


    class DownloadFileAsync87 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/87_sura_al_ala01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 88

    private void startDownload88() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRV3ViSW5XbHJPNVU";
        new DownloadFileAsync88().execute(url);
    }


    class DownloadFileAsync88 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/88_sura_al__ghshiah01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 89

    private void startDownload89() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRN1pzWjBXOTdRb2s";
        new DownloadFileAsync89().execute(url);
    }


    class DownloadFileAsync89 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/89_sura_al_fajar01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async 90

    private void startDownload90() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRNUg2YjNfX3BGeFU";
        new DownloadFileAsync90().execute(url);
    }


    class DownloadFileAsync90 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/90_sura_al_balad01.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }





    //    async file 2


    private void startDownload2() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcSUlXN1FjUmdlOGc";
        new DownloadFileAsync2().execute(url);
    }


    class DownloadFileAsync2 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/baqara.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 3


    private void startDownload3() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcQV8tc25QNUc5NU0";
        new DownloadFileAsync3().execute(url);
    }


    class DownloadFileAsync3 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/imran.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 4


    private void startDownload4() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcdXlVRXZTb0xTRGM";
        new DownloadFileAsync4().execute(url);
    }


    class DownloadFileAsync4 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/nisa.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 5


    private void startDownload5() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcVGIwRG1LVkJ2MGc";
        new DownloadFileAsync5().execute(url);
    }


    class DownloadFileAsync5 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/maeda.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 6


    private void startDownload6() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcc0ZxdGtNOEVjb28";
        new DownloadFileAsync6().execute(url);
    }


    class DownloadFileAsync6 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/anam.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 7


    private void startDownload7() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcQnFYVkdyclhKeFk";
        new DownloadFileAsync7().execute(url);
    }


    class DownloadFileAsync7 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/araf.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 8


    private void startDownload8() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRTU9fR0lxb3c2VjA";
        new DownloadFileAsync8().execute(url);
    }


    class DownloadFileAsync8 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/8_surah_an_fal.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 9


    private void startDownload9() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcTE8wcDUwU0F3aGc";
        new DownloadFileAsync9().execute(url);
    }


    class DownloadFileAsync9 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/tawba.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 10


    private void startDownload10() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRTGdEdjE5NXJfa2s";
        new DownloadFileAsync10().execute(url);
    }


    class DownloadFileAsync10 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/10_surah_younus.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 11


    private void startDownload11() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcWHhWZFJOajJBWGM";
        new DownloadFileAsync11().execute(url);
    }


    class DownloadFileAsync11 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/hood.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 12


    private void startDownload12() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRWE4yMVFHVnZrM0E";
        new DownloadFileAsync12().execute(url);
    }


    class DownloadFileAsync12 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/12_surah_yousuf..mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 13


    private void startDownload13() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRN05iVUZDdklUR2c";
        new DownloadFileAsync13().execute(url);
    }


    class DownloadFileAsync13 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/13_surah_ar_raad.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 14


    private void startDownload14() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRSFNQOVNJZXl0aHc";
        new DownloadFileAsync14().execute(url);
    }


    class DownloadFileAsync14 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/14_surah_ibrahem.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 15


    private void startDownload15() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRNTE0TmRyQ1dpNVE";
        new DownloadFileAsync15().execute(url);
    }


    class DownloadFileAsync15 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/15__sura_al__hejr.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 16


    private void startDownload16() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRX2J4ZlhlZmk3UkU";
        new DownloadFileAsync16().execute(url);
    }


    class DownloadFileAsync16 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/16__sura_an_nahl_part1.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 17


    private void startDownload17() {
        String url = "https://drive.google.com/uc?export=download&id=0B0Q6CGO0cnJcVWVkVEZtbjlwMlk";
        new DownloadFileAsync17().execute(url);
    }


    class DownloadFileAsync17 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/bani.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {

                Toast.makeText(getApplicationContext(), "Turn your data connection ON", Toast.LENGTH_SHORT).show();
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 18


    private void startDownload18() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRbjVFWUdid3FHNGc";
        new DownloadFileAsync18().execute(url);
    }


    class DownloadFileAsync18 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/18__sura_al_kahf.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 19


    private void startDownload19() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xROUt1Q0JFRnZLZEk";
        new DownloadFileAsync19().execute(url);
    }


    class DownloadFileAsync19 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/19__sura_maryam.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 20


    private void startDownload20() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRaXdtQ1dBUjdDbVk";
        new DownloadFileAsync20().execute(url);
    }


    class DownloadFileAsync20 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/20_sura_ta-ha.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 21


    private void startDownload21() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xReGFKcC1qOEs3eXc";
        new DownloadFileAsync21().execute(url);
    }


    class DownloadFileAsync21 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/21_sura_al_ambia.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }




    //    async file 22


    private void startDownload22() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRUzlqZmp5XzlQWVU";
        new DownloadFileAsync22().execute(url);
    }


    class DownloadFileAsync22 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/22__sura_al_hajj.mp3");


                byte data[] = new byte[10024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }



    //    async file 23


    private void startDownload23() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRb21xOWNnaE5Eb3c";
        new DownloadFileAsync23().execute(url);
    }


    class DownloadFileAsync23 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/23_sura_al_momenoon.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }


    //    async file 24


    private void startDownload24() {
        String url = "https://drive.google.com/uc?export=download&id=0B-KR-fmDy8xRX0otdU9INXZnclE";
        new DownloadFileAsync24().execute(url);
    }


    class DownloadFileAsync24 extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(DIALOG_DOWNLOAD_PROGRESS);

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream("/sdcard/24_sura_an_noor.mp3");


                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                Intent i=getIntent();
                finish();
                startActivity(i);

                 output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", progress[0]);
            mProgressDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

    }

    protected void onDestroy(){
        super.onDestroy();
        // TODO Auto-generated method stub
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}



