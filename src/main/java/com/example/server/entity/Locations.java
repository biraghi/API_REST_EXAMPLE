package com.example.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Locations {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long location_id;
    @Column
    public String street_address;
    @Column
    public String postal_code;
    @Column
    public String city;
    @Column
    public String state_province;
    @OneToOne
    @JoinColumn(name="country_id", insertable = false, updatable = false)
    public Countries countries;
}
