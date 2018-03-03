package edu.bupt.iblog.entity.shiro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.bupt.iblog.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = -778376511560539923L;

	@Column
	private String username;
	
	@Column
	private String password;
}
