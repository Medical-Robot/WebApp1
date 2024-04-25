package com.example.webapp.Test;

public class GlobalClassTest {
    private static long userId;
    private static String userEmail;

    public static void main(String[] args) {
        // Mock user data
        long userId = 1234567890L;
        String userEmail = "test@example.com";

        // Test setters
        setUserId(userId);
        setUserEmail(userEmail);

        // Test getters
        System.out.println("User ID: " + getUserId());
        System.out.println("User Email: " + getUserEmail());
    }

    public static long getUserId() {
        return userId;
    }

    public static void setUserId(long userId) {
        GlobalClassTest.userId = userId;
    }

    public static String getUserEmail() {
        return userEmail;
    }

    public static void setUserEmail(String userEmail) {
        GlobalClassTest.userEmail = userEmail;
    }
}
