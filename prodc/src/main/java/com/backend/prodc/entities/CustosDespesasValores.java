package com.backend.prodc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "custos_despesas_valores")
public class CustosDespesasValores {
    @Id
    private Long idCustoDespesa;
    private Float jan;
    private Float fev;
    private Float mar;
    private Float abr;
    private Float mai;
    private Float jun;
    private Float jul;
    private Float ago;
    private Float sete;
    private Float outu;
    private Float nov;
    private Float dez;

    public CustosDespesasValores() {

    }

    public CustosDespesasValores(Float jan, Float fev, Float mar, Float abr, Float mai, Float jun, Float jul, Float ago,
            Float sete, Float outu, Float nov, Float dez, Long idCustoDespesa) {
        this.idCustoDespesa = idCustoDespesa;
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sete = sete;
        this.outu = outu;
        this.nov = nov;
        this.dez = dez;
    }

    public Long getIdCustoDespesa() {
        return idCustoDespesa;
    }

    public void setIdCustoDespesa(Long idCustoDespesa) {
        this.idCustoDespesa = idCustoDespesa;
    }

    public Float getJan() {
        return jan;
    }

    public void setJan(Float jan) {
        this.jan = jan;
    }

    public Float getFev() {
        return fev;
    }

    public void setFev(Float fev) {
        this.fev = fev;
    }

    public Float getMar() {
        return mar;
    }

    public void setMar(Float mar) {
        this.mar = mar;
    }

    public Float getAbr() {
        return abr;
    }

    public void setAbr(Float abr) {
        this.abr = abr;
    }

    public Float getMai() {
        return mai;
    }

    public void setMai(Float mai) {
        this.mai = mai;
    }

    public Float getJun() {
        return jun;
    }

    public void setJun(Float jun) {
        this.jun = jun;
    }

    public Float getJul() {
        return jul;
    }

    public void setJul(Float jul) {
        this.jul = jul;
    }

    public Float getAgo() {
        return ago;
    }

    public void setAgo(Float ago) {
        this.ago = ago;
    }

    public Float getSete() {
        return sete;
    }

    public void setSete(Float sete) {
        this.sete = sete;
    }

    public Float getOutu() {
        return outu;
    }

    public void setOutu(Float outu) {
        this.outu = outu;
    }

    public Float getNov() {
        return nov;
    }

    public void setNov(Float nov) {
        this.nov = nov;
    }

    public Float getDez() {
        return dez;
    }

    public void setDez(Float dez) {
        this.dez = dez;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCustoDespesa == null) ? 0 : idCustoDespesa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustosDespesasValores other = (CustosDespesasValores) obj;
        if (idCustoDespesa == null) {
            if (other.idCustoDespesa != null)
                return false;
        } else if (!idCustoDespesa.equals(other.idCustoDespesa))
            return false;
        return true;
    }

}
