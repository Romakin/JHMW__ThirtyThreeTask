package org.example.models;

import org.example.models.stores.AbstractStore;

public class User {
    protected AbstractStore basket;

    public AbstractStore getBasket() {
        return basket;
    }
}
