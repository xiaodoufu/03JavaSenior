package cn.bdqn.collections;

/**
 * 新闻的实体类
 */
public class News implements Comparable {
	private int id;
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public News(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public News() {
		super();
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + "]";
	}

	/**
	 * news对象排序的规则
	 */
	@Override
	public int compareTo(Object o) {
		News news = (News) o;
		if (news.getId() == this.id) {
			return 0;
		} else if (news.getId() < this.id) {
			return 1; // 降序 return -1
		} else {
			return -1; // 降序 return 1
		}
	}

}
