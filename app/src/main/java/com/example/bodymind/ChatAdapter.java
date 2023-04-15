package com.example.bodymind;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private List<ChatMessage> mChatMessages;

    public ChatAdapter(List<ChatMessage> chatMessages) {
        mChatMessages = chatMessages;
    }

    @Override
    public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat_message, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatViewHolder holder, int position) {
        ChatMessage chatMessage = mChatMessages.get(position);
        holder.bind(chatMessage);
    }

    @Override
    public int getItemCount() {
        return mChatMessages.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {
        private TextView mMessageText;
        private TextView mMessageTime;

        public ChatViewHolder(View itemView) {
            super(itemView);
            mMessageText = itemView.findViewById(R.id.messageText);
            mMessageTime = itemView.findViewById(R.id.messageTime);
        }

        public void bind(ChatMessage chatMessage) {
            mMessageText.setText(chatMessage.getMessageText());
            mMessageTime.setText(formatDateTime(chatMessage.getMessageTime()));
        }

        private String formatDateTime(long time) {
            // Implement your datetime formatting logic here
            return String.valueOf(time);
        }
    }
}

