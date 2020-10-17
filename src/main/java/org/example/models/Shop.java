package org.example.models;

import org.example.models.stores.AbstractStore;
import org.example.utils.ShopCatalogReader;

public class Shop {

    protected AbstractStore catalog;
    protected ShopCatalogReader creator;

    public AbstractStore getCatalog() {
        return catalog;
    }

    protected void initCatalog() {

    }
}
