package cn.bdqn.user;

import java.io.Serializable;

/**
 * 用户的实体类
 */
public class User implements Serializable {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public User() {
		super();
	}

	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

}
