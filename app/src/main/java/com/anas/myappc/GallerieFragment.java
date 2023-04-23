package com.anas.myappc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class GallerieFragment extends Fragment {


    private ImageView p1, p2, p3, imgp;
    private int[] images={R.drawable.p1,R.drawable.p2,R.drawable.p3};
    private Button next;
    private Button prev;

    private int cpt =0;
    public GallerieFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gallerie, container, false);

        p1 = v.findViewById(R.id.p1);
        p2 = v.findViewById(R.id.p2);
        p3 = v.findViewById(R.id.p3);
        imgp = v.findViewById(R.id.imgp);
        p1.setOnClickListener(e -> {
            imgp.setImageResource(R.drawable.p1);
            cpt=0;
        });
        p2.setOnClickListener(e -> {
            imgp.setImageResource(R.drawable.p2);
            cpt=1;
        });
        p3.setOnClickListener(e -> {
            imgp.setImageResource(R.drawable.p3);
            cpt=2;
        });

        next = v.findViewById(R.id.button2);
        next.setOnClickListener(e -> {
            cpt++;
            cpt = cpt%images.length;
            imgp.setImageResource(images[cpt]);
        });

        prev = v.findViewById(R.id.button);
        prev.setOnClickListener(e -> {
                    cpt = (cpt + 2) % images.length;
                    imgp.setImageResource(images[cpt]);
        });

        // Inflate the layout for this fragment
        return v;
    }
}