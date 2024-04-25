package com.example.webapp.Service;

import com.example.webapp.Entity.Pacient;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PacientService {
    private final FirebaseFirestore db;

    public PacientService(FirebaseFirestore db) {
        this.db = db;
    }

    public List<Pacient> getAllPacients() {
        List<Pacient> pacients = new ArrayList<>();
        // Fetch pacients from Firestore
        try {
            db.collection("pacients").get().addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    for (var document : task.getResult()) {
                        String id = document.getId();
                        String date = document.getString("date");
                        Pacient pacient = new Pacient(id, date);
                        pacients.add(pacient);
                    }
                } else {
                    System.out.println("Error getting documents: " + task.getException());
                }
            }).get(); // Blocking call to wait for Firestore operation to complete
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return pacients;
    }
}
