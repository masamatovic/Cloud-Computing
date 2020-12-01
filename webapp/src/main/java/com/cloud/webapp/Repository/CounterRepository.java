package com.cloud.webapp.Repository;


import com.cloud.webapp.Model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Long> {
}
