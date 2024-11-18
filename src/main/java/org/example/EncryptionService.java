package org.example;

import java.util.Base64;

public class EncryptionService {
    // i den här klassen används Base64 för att kryptera och dekryptera data.
    // för verkliga projekt bör man använda en mer avancerad lösning som AES-kryptering.
    // vi kommer att lära oss detta framöver, dels denna veckan och dels i backend kursen
    // men för att få testa på kryptering kan ni använda dessa metoder just nu

    // krypteringsmetod
    // krypterar tex email eller lösenord
    public String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    // avkrypteringsmetod
    // kör efter encrypt() för att avkryptera
    public String decrypt(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}
