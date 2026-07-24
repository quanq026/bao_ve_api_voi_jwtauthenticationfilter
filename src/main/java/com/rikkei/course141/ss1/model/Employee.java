package com.rikkei.course141.ss1.model;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Employee {
    private Long id;
    private String fullName;
    private Double salary;
}
