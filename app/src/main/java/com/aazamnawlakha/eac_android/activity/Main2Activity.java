package com.aazamnawlakha.eac_android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.aazamnawlakha.eac_android.R;

public class Main2Activity extends Activity {
    TextView mTaskForm, mEmpRegistration;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mContext = this;
        mTaskForm = (TextView) findViewById(R.id.task_form);
        mTaskForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mTaskIntent = new Intent(getApplicationContext(),TaskFormActivity.class);
                startActivity(mTaskIntent);
                //Toast.makeText(mContext,"Work in Progress",Toast.LENGTH_LONG).show();
            }
        });
        mEmpRegistration = (TextView) findViewById(R.id.employee_registration);
        mEmpRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mEmploginIntent = new Intent(getApplicationContext(),EmployeeLogin.class);
                startActivity(mEmploginIntent);
            }
        });

    }
}
