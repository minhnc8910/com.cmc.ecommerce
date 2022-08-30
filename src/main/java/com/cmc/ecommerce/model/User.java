package com.cmc.ecommerce.model;

import java.util.Date;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Byte deleteYn;

    private Date createdDtm;

    private Long createdId;

    private Date updatedDtm;

    private Long updatedId;

    private Byte roleId;
}