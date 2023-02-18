package com.sanvalero.mvpsimpson01.update_lst_simpson.model;

import com.sanvalero.mvpsimpson01.entities.Simpson;
import com.sanvalero.mvpsimpson01.update_lst_simpson.UpdateLstSimpsonContract;

public class UpdateLstSimpsonModel implements UpdateLstSimpsonContract.Model {
    @Override
    public void updateLstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener) {
        // If it is success
        onLstSimpsonListener.onSuccess(null);
        // If it is failure
        onLstSimpsonListener.onFailure("Error!!!");
    }
}
