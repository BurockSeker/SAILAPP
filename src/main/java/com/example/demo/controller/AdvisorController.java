package com.example.demo.controller;

import com.example.demo.entity.Advisor;
import com.example.demo.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    @Autowired
    private AdvisorService advisorService;

    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return advisorService.saveAdvisor(advisor);
    }

    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }

    @GetMapping("/{email}")
    public Advisor getAdvisorById(@PathVariable String email) {
        return advisorService.getAdvisorByEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        advisorService.deleteAdvisor(id);
    }
}

