package com.misbah.developer_service.repository;

import com.misbah.developer_service.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer,Long> {
}
