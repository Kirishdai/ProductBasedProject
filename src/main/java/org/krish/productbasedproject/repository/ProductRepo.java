package org.krish.productbasedproject.repository;

import org.krish.productbasedproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
