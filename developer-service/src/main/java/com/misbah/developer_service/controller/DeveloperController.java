package com.misbah.developer_service.controller;

import com.misbah.developer_service.dto.DeveloperRequest;
import com.misbah.developer_service.dto.DeveloperResponse;
import com.misbah.developer_service.entity.Developer;
import com.misbah.developer_service.service.DeveloperService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @PostMapping
    public DeveloperResponse createDeveloper(@RequestBody @Valid DeveloperRequest request) {
        return developerService.createDeveloper(request);
    }

    @GetMapping
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable Long id) {
        return developerService.getDeveloperById(id);
    }

    @PutMapping("/{id}")
    public Developer updateDeveloper(
            @PathVariable Long id,
            @RequestBody Developer developer) {
        return developerService.updateDeveloper(id, developer);
    }

    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable Long id) {
        developerService.deleteDeveloper(id);
    }
}