package com.example.seungkim.mvvm;

import android.databinding.ObservableField;

/**
 * Created by seungkim on 2017. 5. 24..
 */

public class MainViewModel implements ViewModel, NumberModel.OnNumberChangeListener{
    public NumberModel model;
    public final ObservableField<String> strResult;

    public MainViewModel(){
        model = new NumberModel();
        model.setOnNumberChangeListener(this);
        strResult = new ObservableField<>();
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onDestroy() {
    }

    public void onClickChangeText(){
        model.changeNumber();
    }

    @Override
    public void onNumberChange(int number) {
        strResult.set( "reuslt : " + number);
    }
}
