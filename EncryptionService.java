import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionService {
    private static final String ALGO = "AES";
    private static final String KEY = "SiberGuvenlikX16"; // 16 Karakter

    public static String encrypt(String data) throws Exception {
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), ALGO);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        return Base64.getEncoder().encodeToString(c.doFinal(data.getBytes()));
    }

    public static String decrypt(String encryptedData) throws Exception {
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), ALGO);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        return new String(c.doFinal(Base64.getDecoder().decode(encryptedData)));
    }
}