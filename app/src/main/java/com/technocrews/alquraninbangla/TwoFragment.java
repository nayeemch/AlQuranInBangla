package com.technocrews.alquraninbangla;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class TwoFragment extends Fragment {
    ImageView b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51;

    int b;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,null);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b25 = (ImageView) getView().findViewById(R.id.btn25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 25;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b", b);
                startActivity(i);
            }
        });

        b26 = (ImageView) getView().findViewById(R.id.btn26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=26;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });

        b27 = (ImageView) getView().findViewById(R.id.btn27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=27;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });

        b28 = (ImageView) getView().findViewById(R.id.btn28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 28;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b", b);
                startActivity(i);
            }
        });

        b29 = (ImageView) getView().findViewById(R.id.btn29);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=29;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b30 = (ImageView) getView().findViewById(R.id.btn30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=30;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b31 = (ImageView) getView().findViewById(R.id.btn31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=31;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b32 = (ImageView) getView().findViewById(R.id.btn32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=32;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b33 = (ImageView) getView().findViewById(R.id.btn33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=33;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b34 = (ImageView) getView().findViewById(R.id.btn34);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=34;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b35 = (ImageView) getView().findViewById(R.id.btn35);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=35;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b36 = (ImageView) getView().findViewById(R.id.btn36);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=36;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b37 = (ImageView) getView().findViewById(R.id.btn37);
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=37;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b38 = (ImageView) getView().findViewById(R.id.btn38);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=38;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b39 = (ImageView) getView().findViewById(R.id.btn39);
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=39;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b40 = (ImageView) getView().findViewById(R.id.btn40);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=40;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b41 = (ImageView) getView().findViewById(R.id.btn41);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=41;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b42 = (ImageView) getView().findViewById(R.id.btn42);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=42;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b43 = (ImageView) getView().findViewById(R.id.btn43);
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=28;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b44 = (ImageView) getView().findViewById(R.id.btn44);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=44;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b45 = (ImageView) getView().findViewById(R.id.btn45);
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=45;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b46 = (ImageView) getView().findViewById(R.id.btn46);
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=46;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b47 = (ImageView) getView().findViewById(R.id.btn47);
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=47;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b48 = (ImageView) getView().findViewById(R.id.btn48);
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=48;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b49 = (ImageView) getView().findViewById(R.id.btn49);
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=49;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b50 = (ImageView) getView().findViewById(R.id.btn50);
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=50;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
        b51 = (ImageView) getView().findViewById(R.id.btn51);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=51;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("b",b);
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