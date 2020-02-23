package com.Hospital.HospitalProject.Domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "drug")
public class Drug {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "drug_id")
    private String drugId;


    @Column(name = "drug_serial_no", unique = true)
    private String drugSerialNo;

    @Column(name = "drug_name")
    private String drugName;


    @Column(name = "drug_prospectus")
    private String drugProspectus;


    @ManyToOne
    private Disease disease;


}
