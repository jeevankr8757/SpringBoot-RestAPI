package com.project.login;

public class LoginBean {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to validate user credentials
    public boolean validate() {
        // Hardcoded username and password for simplicity
        return "admin".equals(username) && "password123".equals(password);
    }

	public void setUserId(String userId) {
		// TODO Auto-generated method stub
		
	}
}
