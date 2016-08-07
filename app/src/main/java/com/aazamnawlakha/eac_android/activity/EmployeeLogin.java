package com.aazamnawlakha.eac_android.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aazamnawlakha.eac_android.R;

import java.util.UUID;

public class EmployeeLogin extends AppCompatActivity {

   TextView password_textView;
    Button generatePassword;
    Context mContext;
    boolean isPasswordGenerated = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_registration);
        mContext = this;
        password_textView = (TextView) findViewById(R.id.password_textView);
        generatePassword = (Button) findViewById(R.id.generate_button);

        generatePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPasswordGenerated){
                    password_textView.setText(passwordGenerator(8));
                    password_textView.setTextColor(getResources().getColor(R.color.black));
                }else{
                    Toast.makeText(mContext,"Password has been Generated",Toast.LENGTH_SHORT).show();
                }
                isPasswordGenerated = false;
            }
        });
    }
    public String passwordGenerator(int mPassLenght){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").trim();
        uuid = uuid.substring(0,mPassLenght);
        Log.i("random password",uuid);
        return  uuid;
    }
}
