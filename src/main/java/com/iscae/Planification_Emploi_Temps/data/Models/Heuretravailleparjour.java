package com.iscae.Planification_Emploi_Temps.data.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Collection;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
public class Heuretravailleparjour {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "jour", nullable = false, length = 10)
    private String jour;
    @Basic
    @Column(name = "debit", nullable = false)
    private int debit;
    @Basic
    @Column(name = "fin", nullable = false)
    private int fin;
    @Basic
    @Column(name = "professeur", nullable = false)
    private int professeur;
    @JsonIgnore
    @OneToMany(mappedBy = "heuretravailleparjourByProfesseurheure")
    private Collection<Cours> coursById;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "professeur", referencedColumnName = "id", nullable = false,updatable = false,insertable = false)
    private Professeur professeurByProfesseur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getProfesseur() {
        return professeur;
    }

    public void setProfesseur(int professeur) {
        this.professeur = professeur;
    }

    public Collection<Cours> getCoursById() {
        return coursById;
    }

    public void setCoursById(Collection<Cours> coursById) {
        this.coursById = coursById;
    }

    public Professeur getProfesseurByProfesseur() {
        return professeurByProfesseur;
    }

    public void setProfesseurByProfesseur(Professeur professeurByProfesseur) {
        this.professeurByProfesseur = professeurByProfesseur;
    }
}
