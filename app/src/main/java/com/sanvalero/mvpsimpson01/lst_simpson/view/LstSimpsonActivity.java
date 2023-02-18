package com.sanvalero.mvpsimpson01.lst_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.sanvalero.mvpsimpson01.R;
import com.sanvalero.mvpsimpson01.lst_simpson.LstSimpsonContract;
import com.sanvalero.mvpsimpson01.entities.Simpson;
import com.sanvalero.mvpsimpson01.lst_simpson.presenter.LstSimpsonPresenter;

import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity implements LstSimpsonContract.View {
    private LstSimpsonPresenter lstSimpsonPresenter;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();
    }

    private void initComponents() { txt1 = (TextView) findViewById(R.id.txt1); }

    private void initPresenter() { lstSimpsonPresenter = new LstSimpsonPresenter(this); }

    private void initData() {
        lstSimpsonPresenter.lstSimpson(null); // SELECT * FROM SIMPSON
    }

    @Override
    public void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg) {
        Toast.makeText(this, "Datos recibidos correctamente!!", Toast.LENGTH_SHORT).show();
        // ADAPTER, NOTIFY SET DATA CHANGED
        String cadena = "";

        for (int i = 0; i < lstSimpson.size(); i++) {
            cadena += (i+1) + "º " + lstSimpson.get(i).toString() + "\n\n";
        }

        txt1.setText(cadena);
    }

    @Override
    public void failureLstSimpson(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}