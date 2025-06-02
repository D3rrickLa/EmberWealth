package com.laderrco.ember_wealth.user.domain;


// record -> immutable and good for value objects: defines quality. impelmenting these objects, where we defny equality from all the properties, we can do that
public record DisplayName(String value) {
    // validate the Display Name
    // can't be null
    // greater than 2 characters and less than 20

    public DisplayName {
        if (isBlank(value)) {
           throw new IllegalArgumentException("In Display Name. Cannot be blank"); 
        }

        if (value.trim().length() <= 2 || value.trim().length() > 20) {
            throw new IllegalArgumentException(String.format("Display Name length must be between 3 and 20. Your Display Name is %s characters long.", value.trim().length()));
        }

        value = value.trim();
    }

    private static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }


}
