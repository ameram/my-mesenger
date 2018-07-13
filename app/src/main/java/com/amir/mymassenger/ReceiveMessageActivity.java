package com.amir.mymassenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends Activity {


    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent in = getIntent();
        String string = in.getStringExtra(EXTRA_MESSAGE);
        TextView showwer = findViewById(R.id.messageReceiver);
        showwer.setText(string);

    }
}
