package org.example;

public class RegisterPoints {
    private BonusCalculator bonus;

    public RegisterPoints(BonusCalculator bc) {
        bonus = bc;
    }

    public void coment(User user) {
        user.points += 3 * bonus.calculateBonus(user);
    }

    public void createTopic(User user) {
        user.points += 5 * bonus.calculateBonus(user);
    }

    public void like(User user) {
        user.points += 1 * bonus.calculateBonus(user);
    }
}
