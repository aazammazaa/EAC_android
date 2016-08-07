package com.aazamnawlakha.eac_android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class EmployeeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public String passwordGenerator(int mPassLenght){

        String uuid = UUID.randomUUID().toString().replaceAll("-", "").trim();
        uuid.substring(0,mPassLenght);
        return  uuid;
    }
}
