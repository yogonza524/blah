/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket.blah.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author gonzalo
 */
public class Message implements Serializable{
    
    private int status;
    private String content;
    private Date date;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Message(int status, String content) {
        this.status = status;
        this.content = content;
        this.date = new Date();
    }

    public Message(int status, String content, Date date) {
        this.status = status;
        this.content = content;
        this.date = date;
    }

    public Message() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.status;
        hash = 29 * hash + Objects.hashCode(this.content);
        hash = 29 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" + "status=" + status + ", content=" + content + ", date=" + date + '}';
    }
    
    
}
