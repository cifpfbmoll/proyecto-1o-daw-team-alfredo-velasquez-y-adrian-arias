/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy_clothes;

import java.util.Date;

/**
 *
 * @author Mamey
 */
public class User {
    /**
    * El id del usuario
    */
    private Integer id;
    /**
    * El nombre del usuario
    */
    private String name;
    /**
    * El apellido del usuario
    */
    private String last_name;
    /**
    * El género del usuario F/M
    */
    private String gender;
    /**
    * La identificación del usuario NIE/DNI
    */
    private String identification;
    /**
    * El blance de saldo del usuario
    */
    private Double balance;
    /**
    * El role del usuario ADMIN/GUEST/REGISTERED
    */
    private String role;
    /**
    * La fecha de nacimiento del usuario
    */
    private Date birthdate;
    /**
    * La dirección del usuario
    */
    private String address;
    /**
    * El número de teléfono del usuario
    */
    private Integer phone;

    /**
    * <p>Metodo constructor creación de usuario con parametros
    * </p>
     * @param name
     * @param last_name
     * @param gender
     * @param identification
     * @param balance
     * @param role
     * @param birthdate
     * @param address
     * @param phone
    * @since 1.0
    */
    public User(String name, String last_name, String gender, String identification, Double balance, String role, Date birthdate, String address, Integer phone) {
        this.name = name;
        this.last_name = last_name;
        this.gender = gender;
        this.identification = identification;
        this.balance = balance;
        this.role = role;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
    }

    /**
    * <p>Metodo que devuelve el id del usuario
    * </p>
    * @return id
    * @since 1.0
    */
    public Integer getId() {
        return id;
    }

    /**
    * <p>Metodo que setea el id del usuario
    * </p>
     * @param id
    * @since 1.0
    */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * <p>Metodo que devuelve el nombre del usuario
    * </p>
    * @return name
    * @since 1.0
    */
    public String getName() {
        return name;
    }

    /**
    * <p>Metodo que setea el nombre del usuario
    * </p>
     * @param name
    * @since 1.0
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * <p>Metodo que devuelve el apellido del usuario
    * </p>
    * @return last_name
    * @since 1.0
    */
    public String getLast_name() {
        return last_name;
    }

    /**
    * <p>Metodo que setea el apellido del usuario
    * </p>
     * @param last_name
    * @since 1.0
    */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
    * <p>Metodo que devuelve el género del usuario
    * </p>
    * @return gender
    * @since 1.0
    */
    public String getGender() {
        return gender;
    }

    /**
    * <p>Metodo que setea el género del usuario
    * </p>
     * @param gender
    * @since 1.0
    */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
    * <p>Metodo que devuelve la identificación del usuario
    * </p>
    * @return identification
    * @since 1.0
    */
    public String getIdentification() {
        return identification;
    }

    /**
    * <p>Metodo que setea la identificación del usuario
    * </p>
     * @param identification
    * @since 1.0
    */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
    * <p>Metodo que devuelve el balance del usuario
    * </p>
    * @return balance
    * @since 1.0
    */
    public Double getBalance() {
        return balance;
    }

    /**
    * <p>Metodo que setea el balance del usuario
    * </p>
     * @param balance
    * @since 1.0
    */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
    * <p>Metodo que devuelve el role del usuario
    * </p>
    * @return role
    * @since 1.0
    */
    public String getRole() {
        return role;
    }

    /**
    * <p>Metodo que setea el role del usuario
    * </p>
     * @param role
    * @since 1.0
    */
    public void setRole(String role) {
        this.role = role;
    }

    /**
    * <p>Metodo que devuelve la fecha de nacimiento del usuario
    * </p>
    * @return birthdate
    * @since 1.0
    */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
    * <p>Metodo que setea la fecha de nacimiento del usuario
    * </p>
     * @param birthdate
    * @since 1.0
    */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
    * <p>Metodo que devuelve la dirección del usuario
    * </p>
    * @return address
    * @since 1.0
    */
    public String getAddress() {
        return address;
    }

    /**
    * <p>Metodo que setea la dirección del usuario
    * </p>
     * @param address
    * @since 1.0
    */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
    * <p>Metodo que devuelve el teléfono del usuario
    * </p>
    * @return id
    * @since 1.0
    */
    public Integer getPhone() {
        return phone;
    }

    /**
    * <p>Metodo que setea el teléfono del usuario
    * </p>
     * @param phone
    * @since 1.0
    */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }   
}
