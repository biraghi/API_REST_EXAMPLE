package com.example.server.repository;

import com.example.server.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, String> {
}
