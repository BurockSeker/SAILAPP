package com.example.demo.entity;

import com.example.demo.repository.AdvisorRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AdvisorRepository advisorRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create and save advisors
        Advisor adv1 = new Advisor("adv1_name", "adv1_surname", "adv1_mail", "adv1_password");
        Advisor adv2 = new Advisor("adv2_name", "adv2_surname", "adv2_mail", "adv2_password");
        Advisor adv3 = new Advisor("adv3_name", "adv3_surname", "adv3_mail", "adv3_password");
        Advisor adv4 = new Advisor("adv4_name", "adv4_surname", "adv4_mail", "adv4_password");
        Advisor adv5 = new Advisor("adv5_name", "adv5_surname", "adv5_mail", "adv5_password");

        advisorRepository.save(adv1);
        advisorRepository.save(adv2);
        advisorRepository.save(adv3);
        advisorRepository.save(adv4);
        advisorRepository.save(adv5);

        // Create and save students
        Student hasan = new Student("Hasan", "Kilic", "hasanmail", "hasanpassword");
        Student aykut = new Student("Aykut Emre", "Yuksel", "aykutmail", "aykutpassword");
        Student burak = new Student("Burak", "Seker", "burakmail", "burakpassword");
        Student eylul = new Student("Eylul", "Berberoglu", "eylulmail", "eylulpassword");
        Student selin = new Student("Selin", "Eryasar", "selinmail", "selinpassword");

        studentRepository.save(hasan);
        studentRepository.save(aykut);
        studentRepository.save(burak);
        studentRepository.save(eylul);
        studentRepository.save(selin);
    }
}
