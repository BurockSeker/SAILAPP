package com.example.demo.service;

import com.example.demo.entity.Request;
import com.example.demo.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Optional<Request> getRequestById(Long id) {
        return requestRepository.findById(id);
    }

    public List<Request> getRequestsByAdvisorId(Long advisorId) {
        return requestRepository.findByAdvisorId(advisorId);
    }
    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }

    public void acceptRequest(Long id) {
        Optional<Request> requestOptional = requestRepository.findById(id);
        if (requestOptional.isPresent()) {
            Request request = requestOptional.get();
            request.setStateOfRequest("ACCEPTED");
            request.getStudent().setAdvisor(request.getAdvisor());
            requestRepository.save(request);
        }
    }

    public void denyRequest(Long id) {
        Optional<Request> requestOptional = requestRepository.findById(id);
        if (requestOptional.isPresent()) {
            Request request = requestOptional.get();
            request.setStateOfRequest("DENIED");
            requestRepository.save(request);
        }
    }
}
