package org.example.models.stores;

import org.example.models.product.Product;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface FilteredStore {

    List<String> filterNames = Arrays.stream(Product.class.getDeclaredFields())
            .map(Field::getName).collect(Collectors.toList());

    List<Product> filter(Map<String, String> filters);

}
