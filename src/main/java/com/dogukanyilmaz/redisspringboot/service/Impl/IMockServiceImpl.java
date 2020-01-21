package com.dogukanyilmaz.redisspringboot.service.Impl;

import com.dogukanyilmaz.redisspringboot.entity.Mock;
import com.dogukanyilmaz.redisspringboot.repository.IMockRepository;
import com.dogukanyilmaz.redisspringboot.service.IMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dogukanyilmaz
 * Created 21.01.2020
 */
@Service
public class IMockServiceImpl implements IMockService {
    private IMockRepository mockRepository;

    @Autowired
    public IMockServiceImpl(IMockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }

    @Override
    public Mock save(Mock mock) {
        return this.mockRepository.save(mock);
    }

    @Override
    public List<Mock> saveAll(List<Mock> mocks) {
        return this.mockRepository.saveAll(mocks);
    }

    @Override
    public List<Mock> findAll() {
        return this.mockRepository.findAll();
    }
}
