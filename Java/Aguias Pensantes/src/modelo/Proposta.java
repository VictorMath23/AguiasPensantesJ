/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author vsilva18
 */
public class Proposta {
     private int id;
    private String dono;
    private String proposta;
    private String area_id;
    private String beneficio_id;
    private String gestor_id;
    private Date data_ideia;
    private String status;
    private int dias;

    public Proposta() {
    }

    public Proposta(int id, String dono, String proposta, String area_id, String beneficio_id, String gestor_id, Date data_ideia, String status, int dias) {
        this.id = id;
        this.dono = dono;
        this.proposta = proposta;
        this.area_id = area_id;
        this.beneficio_id = beneficio_id;
        this.gestor_id = gestor_id;
        this.data_ideia = data_ideia;
        this.status = status;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getBeneficio_id() {
        return beneficio_id;
    }

    public void setBeneficio_id(String beneficio_id) {
        this.beneficio_id = beneficio_id;
    }

    public String getGestor_id() {
        return gestor_id;
    }

    public void setGestor_id(String gestor_id) {
        this.gestor_id = gestor_id;
    }

    public Date getData_ideia() {
        return data_ideia;
    }

    public void setData_ideia(Date data_ideia) {
        this.data_ideia = data_ideia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
