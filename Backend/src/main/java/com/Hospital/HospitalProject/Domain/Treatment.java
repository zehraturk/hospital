package com.Hospital.HospitalProject.Domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "treatment")
public class Treatment {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "treatment_id")
    private String treatmentId;

    @ManyToOne
    private Drug drug;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    @Column(name = "treat_date")
    private String treatDate;


}
