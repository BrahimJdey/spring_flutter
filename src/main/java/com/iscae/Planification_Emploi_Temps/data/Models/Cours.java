package com.iscae.Planification_Emploi_Temps.data.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
public class Cours {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "courstype", nullable = false, length = 10)
    private String courstype;
    @Basic
    @Column(name = "matiere", nullable = false)
    private int matiere;
    @Basic
    @Column(name = "professeurheure", nullable = false)
    private int professeurheure;
    @Basic
    @Column(name = "salle", nullable = false)
    private int salle;
@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "matiere", referencedColumnName = "id", nullable = false,updatable = false,insertable = false)
    private Matiere matiereByMatiere;

    @ManyToOne
    @JoinColumn(name = "professeurheure", referencedColumnName = "id", nullable = false,updatable = false,insertable = false)
    private Heuretravailleparjour heuretravailleparjourByProfesseurheure;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "salle", referencedColumnName = "id", nullable = false,updatable = false,insertable = false)
    private Salle salleBySalle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourstype() {
        return courstype;
    }

    public void setCourstype(String courstype) {
        this.courstype = courstype;
    }

    public int getMatiere() {
        return matiere;
    }

    public void setMatiere(int matiere) {
        this.matiere = matiere;
    }

    public int getProfesseurheure() {
        return professeurheure;
    }

    public void setProfesseurheure(int professeurheure) {
        this.professeurheure = professeurheure;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public Matiere getMatiereByMatiere() {
        return matiereByMatiere;
    }

    public void setMatiereByMatiere(Matiere matiereByMatiere) {
        this.matiereByMatiere = matiereByMatiere;
    }

    public Heuretravailleparjour getHeuretravailleparjourByProfesseurheure() {
        return heuretravailleparjourByProfesseurheure;
    }

    public void setHeuretravailleparjourByProfesseurheure(Heuretravailleparjour heuretravailleparjourByProfesseurheure) {
        this.heuretravailleparjourByProfesseurheure = heuretravailleparjourByProfesseurheure;
    }

    public Salle getSalleBySalle() {
        return salleBySalle;
    }

    public void setSalleBySalle(Salle salleBySalle) {
        this.salleBySalle = salleBySalle;
    }
}
