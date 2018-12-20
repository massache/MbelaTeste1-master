package com.example.angelo.mbelateste1;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class motoristaFragment extends Fragment {

    private static final int RESULT_OK = -1 ;
    //Imagem
    ImageView btnGaleria;
    LinearLayout gallery;
    TextView textView;
    private final int IMAGEMGALERIA = 1;
    Uri enderecoImagem;
    CheckBox checkBox;
    Button submeterBt;


    Uri []  listaImagens = new Uri[3] ;

    public motoristaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = (View)inflater.inflate(R.layout.fragment_motorista, container, false);
        btnGaleria = view.findViewById(R.id.btnGaleria);
        gallery = view.findViewById(R.id.gallery);
        textView = view.findViewById(R.id.nrItem);
        submeterBt = view.findViewById(R.id.bSubmit);


        submeterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(getActivity(), "Is Checked", Toast.LENGTH_SHORT).show();

            }
        });


        btnGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");


                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent , IMAGEMGALERIA);
                //PEDIR identifica o nosso pedido
            }
        });

        return view;



    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);




        if (requestCode == IMAGEMGALERIA && resultCode == RESULT_OK && data != null && data.getData() != null) {

            // Aqui o uri ja tem o caminho
            enderecoImagem = data.getData();
            for (int i = 0 ; i<listaImagens.length ; i++){
                listaImagens[i] =data.getData();
                //Picasso.with(getActivity()).load(listaImagens[i]).into(btnGaleria);
            }
            // Picasso vai converter e por no image view



            LayoutInflater inflater1 = LayoutInflater.from(getActivity());              //cases
            for (int i = 0; i < 4; i++){
                View view1 = inflater1.inflate(R.layout.car_container, gallery, false);

               // textView.setText("Item" + i);

                ImageView imageView = view1.findViewById(R.id.imageView);
                Picasso.with(getActivity()).load(enderecoImagem).fit().into(btnGaleria);

            }


        }
    }

    /* *******************************************************Scroll view horizontal************************************************* */

}
