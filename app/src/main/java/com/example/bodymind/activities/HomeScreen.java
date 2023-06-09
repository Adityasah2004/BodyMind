package com.example.bodymind.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bodymind.Notification;
import com.example.bodymind.R;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }

        public void onChatButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, Chat.class);
            startActivity(intent);
        }

        public void onMedButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, ChatBot.class);
            startActivity(intent);
        }
        public void onappointmentButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, Appointment.class);
            startActivity(intent);
        }
        public void onnotiButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, Notification.class);
            startActivity(intent);
        }
        public void onreportButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, Report.class);
            startActivity(intent);
        }
        public void ondocButtonClick(View view) {
            Intent intent = new Intent(HomeScreen.this, Doctor.class);
            startActivity(intent);
        }



}