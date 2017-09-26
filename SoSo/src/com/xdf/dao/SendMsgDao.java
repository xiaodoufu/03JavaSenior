package com.xdf.dao;

import com.xdf.bean.User;

/**
 *  发短信功能接口
 */
public interface SendMsgDao {

	/**
	 * @param user   谁发的信息
	 * @param counts    信息条数
	 * @return        需要根据信息条数计算消费金额
	 * @throws Exception    发信息中可能出现的异常
	 */
	int sendMessage(User user, int counts) throws Exception;

}
