package com.example.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "countries")
public class Countries {
    @Id
    public String country_id;
    @Column
    public String country_name;
    @OneToOne
    @JoinColumn(name="region_id", insertable = false, updatable = false)
    public Regions region;
}
