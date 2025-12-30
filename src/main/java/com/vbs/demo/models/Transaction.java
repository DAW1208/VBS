package com.vbs.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //to automate it
    int id;
    @Column(nullable = false)
    double amount;
    @Column(nullable = false)
    double currBalance;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    int userId;
    @Column(nullable = false)
    LocalDateTime date;

    @PrePersist //when obj is called then below fn
    protected void onCreate()
    {
        this.date = LocalDateTime.now();
    }
}
