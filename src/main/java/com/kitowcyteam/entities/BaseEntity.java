package com.kitowcyteam.entities;

import java.time.LocalTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

/**
 * Base entity with optimistic locking functions parameters. 
 * Class is a parent for others entities.
 * 
 * @author PWOJTKOW
 *
 */
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue
	protected long id;

	@Version
	protected long version;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected LocalTime dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected LocalTime dateUpdate;

}
