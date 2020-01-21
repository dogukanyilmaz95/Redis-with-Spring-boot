package com.dogukanyilmaz.redisspringboot.repository;

import com.dogukanyilmaz.redisspringboot.entity.Mock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dogukanyilmaz
 * Created 21.01.2020
 */
public interface IMockRepository extends JpaRepository<Mock, Long> {
}
