package com.example.demo.model;

import lombok.Data;

@Data
public class ChatMessage {

    public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String sender;
    private String content;
	@Override
	public String toString() {
		return "ChatMessage [sender=" + sender + ", content=" + content + ", getSender()=" + getSender()
				+ ", getContent()=" + getContent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

    // Getter Setter
}
