import org.example.BonusCalculator;
import org.example.RegisterPoints;
import org.example.User;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class BonusCalculatorTest {
    @Test
    public void calculateBonusTest() {
        User user = new User();
        user.vip = false;

        BonusCalculator bc = new BonusCalculator();
        bc.dayBonus = 1;

        assertEquals(1, bc.calculateBonus(user));
    }

    @Test
    public void calculateBonusVIPTest() {
        User user = new User();
        user.vip = true;

        BonusCalculator bc = new BonusCalculator();
        bc.dayBonus = 1;

        assertEquals(5, bc.calculateBonus(user));
    }

    @Test
    public void calculateBonusDayBonus() {
        User user = new User();
        user.vip = false;

        BonusCalculator bc = new BonusCalculator();
        bc.dayBonus = 2;

        assertEquals(2, bc.calculateBonus(user));
    }

    @Test
    public void calculateBonusVIPDayBonus() {
        User user = new User();
        user.vip = true;

        BonusCalculator bc = new BonusCalculator();
        bc.dayBonus = 2;

        assertEquals(10, bc.calculateBonus(user));
    }
}
