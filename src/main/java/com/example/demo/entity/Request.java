package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String stateOfRequest; // "PENDING", "ACCEPTED", "DENIED"

    private String message;

    // Default constructor
    public Request() {}

    // Parameterized constructor
    public Request(Advisor advisor, Student student, String stateOfRequest, String message) {
        this.advisor = advisor;
        this.student = student;
        this.stateOfRequest = stateOfRequest;
        this.message = message;
    }

    // Getters and Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStateOfRequest() {
        return stateOfRequest;
    }

    public void setStateOfRequest(String stateOfRequest) {
        this.stateOfRequest = stateOfRequest;
    }
}
