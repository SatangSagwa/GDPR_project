package org.example;

public class Main {
    public static void main(String[] args) {
        // simulera ett test program här i main()
        // ni ska:

        // 1. skapa en ny user

        // 2. logga ut den skapade usern med sout

        // 3. initiera GDPR-processor och tjänster:
        // - skapa instanser av GDPRProcessor, EncryptionService (finns redan) och PrivacyPolicyGenerator
        EncryptionService encryptionService = new EncryptionService();

        // 4. logga databehandling: kör metoden logDataProcessing()

        // 5. kryptera och avkryptera lösenord
        // obs ändra i encrypt() om ni inte döpt er user till just user...
        String encryptedPassword = encryptionService.encrypt(user.getPassword());
        System.out.println("Encrypted password: " + encryptedPassword);
        String decryptPassword = encryptionService.decrypt(encryptedPassword);
        System.out.println("Decrypted password: " + decryptPassword);

        // 6. anonymisera användaren
        // - kör metoden anonymizeUser()
        // - logga databehandling genom att köra logDataProcessing()

        // 7. generera privacy policy
        // kör metoden generatePrivacyPolicy()

        // kör ert program!

    }
}