package cn.bdqn.enumpackage;

/**
 * 针对于性别的枚举类
 */
public enum Gender {

	// 需要创建枚举值
	MAN("男"), WOMAN("女");

	private String genderSex;

	private Gender(String name) {
		this.genderSex = name;

	}

	public String getGenderSex() {
		return genderSex;
	}

	public void setGenderSex(String genderSex) {
		this.genderSex = genderSex;
	}

}
