package org.example.models.stores;

import org.example.models.product.Product;

import java.util.List;

public abstract class AbstractStore {

    List<Product> store;

    public AbstractStore(List<Product> store) {
        this.store = store;
    }

    public void add(Product e) {
        store.add(e);
    }

    public void add(List<Product> es) {
        store.addAll(es);
    }
}
