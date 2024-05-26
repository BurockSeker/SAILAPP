package com.example.demo.controller;

import com.example.demo.entity.Request;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping
    public Request createRequest(@RequestBody Request request) {
        return requestService.saveRequest(request);
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("/{id}")
    public Optional<Request> getRequestById(@PathVariable Long id) {
        return requestService.getRequestById(id);
    }

    @GetMapping("/advisor/{advisorId}")
    public List<Request> getRequestsByAdvisorId(@PathVariable Long advisorId) {
        return requestService.getRequestsByAdvisorId(advisorId);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }

    @PutMapping("/{id}/accept")
    public void acceptRequest(@PathVariable Long id) {
        requestService.acceptRequest(id);
    }

    @PutMapping("/{id}/deny")
    public void denyRequest(@PathVariable Long id) {
        requestService.denyRequest(id);
    }
}
