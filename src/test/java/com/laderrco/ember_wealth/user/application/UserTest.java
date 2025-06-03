package com.laderrco.ember_wealth.user.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.laderrco.ember_wealth.user.domain.DisplayName;
import com.laderrco.ember_wealth.user.domain.Email;
import com.laderrco.ember_wealth.user.domain.User;

public class UserTest {

    @Test
    void shouldCreateUserWithValidData() {
        Email email = new Email("john@example.com");
        DisplayName displayName = new DisplayName("JohnDoe23");

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
    void shouldThrowExceptionWhenDisplayNameIsNull() {
        // Given
        Email email = new Email("john@example.com");
        DisplayName displayName = null;

        // When & Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new User(email, displayName);
        });

        assertEquals("Your username can't be empty", exception.getMessage());
    }

    @Test
    void shouldSetPrivacyStatusToFalse() {
        Email email = new Email("john@example.com");
        DisplayName displayName = new DisplayName("johndoe34");

        User user = new User(email, displayName);
        user.togglePrivacy();
        assertEquals(user.getIsPrivate(), true);
    }

    @Test
    void shouldTogglePrivacySettings() {
        Email email = new Email("john@example.com");
        DisplayName displayName = new DisplayName("johndoe34");
        User user = new User(email, displayName);
        
        user.togglePrivacy();
        assertTrue(user.getIsPrivate());

        user.togglePrivacy();
        assertFalse(user.getIsPrivate());
    }

    @Test
    void shouldUpdateDisplayName() {
        Email email = new Email("john@example.com");
        DisplayName displayName = new DisplayName("johndoe34");
        
        User user = new User(email, displayName);
        
        DisplayName newDisplayName = new DisplayName("johndoe345");

        user.updateUsername(newDisplayName);

        assertEquals(user.getDisplayName(), newDisplayName);
        

    }
}
