// src/main/java/com/example/deploylab/repository/ItemRepository.java

package com.example.deploylab;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {}