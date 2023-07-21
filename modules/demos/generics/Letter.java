package com.havefunwith.modules.demos.generics;

public class Letter {

    private String sender;

    Letter(String sender) {
        this.sender = sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
