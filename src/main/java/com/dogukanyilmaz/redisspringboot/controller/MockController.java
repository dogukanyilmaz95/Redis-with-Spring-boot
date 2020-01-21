package com.dogukanyilmaz.redisspringboot.controller;

import com.dogukanyilmaz.redisspringboot.entity.Mock;
import com.dogukanyilmaz.redisspringboot.service.IMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dogukanyilmaz
 * Created 21.01.2020
 */
@RestController
@RequestMapping("api/mock")
public class MockController {
    private IMockService mockService;

    @Autowired
    public MockController(IMockService mockService) {
        this.mockService = mockService;
    }

    @PostMapping
    public ResponseEntity<?> createMockData(@RequestBody Mock mock) {
        return ResponseEntity.ok(mockService.save(mock));
    }

    @PostMapping("/createAll")
    public ResponseEntity<?> createMocksData(@RequestBody List<Mock> mocks) {
        return ResponseEntity.ok(mockService.saveAll(mocks));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(mockService.findAll());
    }

}
