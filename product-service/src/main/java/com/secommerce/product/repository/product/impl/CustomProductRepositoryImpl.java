package com.secommerce.product.repository.product.impl;

import com.secommerce.product.repository.product.ICustomProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomProductRepositoryImpl implements ICustomProductRepository {
    @PersistenceContext
    private EntityManager entityManager;
}
