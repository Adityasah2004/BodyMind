package com.example.bodymind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.List;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        RecyclerView chatMessagesList = findViewById(R.id.chat_messages_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        chatMessagesList.setLayoutManager(layoutManager);

        EditText chatInputText = findViewById(R.id.chat_input_text);
        ImageButton sendButton = findViewById(R.id.sendButton);

        // Add event listener for send button
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = chatInputText.getText().toString().trim();
                if (!message.isEmpty()) {
                    // Send message
                    chatInputText.setText("");
                }
            }
        });
    }
}
