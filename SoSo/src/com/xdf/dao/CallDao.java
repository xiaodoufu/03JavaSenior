package com.xdf.dao;

import com.xdf.bean.User;

/**
 *  打电话功能接口
 */
public interface CallDao {

	/**
	 * @param user   谁打的电话
	 * @param time    通话时长
	 * @return        需要根据通话时长计算消费金额
	 * @throws Exception    打电话过程中可能出现的异常
	 */
	int call(User user, int time) throws Exception;

}
