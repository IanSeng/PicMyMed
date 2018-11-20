package com.example.mukha.picmymedcode.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mukha.picmymedcode.Controller.PicMyMedApplication;
import com.example.mukha.picmymedcode.Model.Patient;
import com.example.mukha.picmymedcode.R;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofile_activity);

        Patient user = (Patient)PicMyMedApplication.getLoggedInUser();

        TextView showUsername = (TextView)findViewById(R.id.username);
        showUsername.setText(user.getUsername());

        EditText showPhoneNumber = (EditText)findViewById(R.id.enteredPhone);
        showPhoneNumber.setText(user.getPhoneNumber());

        EditText showEmail = (EditText)findViewById(R.id.enteredEmail);
        showEmail.setHint(user.getEmail());

/*
        Button editProfileButton = findViewById(R.id.editProfile_button);
        editProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problemIntent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(problemIntent);
            }
        }); */
    }

}
