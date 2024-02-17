package org.example;

public class BonusCalculator {
    public int dayBonus = 1;

    public int calculateBonus(User user) {
        int multiplier = dayBonus;

        if(user.vip)
            multiplier = dayBonus * 5;

        return multiplier;
    }
}
