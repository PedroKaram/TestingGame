import org.example.BonusCalculator;
import org.example.RegisterPoints;
import org.example.User;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class RegisterPointsTest {
    @Test
    public void comentTest() {
        User user = new User();
        user.vip = false;

        BonusCalculator bc = new BonusCalculator();

        RegisterPoints rp = new RegisterPoints(bc);
        rp.coment(user);

        assertEquals(3, user.points);
    }

    @Test
    public void createTopicTest() {
        User user = new User();
        user.vip = false;

        BonusCalculator bc = new BonusCalculator();

        RegisterPoints rp = new RegisterPoints(bc);
        rp.createTopic(user);

        assertEquals(5, user.points);
    }

    @Test
    public void likeTest() {
        User user = new User();
        user.vip = false;

        BonusCalculator bc = new BonusCalculator();

        RegisterPoints rp = new RegisterPoints(bc);
        rp.like(user);

        assertEquals(1, user.points);
    }
}
