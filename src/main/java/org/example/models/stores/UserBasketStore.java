package org.example.models.stores;

import org.example.models.product.Product;

import java.util.ArrayList;

public class UserBasketStore extends AbstractStore {

    public UserBasketStore() {
        super(new ArrayList<>());
    }
}
