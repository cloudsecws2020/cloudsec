package com.secdevops.webapp.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User {

    @Id
    @Column
    @Getter
    private int id;

    @Column
    @NotNull(message = "{NotNull.User.firstName}")
    @Getter
    private String firstName;

    @Column
    @NotNull(message = "{NotNull.User.lastName}")
    @Getter
    private String lastName;

    @Column
    @NotNull(message = "{NotNull.User.email}")
    @Getter
    private String email;

	public int getId() {
		return this.id;
	}
}
