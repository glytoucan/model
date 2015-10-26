package org.glytoucan.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

	// {"timestamp":1445856909494,"status":403,"error":"Forbidden","message":"Access is denied","path":"/user"}
    private Date timestamp;
    String status, error, message, path;
    
    public Message() {
    }

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Message [timestamp=" + timestamp + ", status=" + status
				+ ", error=" + error + ", message=" + message + ", path="
				+ path + "]";
	}
}
