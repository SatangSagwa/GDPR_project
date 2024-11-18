package org.example;

public class Main {
    public static void main(String[] args) {
        // simulera ett test program här i main()
        // ni ska:

        // 1. skapa en ny user
        User user = new User(1, "Qwerty", "info@mail.com","password", "Anteckning...");

        // 2. logga ut den skapade usern med sout
        System.out.printf("%s has been logged out.\n", user.getName());

        // 3. initiera GDPR-processor och tjänster:
        // - skapa instanser av GDPRProcessor, EncryptionService (finns redan) och PrivacyPolicyGenerator
        EncryptionService encryptionService = new EncryptionService();
        GDPRProcessor gdprProcessor = new GDPRProcessor();
        PrivacyPolicyGenerator privacyPolicyGenerator = new PrivacyPolicyGenerator();

        // 4. logga databehandling: kör metoden logDataProcessing()
        gdprProcessor.logDataProcessing(user, "edit");

        // 5. kryptera och avkryptera lösenord
        // obs ändra i encrypt() om ni inte döpt er user till just user...
        String encryptedPassword = encryptionService.encrypt(user.getPassword());
        System.out.println("Encrypted password: " + encryptedPassword);
        String decryptPassword = encryptionService.decrypt(encryptedPassword);
        System.out.println("Decrypted password: " + decryptPassword);

        String encryptedEmail = encryptionService.encrypt(user.getEmail());
        System.out.println("Encrypted email: " + encryptedEmail);
        String decryptEmail = encryptionService.decrypt(encryptedEmail);
        System.out.println("Decrypted email: " + decryptEmail);

        String encryptedNotes = encryptionService.encrypt(user.getNotes());
        System.out.println("Encrypted notes: " + encryptedNotes);
        String decryptNotes = encryptionService.decrypt(encryptedNotes);
        System.out.println("Decrypted notes: " + decryptNotes);

        System.out.println("User data has been encrypted and decrypted.");
        // 6. anonymisera användaren
        // - kör metoden anonymizeUser()
        gdprProcessor.anonymizeUser(user);
        // - logga databehandling genom att köra logDataProcessing()
        gdprProcessor.logDataProcessing(user, "delete");
        // 7. generera privacy policy
        // kör metoden generatePrivacyPolicy()
        privacyPolicyGenerator.generatePrivacyPolicy("");
        // kör ert program!

    }
}