package org.example;

public class GDPRProcessor {
    public void anonymizeUser(User user) {
        user.setName(null);
        user.setEmail(null);
        user.setPassword(null);
        user.setNotes(null);

        if(user.getName() == null &&
                user.getEmail() == null &&
                user.getPassword() == null &&
                user.getNotes() == null) {
            System.out.println("User data has been removed.");
        } else {
            System.out.println("Failed to remove data.");
        }
    }
    // i den här klassen ska ni implementera dessa metoder:
    // 1. anonymizeUser() - metod för att anonymisera en användare
    // 2. logDataProcessing() - metod som loggar varje gång en användare behandlas
    public void logDataProcessing(User user, String type) {
        if (type == "edit") {
            System.out.println("Data has been edited.");
            System.out.println("User: " + user.toString());
        } else if (type == "delete") {
            System.out.println("Data has been deleted.");
            System.out.println("User: " + user.toString());
        } else {
            System.out.println("Data has been processed.");
            System.out.println("User: " + user.toString());
        }
    }
}
