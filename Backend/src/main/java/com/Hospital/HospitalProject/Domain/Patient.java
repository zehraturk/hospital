package com.Hospital.HospitalProject.Domain;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.engine.spi.CascadeStyle;
import org.hibernate.validator.internal.metadata.aggregated.CascadingMetaData;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "patient_tcno", nullable = false, unique = true)
    private String patientTcNo;

    @NotEmpty
    @Column(name = "patient_name")
    private String patientName;


    @NotEmpty
    @Column(name = "patient_surname")
    private String patientSurname;

}
