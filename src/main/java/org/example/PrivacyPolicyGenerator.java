package org.example;

public class PrivacyPolicyGenerator {
    // i den här klassen ska ni implementera en enkel enkel metod,
    // som ska heta generatePrivacyPolicy(),
    // som skapar en text för att visa vilka datafält som hanteras och varför.
    public void generatePrivacyPolicy(String type) {
        if (type == "email") {
            System.out.println("Email policy...");
        }
        else if (type == "name") {
            System.out.println("Name policy...");
        }
        else if (type == "password") {
            System.out.println("Password policy...");
        }
        else {
            System.out.println("Privacy policy...");
        }
    }
}
