package com.sanvalero.mvpsimpson01.lst_simpson;

import com.sanvalero.mvpsimpson01.entities.Simpson;

import java.util.ArrayList;

public interface LstSimpsonContract {
    public interface View{
        void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg);
        void failureLstSimpson(String err);
    }
    public interface Presenter{
        // CASO DE USO
        void lstSimpson(Simpson simpson);
    }
    public interface Model{
        interface OnLstSimpsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void lstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener);
    }
}
