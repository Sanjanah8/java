package com.mycompany.hello;

// Define the Message interface
interface Message {
    void sendMessage(String recipient, String content);
}

// Implement the interface for Email
class Email implements Message {
    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Sending Email to " + recipient + ": " + content);
    }
}

// Implement the interface for SMS
class SMS implements Message {
    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Sending SMS to " + recipient + ": " + content);
    }
}

// Implement the interface for WhatsApp
class WhatsApp implements Message {
    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Sending WhatsApp message to " + recipient + ": " + content);
    }
}

public class MessagingSystem {
    public static void main(String[] args) {
        Message email = new Email();
        Message sms = new SMS();
        Message whatsapp = new WhatsApp();

        email.sendMessage("sanjana@example.com", "Hello sanju!");
        sms.sendMessage("+1234567890", "Hi there!");
        whatsapp.sendMessage("+9876543210", "Hey, how's it going?");
    }
}
