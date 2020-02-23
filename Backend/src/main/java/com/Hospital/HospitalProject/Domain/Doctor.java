package com.Hospital.HospitalProject.Domain;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Data
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "doctor_id")
    private String doctorId;

    @NotEmpty
    @Column(name = "doctor_name")
    private String doctorName;

    @NotEmpty
    @Column(name = "doctor_surname")
    private String doctorSurname;

    @NotEmpty
    @Column(name = "doctor_email")
    private String doctorEmail;

    @Column(name = "doctor_password")
    private String doctorPassword;

    @Column(name = "doctor_branch")
    private String doctorBranch;
}

