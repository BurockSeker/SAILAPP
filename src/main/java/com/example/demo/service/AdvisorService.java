package com.example.demo.service;

import com.example.demo.entity.Advisor;
import com.example.demo.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvisorService {

    @Autowired
    private AdvisorRepository advisorRepository;

    public Advisor saveAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    public Optional<Advisor> getAdvisorById(Long id) {
        return advisorRepository.findById(id);
    }

    public Advisor getAdvisorByEmail(String email) { return advisorRepository.findByEmail(email);}

    public void deleteAdvisor(Long id) {
        advisorRepository.deleteById(id);
    }
}
