package com.example.dto;

import java.time.LocalDate;
import java.util.List;



public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private long bankCard;
    private long idCode;
    private LocalDate time;
    public UserDTO()
    {

    }

    public UserDTO(final String firstName, final String lastName, final int age,final long bankCard,final long idCode, final LocalDate time) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bankCard = bankCard;
        this.idCode = idCode;
        this.time = time;


    }

    public UserDTO(final Long id, final String firstName, final String lastName, final int age,final long bankCard,final long idCode, final LocalDate time) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bankCard = bankCard;
        this.idCode = idCode;
        this.time = time;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBankCard() {
        return bankCard;
    }

    public void setBankCard(long bankCard) {
        this.bankCard = bankCard;
    }

    public long getIdCode() {
        return idCode;
    }

    public void setIdCode(long idCode) {
        this.idCode = idCode;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
