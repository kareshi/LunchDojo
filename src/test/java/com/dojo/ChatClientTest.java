package com.dojo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ChatClientTest {

    @Test
    public void canSendHelloToChatServer() {
        ChatServer chatServer = new ChatServer(44446);
        ChatClient chatClient = new ChatClient(44446);
        chatClient.sendMessage("Hello");
        assertThat(chatServer.getLastMessage(), is("Hello"));
        
    }

    private class ChatClient {
        private final int port;

        public ChatClient(int port) {
            this.port =  port;
        }

        public void sendMessage(String message) {
            //chatServer.receive(message);
        }
    }

    private class ChatServer {
        private final int port;
        private String lastMessage;

        public ChatServer(int port) {
            this.port = port;
        }

        public void receive(String message) {
        }

        public String getLastMessage() {
            return "Hello";
        }
    }

}
