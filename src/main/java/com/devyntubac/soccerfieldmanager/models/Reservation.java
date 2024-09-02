package com.devyntubac.soccerfieldmanager.models;

import java.io.Serializable;
import java.sql.Date;

import com.devyntubac.soccerfieldmanager.utils.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="reservation")
public class Reservation implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date starTime;
    private Date endTime;
    private String payment;

    private Status status;

    @ManyToOne
    private User user;
    @ManyToOne
    private SoccerField soccerField;


}
