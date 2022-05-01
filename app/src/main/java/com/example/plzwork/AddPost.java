package com.example.plzwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Date;
import java.util.TimeZone;

public class AddPost extends AppCompatActivity {
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private final DatabaseReference root = database.getReference().child("Feed");
    FirebaseAuth mAuth = FirebaseAuth.getInstance();//get instance of the FirebaseAuth object
    FirebaseUser user = mAuth.getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
    }


    public void onPostButtonClicked(View view) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
        String year = cal.get(Calendar.YEAR) * -1 + "";
        String month = cal.get(Calendar.MONTH) * -1 + "";
        String day = cal.get(Calendar.DAY_OF_MONTH) * -1 + "";
        EditText text = (EditText)findViewById(R.id.postDescription);
        String contents = text.getText().toString();
        if(contents != "") {
            root.child(year).child(month).child(day).child(user.getUid()).setValue(contents);
        }
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}