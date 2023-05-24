package com.example.bodymind.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bodymind.AppointmentList;
import com.example.bodymind.Med2;
import com.example.bodymind.PatientList;
import com.example.bodymind.R;
import com.example.bodymind.ToDo;

public class HomeScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen2);
    }
    public void onChatButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, Chat.class);
        startActivity(intent);
    }

    public void onMedButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, Med2.class);
        startActivity(intent);
    }
    public void onaplistButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, AppointmentList.class);
        startActivity(intent);
    }
    public void onregButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, Registeration.class);
        startActivity(intent);
    }
    public void ontodoButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, ToDo.class);
        startActivity(intent);
    }
    public void onpatientButtonClick(View view) {
        Intent intent = new Intent(HomeScreen2.this, PatientList.class);
        startActivity(intent);
    }
}