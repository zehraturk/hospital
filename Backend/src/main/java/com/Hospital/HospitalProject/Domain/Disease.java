package com.Hospital.HospitalProject.Domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Data
@Entity
@Table(name = "disease")
public class Disease {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "disease_id")
    private String diseaseId;

    @NotEmpty
    @Column(name = "disease_icd", unique = true)
    private String diseaseIcd;  // ICD (International Statistical Classification of Diseases and Related Health Problems)

    @Column(name = "disease_name")
    private String diseaseName;

    @Column(name = "disease_description")
    private String diseaseDescription;

    /******************************************************************************************************************/
    //many tarafındaki ile aynı işlemi yapar.

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_id", referencedColumnName = "disease_id")
    private List<Drug> drugs;*/
}
