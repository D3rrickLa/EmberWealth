package com.laderrco.ember_wealth.user.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.laderrco.ember_wealth.user.domain.Email;
import com.laderrco.ember_wealth.user.domain.User;

public class UserTest {

    @Test
    @DisplayName("Test User register. Created with valid data ")
    void shouldCreateUserWithValidData() {
        Email email = new Email("john@example.com");
        com.laderrco.ember_wealth.user.domain.DisplayName displayName = new com.laderrco.ember_wealth.user.domain.DisplayName(
                "JohnDoe23");

        User user = new User(email, displayName);

        // Then
        assertNotNull(user.getUserId());
        assertEquals(email, user.getEmail());
        assertEquals(displayName, user.getDisplayName());
        assertEquals("some_default_location.png", user.getAvatarURL());
        assertFalse(user.getIsPrivate());
        assertEquals(0, user.getFollowerCount());
        assertEquals(0, user.getFollowingCount());
        assertNotNull(user.getPrivacySettings());
        assertTrue(user.getPrivacySettings().isEmpty());
    }

    @Test
    @DisplayName("Should throw exception when display name is null")
    void shouldThrowExceptionWhenDisplayNameIsNull() {
        // Given
        Email email = new Email("john@example.com");
        com.laderrco.ember_wealth.user.domain.DisplayName displayName = null;

        // When & Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new User(email, displayName);
        });

        assertEquals("Your username can't be empty", exception.getMessage());
    }

    @Test
    void shouldSetPrivacyStatusToFalse() {
         
        Email email = new Email("john@example.com");
        com.laderrco.ember_wealth.user.domain.DisplayName displayName = null;
        
        User user = new User(email, displayName);
        user.makeAccountPrivate();
        assertEquals(user.getIsPrivate(), true);
    }
}
