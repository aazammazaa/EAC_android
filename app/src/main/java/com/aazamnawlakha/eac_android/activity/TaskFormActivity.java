package com.aazamnawlakha.eac_android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aazamnawlakha.eac_android.R;
import com.android.volley.VolleyError;

import org.json.JSONObject;

public class TaskFormActivity extends BaseActivity {
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
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Assign Task");
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
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
