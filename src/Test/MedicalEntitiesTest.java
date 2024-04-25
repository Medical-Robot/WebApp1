
package com.example.webapp.Test;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class MedicalEntitiesTest {
    public static void main(String[] args) {
        // Initialize FirebaseFirestore
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // Test getUsers method
        List<String> users = getUsers(db);
        System.out.println("Users: " + users);

        // Test getPacients method
        List<String> pacients = getPacients(db);
        System.out.println("Pacients: " + pacients);
    }

    public static List<String> getUsers(FirebaseFirestore db) {
        // Implement logic to fetch users from Firebase
    }

    public static List<String> getPacients(FirebaseFirestore db) {
        // Implement logic to fetch pacients from Firebase
    }
}


