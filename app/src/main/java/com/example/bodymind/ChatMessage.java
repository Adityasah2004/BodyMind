package com.example.bodymind;

public class ChatMessage {
    private String messageText;
    private long messageTime;
    private String messageUser;
    private boolean isCurrentUser;

    public ChatMessage(String messageText, long messageTime, String messageUser, boolean isCurrentUser) {
        this.messageText = messageText;
        this.messageTime = messageTime;
        this.messageUser = messageUser;
        this.isCurrentUser = isCurrentUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public boolean isCurrentUser() {
        return isCurrentUser;
    }

    public void setCurrentUser(boolean currentUser) {
        isCurrentUser = currentUser;
    }
}
