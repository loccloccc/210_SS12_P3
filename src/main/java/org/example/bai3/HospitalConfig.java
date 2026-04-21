package org.example.bai3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


    @Component
    public class HospitalConfig {

        @Value("${hospital.name}")
        private String name;

        @Value("${hospital.hotline}")
        private String hotline;

        @PostConstruct
        public void init() {
            System.out.println(name);
            System.out.println(hotline);
        }
    }

