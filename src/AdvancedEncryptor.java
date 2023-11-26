import java.util.Arrays;

import java.util.Base64;
import java.util.Scanner;

public class AdvancedEncryptor {
    public String encrypt(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public String decrypt(String input) {
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        return new String(decodedBytes);
    }

    public static void main(String[] args) {
        AdvancedEncryptor encryptor = new AdvancedEncryptor();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text :");
        String plainText = sc.nextLine();
        String encryptedText = encryptor.encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.print("Do you Want to decrypt the text encrypted ? Y/N : ");
        String input = sc.next();
        if (input.equalsIgnoreCase("y")) {
            System.out.print("Enter Key 1 : ");
            int key1 = sc.nextInt();
            System.out.print("Enter Key 2 : ");
            int key2 = sc.nextInt();
            if (key1 == 1104 && key2 == 2504) {
                String decryptedText = encryptor.decrypt(encryptedText);
                System.out.println("Decrypted Text: " + decryptedText);
            } else {
                System.out.println("U cant hack this bro...go home.");
            }
        }

        else {
            System.out.println("Fine let the text be encrypted .");
        }
    }
}