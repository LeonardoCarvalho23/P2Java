/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leonardo
 */
public class Empresa {
    
    private String nome;
    private String cnpj;
    private String correspondente;
    private String telefone;
    private String horarioInicio;
    private String horarioFim;
    private String andar;
    private String sala;
    
    public Empresa (){
        
    }
    public Empresa(String nome,String cnpj,String correspondente,String telefone,String horarioInicio,String horarioFim,String andar,String sala){
        this.nome = nome;
        this.cnpj = cnpj;
        this.correspondente = correspondente;
        this.telefone = telefone;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.andar = andar;
        this.sala = sala;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the correspondente
     */
    public String getCorrespondente() {
        return correspondente;
    }

    /**
     * @param correspondente the correspondente to set
     */
    public void setCorrespondente(String correspondente) {
        this.correspondente = correspondente;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the horarioInicio
     */
    public String getHorarioInicio() {
        return horarioInicio;
    }

    /**
     * @param horarioInicio the horarioInicio to set
     */
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    /**
     * @return the horarioFim
     */
    public String getHorarioFim() {
        return horarioFim;
    }

    /**
     * @param horarioFim the horarioFim to set
     */
    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    /**
     * @return the andar
     */
    public String getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(String andar) {
        this.andar = andar;
    }

    /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
