package com.aazamnawlakha.eac_android.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aazamnawlakha.eac_android.R;

public class Main2Activity extends Activity {
    Button mSubmitButton;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_form);
        mContext = this;
        mSubmitButton = (Button) findViewById(R.id.submit_Button);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"Work in Progress",Toast.LENGTH_LONG).show();
            }
        });

    }
}
