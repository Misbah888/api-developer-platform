package com.misbah.developer_service.service;

import com.misbah.developer_service.dto.DeveloperRequest;
import com.misbah.developer_service.dto.DeveloperResponse;
import com.misbah.developer_service.entity.Developer;
import com.misbah.developer_service.repository.DeveloperRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;

    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public DeveloperResponse createDeveloper(DeveloperRequest request) {
        Developer developer=new Developer();
        developer.setName(request.getName());
        developer.setEmail(request.getEmail());
         Developer savedDeveloper=developerRepository.save(developer);

         return new DeveloperResponse(savedDeveloper.getId(),
                 savedDeveloper.getName(),
                 savedDeveloper.getEmail());
    }

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }

    public Developer getDeveloperById(Long id) {
        return developerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found"));
    }

    public Developer updateDeveloper(Long id, Developer developer) {
        Developer existing = getDeveloperById(id);

        existing.setName(developer.getName());
        existing.setEmail(developer.getEmail());

        return developerRepository.save(existing);
    }

    public void deleteDeveloper(Long id) {
        Developer existing = getDeveloperById(id);
        developerRepository.delete(existing);
    }
}