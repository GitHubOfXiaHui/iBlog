package edu.bupt.iblog.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -7488866291218450703L;

	@Id @GeneratedValue
	protected Long id;
	
	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	protected Timestamp createTime;
	
	@Column(name = "last_modified")
	@Temporal(TemporalType.TIMESTAMP)
	protected Timestamp lastModified;
}
