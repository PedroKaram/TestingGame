package org.example;

public class RegisterPoints {
    public void coment(User user) {
        user.points += 3;
    }

    public void createTopic(User user) {
        user.points += 5;
    }

    public void like(User user) {
        user.points += 1;
    }
}
