package tampilan;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Who_Im_I
 */
public class testing {
    public static void main(String[] args) {
        String password = "password";
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println("Hashed: " + hashed);

        if (BCrypt.checkpw(password, hashed)) {
            System.out.println("MATCH!");
        } else {
            System.out.println("NO MATCH!");
        }
    }
}

