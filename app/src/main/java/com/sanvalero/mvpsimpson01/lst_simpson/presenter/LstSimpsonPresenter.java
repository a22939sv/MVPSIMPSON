package com.sanvalero.mvpsimpson01.lst_simpson.presenter;

import com.sanvalero.mvpsimpson01.lst_simpson.LstSimpsonContract;
import com.sanvalero.mvpsimpson01.lst_simpson.model.LstSimpsonModel;
import com.sanvalero.mvpsimpson01.entities.Simpson;

import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
    private LstSimpsonModel lstSimpsonModel;
    private LstSimpsonContract.View view;

    public LstSimpsonPresenter(LstSimpsonContract.View view) {
        this.view = view;
        lstSimpsonModel = new LstSimpsonModel();
    }

    @Override
    public void lstSimpson(Simpson simpson) {
        lstSimpsonModel.lstSimpsonWS(simpson, new LstSimpsonContract.Model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {
                if (lstSimpson != null && lstSimpson.size() > 0) {
                    view.successLstSimpson(lstSimpson, "He recogido los datos correctamente!!!");
                } else {
                    view.failureLstSimpson("Los datos no han llegado correctamente!!!");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureLstSimpson("Error al recoger los datos!!!");
            }
        });
    }
}
