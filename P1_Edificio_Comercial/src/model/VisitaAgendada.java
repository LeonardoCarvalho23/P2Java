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
public class VisitaAgendada {
    
    private String nome;
    private String documento;
    private String email;
    private String telefone;
    private String andar;
    private String sala;
    private String horario;
    
    public VisitaAgendada(){
        
    }
    public VisitaAgendada(String nome,String documento,String email,String telefone,String andar,String sala,String horario){
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.andar = andar;
        this.sala = sala;
        this.horario = horario;
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
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
