package com.example.bodymind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RolePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_page);
    }

    public void openDoctorPage(View view) {
        Intent intent = new Intent(this, DoctorLogin.class);
        startActivity(intent);
    }

    public void openpatientPage(View view) {
        Intent intent = new Intent(this, InformationPage.class);
        startActivity(intent);
    }
}
