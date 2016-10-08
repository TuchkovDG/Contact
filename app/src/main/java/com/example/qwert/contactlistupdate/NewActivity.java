package com.example.qwert.contactlistupdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Денис on 08.10.2016.
 */
public class NewActivity extends AppCompatActivity {

    TextView name;
    TextView email;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        String valueName = getIntent().getExtras().getString("Name");
        String valueEmail = getIntent().getExtras().getString("Email");
        String valueAdd = getIntent().getExtras().getString("Address");

        name = (TextView) findViewById(R.id.nameCon);
        email = (TextView) findViewById(R.id.emailCon);
        address = (TextView) findViewById(R.id.addressCon);

        name.setText(valueName);
        email.setText(valueEmail);
        address.setText(valueAdd);
    }
}