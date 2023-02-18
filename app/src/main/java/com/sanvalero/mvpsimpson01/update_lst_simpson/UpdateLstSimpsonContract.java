package com.sanvalero.mvpsimpson01.update_lst_simpson;


import com.sanvalero.mvpsimpson01.entities.Simpson;

import java.util.ArrayList;

public interface UpdateLstSimpsonContract {
    public interface View{
        void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg);
        void failureLstSimpson(String err);
    }
    public interface Presenter{
        // CASO DE USO
        void updateLstSimpson(Simpson simpson);
    }
    public interface Model{
        interface OnLstSimpsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void updateLstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener);
    }
}
