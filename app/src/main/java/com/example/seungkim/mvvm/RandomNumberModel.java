package com.example.seungkim.mvvm;


public class RandomNumberModel {
    public RandomNumberModel(){}

    public int getNumber() {
        return (int) (Math.random() * 99);
    }
}

