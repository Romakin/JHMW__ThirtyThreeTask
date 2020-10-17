package org.example.models.stores;

import org.example.models.product.Product;
import org.example.utils.ShopCatalogReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductsCatalogStore extends AbstractStore implements FilteredStore, SortedStore {

    ShopCatalogReader reader = new ShopCatalogReader();

    public ProductsCatalogStore() {
        super(new ArrayList<>());
        init();
    }

    public void init() {
        this.add(reader.getList());
    }

    @Override
    public List<Product> filter(Map<String, String> filters) {
        return null;
    }

    @Override
    public void sortBy(List<String[]> columns) {

    }
}
