package com.example.plzwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AddPost extends AppCompatActivity {
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private final DatabaseReference root = database.getReference().child("Posts");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
    }


    public void onPostButtonClicked(View view) {
        //HashMap<String, Object> usermap = new HashMap<>();
        EditText text = (EditText)findViewById(R.id.postDescription);
//        String message = text.getText().toString();
//        root.setValue(message);

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}