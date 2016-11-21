package com.technocrews.alquraninbangla;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class OneFragment extends Fragment {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    int a;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one,null);


    }




    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);






        b1 = (ImageView) getView().findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 1;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("a", a);
                startActivity(i);
            }
        });

        b2 = (ImageView) getView().findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=2;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });

        b3 = (ImageView) getView().findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=3;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });

        b4 = (ImageView) getView().findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=4;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b5 = (ImageView) getView().findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=5;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b6 = (ImageView) getView().findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=6;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b7 = (ImageView) getView().findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=7;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b8 = (ImageView) getView().findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=8;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });



        b9 = (ImageView) getView().findViewById(R.id.btn9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=9;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b10 = (ImageView) getView().findViewById(R.id.btn10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=10;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b11 = (ImageView) getView().findViewById(R.id.btn11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=11;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b12 = (ImageView) getView().findViewById(R.id.btn12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=12;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b13 = (ImageView) getView().findViewById(R.id.btn13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=13;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b14 = (ImageView) getView().findViewById(R.id.btn14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=14;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b15 = (ImageView) getView().findViewById(R.id.btn15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=15;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b16 = (ImageView) getView().findViewById(R.id.btn16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=16;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b17 = (ImageView) getView().findViewById(R.id.btn17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=17;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b18 = (ImageView) getView().findViewById(R.id.btn18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=18;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b19 = (ImageView) getView().findViewById(R.id.btn19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=19;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b20 = (ImageView) getView().findViewById(R.id.btn20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=20;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b21 = (ImageView) getView().findViewById(R.id.btn21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=21;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b22 = (ImageView) getView().findViewById(R.id.btn22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=22;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });


        b23 = (ImageView) getView().findViewById(R.id.btn23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=23;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });
        b24 = (ImageView) getView().findViewById(R.id.btn24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=24;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("a",a);
                startActivity(i);
            }
        });
        

    }
    

    @Override
    public void onDestroy() {
        super.onDestroy();
        getActivity().finish();
    }


}