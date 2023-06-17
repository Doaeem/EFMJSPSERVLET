package com.ismo.crjj.efm.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Etablissement")
public class Etablissement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "code_etab")
  private int code_etab;

  @Column(name = "Nom_Etab")
  private String Nom_Etab;

  @Column(name = "Adresse_etab")
  private String Adresse_etab;

  @Column(name = "Tel_etab")
  private String Tel_etab;

  public Etablissement() {
  }

  public Etablissement(int code_etab, String Nom_Etab, String Adresse_etab, String Tel_etab) {
    this.code_etab = code_etab;
    this.Nom_Etab = Nom_Etab;
    this.Adresse_etab = Adresse_etab;
    this.Tel_etab = Tel_etab;
  }

  public int getCode_etab() {
    return code_etab;
  }

  public void setCode_etab(int code_etab) {
    this.code_etab = code_etab;
  }

  public String getNom_Etab() {
    return Nom_Etab;
  }

  public void setNom_Etab(String Nom_Etab) {
    this.Nom_Etab = Nom_Etab;
  }

  public String getAdresse_etab() {
    return Adresse_etab;
  }

  public void setAdresse_etab(String Adresse_etab) {
    this.Adresse_etab = Adresse_etab;
  }

  public String getTel_etab() {
    return Tel_etab;
  }

  public void setTel_etab(String Tel_etab) {
    this.Tel_etab = Tel_etab;
  }
}
