package com.example.angelo.mbelateste1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFrag extends Fragment {

    Button btLogin;
    Button btRegistro;

    public MainFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btLogin = view.findViewById(R.id.button);
        btRegistro = view.findViewById(R.id.button2);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.contentor, new BlankFragment())
                        .commit();
            }
        });

        btRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "registro", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
