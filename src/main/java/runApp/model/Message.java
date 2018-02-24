package model;

import java.io.Serializable;

public class Message implements Serializable{

    private static final long serialVersionUID = -1522784640082826658L;

    private String name;
    private String body;

    public Message() {
    }

    public Message(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
