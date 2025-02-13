package com.meet;

import javax.crypto.SecretKey;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;


public class GenerateSecretKey {
    @Test
    void generateSecretKey(){
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String encodedKey= DatatypeConverter.printHexBinary(key.getEncoded());
        System.out.println("Secret Key: "+encodedKey);
    }
}
