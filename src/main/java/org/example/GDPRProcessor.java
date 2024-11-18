package org.example;

public class GDPRProcessor {
    public void anonymizeUser(User user) {
        user.setName(null);
        user.setEmail(null);
        user.setPassword(null);

        if(user.getName() == null &&
                user.getEmail() == null &&
                user.getPassword() == null) {
            System.out.println("User data has been removed.");
        } else {
            System.out.println("Failed to remove data.");
        }
    }
    // i den här klassen ska ni implementera dessa metoder:
    // 1. anonymizeUser() - metod för att anonymisera en användare
    // 2. logDataProcessing() - metod som loggar varje gång en användare behandlas
    public void logDataProcessing() {
        System.out.println("Logging data");
    }
}
