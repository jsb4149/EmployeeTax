package com.Employee.Entity;

public class EmployeeStatus {

	private int statusCode;
	private String statusMessage;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public String toString() {
		return "EmployeeStatus [statusCode=" + statusCode + ", statusMessage=" + statusMessage + ", getStatusCode()="
				+ getStatusCode() + ", getStatusMessage()=" + getStatusMessage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
