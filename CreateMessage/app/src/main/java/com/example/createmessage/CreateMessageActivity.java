package com.example.createmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    protected void onSendMessage(View viev) {
        EditText messageView=(EditText)findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle=getString(R.string.chooser);
        Intent chooserIntent=Intent.createChooser(intent,chooserTitle);
        startActivity(chooserIntent);
    }
}
