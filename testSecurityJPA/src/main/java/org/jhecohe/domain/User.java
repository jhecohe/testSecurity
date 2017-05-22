package org.jhecohe.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private Long userid;
	
	@Column(unique= true, nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String firstname;
	@Column(nullable=false)
	private String lastname;
	@Column(unique= true, nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	private Long enable;
	
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="user_roles",
			joinColumns={@JoinColumn(name="user_id")},
			inverseJoinColumns={@JoinColumn(name="role_id")}
			)
	private Set<Role> roles =new HashSet<Role>();
	
	private User(){
		
	}
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getEnable() {
		return enable;
	}
	public void setEnable(Long enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password + ", enable=" + enable + "]";
	}
}
