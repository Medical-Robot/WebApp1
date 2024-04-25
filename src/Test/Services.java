package com.example.webapp.Test;

import com.example.webapp.Entity.Pacient;
import com.example.webapp.Service.PacientService;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class PacientServiceTest {
    public static void main(String[] args) {
        // Initialize Firebase Realtime Database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference db = database.getReference();

        // Initialize PacientService with Firebase database reference
        PacientService pacientService = new PacientService(db);

        // Test getAllPacients method
        List<Pacient> pacients = pacientService.getAllPacients();
        for (Pacient pacient : pacients) {
            System.out.println("Key: " + pacient.getKey() + ", Value: " + pacient.getValue());
        }
    }
}
