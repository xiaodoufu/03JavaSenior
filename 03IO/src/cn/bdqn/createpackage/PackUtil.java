package cn.bdqn.createpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 在项目中生成各种包的工具类
 */
public class PackUtil {

	private static final String TEST = "cn/bdqn/test";
	private static final String BEAN = "cn/bdqn/bean";
	private static final String UTIL = "cn/bdqn/util";
	private static final String DAO = "cn/bdqn/dao";
	private static final String SERVICE = "cn/bdqn/service";
	private static final String ACTION = "cn/bdqn/action";

	private static List<String> PAGE_LIST;

	static {
		PAGE_LIST = new ArrayList<>();
		PAGE_LIST.add(BEAN);
		PAGE_LIST.add(TEST);
		PAGE_LIST.add(UTIL);
		PAGE_LIST.add(DAO);
		PAGE_LIST.add(SERVICE);
		PAGE_LIST.add(ACTION);
	}

	/**
	 * 根据用户传递过来的路径 我们做更改
	 * 
	 * E:\java\03IO   E:\\java\\03IO\\src\\        cn\\bdqn\\test
	 */
	public static String changePath(String path) {
		return new StringBuilder(path.replace("/", "\\")).append("/src/")
				.toString();
	}

	/**
	 * workspace   System.getProperty("user.dir")
	 * 
	 */
	public static void createPackages(String workspace) {
		for (int i = 0; i < PAGE_LIST.size(); i++) {
			File file = new File(new StringBuilder(changePath(workspace))
					.append(PAGE_LIST.get(i)).toString());
			file.mkdirs();
		}
		System.out.println("所有文件创建成功！");
	}

}
