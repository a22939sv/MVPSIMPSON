package com.sanvalero.mvpsimpson01.update_lst_simpson.presenter;

import com.sanvalero.mvpsimpson01.entities.Simpson;
import com.sanvalero.mvpsimpson01.update_lst_simpson.UpdateLstSimpsonContract;
import com.sanvalero.mvpsimpson01.update_lst_simpson.model.UpdateLstSimpsonModel;

import java.util.ArrayList;

public class UpdateLstSimpsonPresenter implements UpdateLstSimpsonContract.Presenter {
    private UpdateLstSimpsonModel lstSimpsonModel;
    private UpdateLstSimpsonContract.View view;

    public UpdateLstSimpsonPresenter(UpdateLstSimpsonContract.View view) {
        this.view = view;
        lstSimpsonModel = new UpdateLstSimpsonModel();
    }

    @Override
    public void updateLstSimpson(Simpson simpson) {
        lstSimpsonModel.updateLstSimpsonWS(simpson, new UpdateLstSimpsonContract.Model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {
                view.successLstSimpson(lstSimpson, "He recogido los datos correctamente!!!");
            }

            @Override
            public void onFailure(String error) {
                view.failureLstSimpson("Error al recoger los datos!!!");
            }
        });
    }
}
