package com.example.user.materialdesignapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.materialdesignapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatosAcademicosFragment extends Fragment {


    public DatosAcademicosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos_academicos, container, false);
    }

}
