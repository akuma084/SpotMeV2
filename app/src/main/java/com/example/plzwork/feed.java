package com.example.plzwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feed extends AppCompatActivity {
    FirebaseDatabase user_database = FirebaseDatabase.getInstance();
    DatabaseReference mDb = user_database.getReference();
    FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private final DatabaseReference root = user_database.getReference().child("Posts");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }
}