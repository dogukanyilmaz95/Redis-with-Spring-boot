package com.dogukanyilmaz.redisspringboot.service;

import com.dogukanyilmaz.redisspringboot.entity.Mock;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author dogukanyilmaz
 * Created 21.01.2020
 */
public interface IMockService {
    public static final String MY_KEY = "mykey";

    @CachePut(cacheNames = "mocks", key = "#root.target.MY_KEY")
    @CacheEvict(cacheNames = "mocks", allEntries = true)
    Mock save(Mock mock);

    @CachePut(cacheNames = "mocks", key = "#root.target.MY_KEY")
    @CacheEvict(cacheNames = "mocks", allEntries = true)
    List<Mock> saveAll(List<Mock> mocks);

    @Cacheable(cacheNames = "mocks", key = "#root.target.MY_KEY")
    List<Mock> findAll();
}
