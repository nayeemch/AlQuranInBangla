package com.technocrews.alquraninbangla;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FourFragment extends Fragment {
    ImageView b76, b77, b78, b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96;
    int d;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_four,null);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        b76 = (ImageView) getView().findViewById(R.id.btn76);
        b76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 76;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b77 = (ImageView) getView().findViewById(R.id.btn77);
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 77;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b78 = (ImageView) getView().findViewById(R.id.btn78);
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 78;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b79 = (ImageView) getView().findViewById(R.id.btn79);
        b79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 79;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b80 = (ImageView) getView().findViewById(R.id.btn80);
        b80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 80;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b81 = (ImageView) getView().findViewById(R.id.btn81);
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 81;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b82 = (ImageView) getView().findViewById(R.id.btn82);
        b82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 82;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b83 = (ImageView) getView().findViewById(R.id.btn83);
        b83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 83;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b84 = (ImageView) getView().findViewById(R.id.btn84);
        b84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 84;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b85 = (ImageView) getView().findViewById(R.id.btn85);
        b85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 85;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b86 = (ImageView) getView().findViewById(R.id.btn86);
        b86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 86;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b87 = (ImageView) getView().findViewById(R.id.btn87);
        b87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 87;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b88 = (ImageView) getView().findViewById(R.id.btn88);
        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 88;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b89 = (ImageView) getView().findViewById(R.id.btn89);
        b89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 89;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b90 = (ImageView) getView().findViewById(R.id.btn90);
        b90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 90;
                Intent i = new Intent(getActivity(), Surah_activityURI.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b91 = (ImageView) getView().findViewById(R.id.btn91);
        b91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 91;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });


        b92 = (ImageView) getView().findViewById(R.id.btn92);
        b92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 92;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });


        b93 = (ImageView) getView().findViewById(R.id.btn93);
        b93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 93;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b94 = (ImageView) getView().findViewById(R.id.btn94);
        b94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 94;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b95 = (ImageView) getView().findViewById(R.id.btn95);
        b95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 95;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
                startActivity(i);
            }
        });
        b96 = (ImageView) getView().findViewById(R.id.btn96);
        b96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = 96;
                Intent i = new Intent(getActivity(), Surah_activity.class);
                i.putExtra("d", d);
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
