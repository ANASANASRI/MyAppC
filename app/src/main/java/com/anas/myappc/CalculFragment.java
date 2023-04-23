package com.anas.myappc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculFragment extends Fragment {

    private EditText nbr;

    private Button btnConvE;
    private Button btnConvU;
    private Button btnConvB;
    private TextView result;



    public CalculFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cnv = inflater.inflate(R.layout.fragment_calcul, container, false);

        nbr = cnv.findViewById(R.id.montantEuro);
        btnConvE = cnv.findViewById(R.id.buttonEuro);
        btnConvU = cnv.findViewById(R.id.buttonUsd);
        btnConvB = cnv.findViewById(R.id.buttonBtc);
        result = cnv.findViewById(R.id.result);

        btnConvE.setOnClickListener(v ->{
            float mt = Float.parseFloat(nbr.getText().toString());
            float mad = mt*11.03f;
            result.setText(String.format("%.2f MAD", mad));
        });
        btnConvU.setOnClickListener(v ->{
            float mt = Float.parseFloat(nbr.getText().toString());
            float mad = mt*10.11f;
            result.setText(String.format("%.2f MAD", mad));
        });
        btnConvB.setOnClickListener(v ->{
            float mt = Float.parseFloat(nbr.getText().toString());
            float mad = mt*286865.98f;
            result.setText(String.format("%.2f MAD", mad));
        });
        return cnv;
    }
}