package com.laderrco.ember_wealth.user.domain;

import org.springframework.util.Assert;

public record Email(String value) {
    public Email {
        Assert.notNull(value, "Email Address can't be null.");

        if (!isValidFormat(value)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        value = value.trim().toLowerCase();
    }

    private static boolean isValidFormat(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}
