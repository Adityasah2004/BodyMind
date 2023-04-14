package com.example.bodymind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
            Intent intent = new Intent(HomeScreen.this, Med.class);
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