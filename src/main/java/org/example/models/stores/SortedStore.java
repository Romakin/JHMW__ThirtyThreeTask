package org.example.models.stores;

import org.example.models.product.Product;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface SortedStore {

    List<String> sortedNames = Arrays.stream(Product.class.getDeclaredFields())
            .map(Field::getName).collect(Collectors.toList());

    void sortBy(List<String[]> columns);
}
