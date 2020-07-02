package tw.com.phctw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "userinfo", catalog = "maven")
public class Userinfo implements Serializable {
	// Fields
	private Integer id;
	private String username;
	private Integer age;

	// Constructors
	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(String username, Integer age) {
		this.username = username;
		this.age = age;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
}
