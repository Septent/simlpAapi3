package ru.mtuci.simlpeapi3.service;

import ru.mtuci.simlpeapi3.model.Product;

import java.util.List;

public interface ProductService {

    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
