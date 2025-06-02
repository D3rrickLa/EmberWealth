package com.laderrco.ember_wealth.user.domain;

import java.util.UUID;

import org.springframework.util.Assert;

// value container for UUID + stop creating book ID that is null
public record UserId(UUID id) {
    public UserId {
        Assert.notNull(id, "ID must not be null.");
    }

    public UserId() {
        this(UUID.randomUUID());
    }
}
