package com.technocrews.alquraninbangla;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FiveFragment extends Fragment {
    ImageView b97, b98, b99, b100, b101, b102, b103, b104, b105, b106, b107, b108, b109, b110, b111, b112, b113, b114;


    int f;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_five, null);
    }







    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView instructions = (TextView) getView().findViewById(R.id.one);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "BenSenHandwriting.ttf");
        instructions.setTypeface(font1);


    final Button instruction= (Button)getView().findViewById(R.id.one);
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),Instructions.class);
                startActivity(intent);
            }
        });

        b97 = (ImageView) getView().findViewById(R.id.btn97);
        b97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 97;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b98 = (ImageView) getView().findViewById(R.id.btn98);
        b98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 98;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b99 = (ImageView) getView().findViewById(R.id.btn99);
        b99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 99;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b100 = (ImageView) getView().findViewById(R.id.btn100);
        b100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 100;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b101 = (ImageView) getView().findViewById(R.id.btn101);
        b101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 101;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b102 = (ImageView) getView().findViewById(R.id.btn102);
        b102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 102;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b103 = (ImageView) getView().findViewById(R.id.btn103);
        b103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 103;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b104 = (ImageView) getView().findViewById(R.id.btn104);
        b104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 104;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b105 = (ImageView) getView().findViewById(R.id.btn105);
        b105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 105;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b106 = (ImageView) getView().findViewById(R.id.btn106);
        b106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 106;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b107 = (ImageView) getView().findViewById(R.id.btn107);
        b107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 107;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b108 = (ImageView) getView().findViewById(R.id.btn108);
        b108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 108;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b109 = (ImageView) getView().findViewById(R.id.btn109);
        b109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 109;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b110 = (ImageView) getView().findViewById(R.id.btn110);
        b110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 110;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b111 = (ImageView) getView().findViewById(R.id.btn111);
        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 111;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b112 = (ImageView) getView().findViewById(R.id.btn112);
        b112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 112;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b113 = (ImageView) getView().findViewById(R.id.btn113);
        b113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 113;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
                startActivity(i);
            }
        });
        b114 = (ImageView) getView().findViewById(R.id.btn114);
        b114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 114;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("f", f);
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
