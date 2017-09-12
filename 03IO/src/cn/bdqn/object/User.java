package cn.bdqn.object;

import java.io.Serializable;

/**
 * 这个类创建的对象 就可以 序列化
 */
public class User implements Serializable {

	private String name; // 用户名
	private String password; // 密码

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

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
}
