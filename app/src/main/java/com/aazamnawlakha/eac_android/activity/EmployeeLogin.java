package com.aazamnawlakha.eac_android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aazamnawlakha.eac_android.R;

import java.util.UUID;

public class EmployeeLogin extends AppCompatActivity {

   TextView password_textView;
    Button generatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_registration);
        password_textView = (TextView) findViewById(R.id.password_textView);
        generatePassword = (Button) findViewById(R.id.generate_button);

        generatePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_textView.setText(passwordGenerator(8));
            }
        });
    }
    public String passwordGenerator(int mPassLenght){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").trim();
        uuid.substring(0,mPassLenght);
        Log.i("random password",uuid);
        return  uuid;
    }
}
