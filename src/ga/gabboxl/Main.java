package ga.gabboxl;


import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*  Generatore di token per accedere alla API degli orari di GTT, estratto dalla app Android "GTT Mobile" e semplificato da Gabboxl
*
*  .apk decompilato con JADX
*
*  funzioni estratte dai file ::
*
*  documentazione --- WIP
* */

public class Main {

    public static void main(String[] args) {
        ApiParameters a = null;
        try {
            a = Main.m1260a("/ws2.1/rest/stops/" + args[0] + "/departures");
            System.out.println("apiName: " + a.apiName + "\n TOKEN: " + a.token + "\n TIMESTAMP: " + a.timeStamp + "\n secret: " + a.secret);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Devi inserire una fermata! \n Utilizzo corretto: java -jar gtt-keygen.jar <n. fermata>");
            System.exit(0);
        }
    }

    public static ApiParameters m1260a(String str) {
        String str2 = "";
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String toUpperCase = Main.m1261a(Main.m1262a("/sale.png")).toUpperCase(); //il richiamo alla funzione può essere sostituita semplicemente con la stringa "759C97DC7D115966C30FD9169BB200D9" siccome il calcolo del "segreto" dall'immagine è sempre il medesimo
        str2 = Main.m1383b(str + String.valueOf(valueOf) + toUpperCase);
        //System.out.println("apiName: " + str + " timeStamp: " + valueOf + " secret: " + toUpperCase);
        //System.out.println("token: " + str2);
        return ApiParameters.newInstance(str, str2, valueOf, toUpperCase);
    }

    /* renamed from: a */
    public static byte[] m1262a(String str) {
        byte[] bArr = null;
        try {
            InputStream open = Main.class.getResourceAsStream(str);
            bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return bArr;
        } catch (IOException e) {
            return bArr;
        }
    }

    /* renamed from: a */
    public static String m1261a(byte[] bArr) {
        String str = "MD5";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                str = Integer.toHexString(b & 255);
                while (str.length() < 2) {
                    str = "0" + str;
                }
                stringBuilder.append(str);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }



    public static String m1383b(String str) {
        String str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                str2 = Integer.toHexString(b & 255);
                while (str2.length() < 2) {
                    str2 = "0" + str2;
                }
                stringBuilder.append(str2);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
