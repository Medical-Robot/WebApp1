package com.example.webapp.Test;

import com.example.webapp.Service.PacientService;
import com.example.webapp.Entity.Pacient;

import java.util.List;

public class ControllerTest {
    public static void main(String[] args) {
        // Mock user data
        long userId = GlobalClassTest.getUserId();
        String userEmail = GlobalClassTest.getUserEmail();

        // Initialize PacientService
        PacientService pacientService = new PacientService(/* pass your FirebaseFirestore instance here */);

        // Test loginIndex method
        String loginView = loginIndex();
        System.out.println("Login view: " + loginView);

        // Test authentication method
        String redirectPage = authentication(userId, userEmail);
        System.out.println("Redirect page: " + redirectPage);

        // Test pacientIndex method
        List<Pacient> pacients = pacientService.getAllPacients();
        System.out.println("Pacients: " + pacients);
    }

    public static String loginIndex() {
        return "login"; // Assuming "login" is the name of the login view
    }

    public static String authentication(long userId, String userEmail) {
        if (userId != 0 && userEmail != null) {
            return "home"; // Redirect to home page
        } else {
            return "login"; // Redirect to login page with error message
        }
    }
}
