package com.kitowcyteam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;

import com.kitowcyteam.enums.Country;
import com.kitowcyteam.enums.FootballTeam;

import lombok.Getter;
import lombok.Setter;

/**
 * User entity.
 * 
 * @author PWOJTKOW
 *
 */
@Getter
@Setter
@Entity
public class UserEntity extends BaseEntity {

	@Column(nullable = false)
	private String login;
	
	@Column(nullable = false)
	private String password;
	
	private String name;
	
	private String surname;
	
	@Email
	private String email;
	
	private FootballTeam favoriteTeam;
	
	private Country country;
	
	private int points;
	
}
