package com.aazamnawlakha.eac_android.activity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aazamnawlakha.eac_android.R;
import com.android.volley.ParseError;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.UUID;

public class EmployeeLogin extends BaseActivity {

  private TextView password_textView;
   private Button generatePassword;
    private Context mContext;
    private boolean isPasswordGenerated = true;

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected String getTagName() {
        return null;
    }

    @Override
    public void showProgress(boolean show, String tag) {

    }

    @Override
    public void onSuccess(JSONObject response, String tag) {

    }

    @Override
    public void onError(VolleyError error, String message, String tag) {

    }

    public String passwordGenerator(int mPassLenght){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").trim();
        uuid = uuid.substring(0,mPassLenght);
        Log.i("random password",uuid);
        return  uuid;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
