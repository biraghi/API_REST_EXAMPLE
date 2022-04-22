package com.example.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "regions")
public class Regions {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer region_id;
    @Column
    public String region_name;


}
