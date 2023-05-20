package com.example.bodymind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class Appointment extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        editText = findViewById(R.id.editText2);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePicker(); // Open date picker dialog
            }
        });
    }

    private void openDatePicker() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, R.style.DialogTheme, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                // Replace "editText" with your EditText variable name
                editText.setText(String.valueOf(year) + "." + String.valueOf(month) + "." + String.valueOf(day));
            }
        }, 2023, 01, 20) {
            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                // Retrieve the positive and negative buttons from the dialog
                Button positiveButton = getButton(DialogInterface.BUTTON_POSITIVE);
                Button negativeButton = getButton(DialogInterface.BUTTON_NEGATIVE);

                // Set the text color of the buttons to black
                positiveButton.setTextColor(ContextCompat.getColor(getContext(), R.color.black));
                negativeButton.setTextColor(ContextCompat.getColor(getContext(), R.color.black));
            }
        };

        datePickerDialog.show();
    }

    public void onsearchButtonClick(View view) {
        Intent intent = new Intent(Appointment.this, Doctor.class);
        startActivity(intent);
    }

}
