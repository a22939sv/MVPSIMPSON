package com.sanvalero.mvpsimpson01.update_lst_simpson.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sanvalero.mvpsimpson01.R;
import com.sanvalero.mvpsimpson01.entities.Simpson;
import com.sanvalero.mvpsimpson01.update_lst_simpson.UpdateLstSimpsonContract;
import com.sanvalero.mvpsimpson01.update_lst_simpson.presenter.UpdateLstSimpsonPresenter;

import java.util.ArrayList;

public class UpdateLstSimpsonActivity extends AppCompatActivity implements UpdateLstSimpsonContract.View {
    private UpdateLstSimpsonPresenter updateLstSimpsonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();
    }

    private void initComponents() {

    }

    private void initPresenter() {
        updateLstSimpsonPresenter = new UpdateLstSimpsonPresenter(this);
    }

    private void initData() {
        updateLstSimpsonPresenter.updateLstSimpson(null); // SELECT * FROM SIMPSON
    }

    @Override
    public void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        // ADAPTER, NOTIFY SET DATA CHANGED
    }

    @Override
    public void failureLstSimpson(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}