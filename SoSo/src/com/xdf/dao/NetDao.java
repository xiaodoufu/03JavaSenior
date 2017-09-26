package com.xdf.dao;

import com.xdf.bean.User;

/**
 *  上网功能接口
 */
public interface NetDao {

	/**
	 * @param user   谁上网
	 * @param flows    上网流量
	 * @return        需要根据上网流量计算消费金额
	 * @throws Exception    上网中可能出现的异常
	 */
	int netPlay(User user, int flows) throws Exception;

}
