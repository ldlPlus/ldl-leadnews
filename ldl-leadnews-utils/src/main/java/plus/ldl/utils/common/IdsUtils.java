package plus.ldl.utils.common;


import cn.hutool.core.util.HexUtil;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 数字ID混淆器，用于前后端数据通信时候的处理
 *
 * @author ldl
 */
public class IdsUtils {
    private static final String KEY_AES = "AES/GCM/NoPadding";
    private static final String KEY_SECART = "12345678901234561234567890123456";

    private IdsUtils() {
    }

    public static String encryptNumber(Long number) throws NoSuchPaddingException, IllegalBlockSizeException,
            NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        String src = String.format("%d%013d", 0, number);
        return encrypt(src);
    }

    public static Long decryptLong(String src) throws NoSuchPaddingException, IllegalBlockSizeException,
            NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        String val = decrypt(src);
        return Long.valueOf(val);
    }

    public static Integer decryptInt(String src) throws NoSuchPaddingException, IllegalBlockSizeException,
            NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        String val = decrypt(src);
        return Integer.valueOf(val);
    }

    private static String encrypt(String src) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] raw = KEY_SECART.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY_AES);
        Cipher cipher = Cipher.getInstance(KEY_AES);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(src.getBytes());
        return HexUtil.encodeHexStr(encrypted);
    }

    private static String decrypt(String src) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] raw = KEY_SECART.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY_AES);
        Cipher cipher = Cipher.getInstance(KEY_AES);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] encrypted1 = HexUtil.decodeHex(src);
        byte[] original = cipher.doFinal(encrypted1);
        return new String(original);
    }

    private static byte[] hex2byte(String strhex) {
        if (strhex == null || strhex.length() % 2 == 1) {
            return null;
        }
        int l = strhex.length();
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2), 16);
        }
        return b;
    }

    private static String byte2hex(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (byte value : b) {
            stmp = (Integer.toHexString(value & 0XFF));
            if (stmp.length() == 1) {
                hs.append("0").append(stmp);
            } else {
                hs.append(stmp);
            }
        }
        return hs.toString().toUpperCase();
    }

}
