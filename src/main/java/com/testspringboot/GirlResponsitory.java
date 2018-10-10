package com.testspringboot;

import com.testspringboot.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlResponsitory extends JpaRepository<Girl, String> {
}
