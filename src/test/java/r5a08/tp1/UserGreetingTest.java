package r5a08.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserGreetingTest {
    @Test
    void formatGreeting_nomValide_returnBonjourNom(){
        String resultat = UserGreeting.formatGreeting("Fousseynou");
        assertEquals("Bonjour, Fousseynou",resultat);
    }

}
