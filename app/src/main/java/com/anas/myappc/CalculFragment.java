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

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
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

        num1 = cnv.findViewById(R.id.num1);
        num2 = cnv.findViewById(R.id.num2);
        add = cnv.findViewById(R.id.add);
        sub = cnv.findViewById(R.id.sub);
        result = cnv.findViewById(R.id.result);

        add.setOnClickListener(v ->{
            float n1 = Float.parseFloat(num1.getText().toString());
            float n2 = Float.parseFloat(num2.getText().toString());
            float sum = n1 + n2;
            result.setText(String.format("%.2f", sum));
        });

        sub.setOnClickListener(v ->{
            float n1 = Float.parseFloat(num1.getText().toString());
            float n2 = Float.parseFloat(num2.getText().toString());
            float diff = n1 - n2;
            result.setText(String.format("%.2f", diff));
        });

        return cnv;
    }
}
