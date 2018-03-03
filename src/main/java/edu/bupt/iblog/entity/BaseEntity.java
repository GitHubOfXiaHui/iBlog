package edu.bupt.iblog.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -7488866291218450703L;

	@Id @GeneratedValue
	protected Integer id;
	
	@Column(name = "create_time")
	protected Timestamp createTime;
	
	@Column(name = "last_modified")
	protected Timestamp lastModified;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column
	protected String remarks;
}
