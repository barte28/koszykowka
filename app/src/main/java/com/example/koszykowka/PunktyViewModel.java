package com.example.koszykowka;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private MutableLiveData<Integer> punkty;

    public MutableLiveData<Integer> getPunkty() {
        if (punkty == null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        return punkty;
    }

    public void setPunkty(MutableLiveData<Integer> punkty) {
        this.punkty = punkty;
    }

    public void zwiekszPunkty(int wartosc){
        if(punkty.getValue() == null){
            punkty.setValue(0);
        }
        else{
            punkty.setValue(punkty.getValue()+wartosc);
        }
    }
}
