import java.math.BigInteger;
import java.util.Random;

public class RSA {

    public static void main(String[] args) {
        Random rand = new Random();

        BigInteger p = BigInteger.probablePrime(31, rand);
        BigInteger q = BigInteger.probablePrime(31, rand);
        BigInteger r = BigInteger.probablePrime(31, rand);

        BigInteger m = p.multiply(q).multiply(r);

        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)).multiply(r.subtract(BigInteger.ONE));

        BigInteger e;
        do {
            e = new BigInteger(64, rand); 
        } while (!(e.compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0 && e.gcd(phi).equals(BigInteger.ONE)));

        BigInteger d = e.modInverse(phi);

        System.out.println("p: " + p);
        System.out.println("q: " + q);
        System.out.println("r: " + r);
        System.out.println("m: " + m);
        System.out.println("e: " + e);
        System.out.println("d: " + d);

        BigInteger x = new BigInteger("2"); 
        BigInteger encrypted = x.modPow(e, m);

        System.out.println("Encrypted message: " + encrypted);

        BigInteger decrypted = encrypted.modPow(d, m);

        System.out.println("Decrypted message: " + decrypted);
    }
}
