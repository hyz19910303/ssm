package com.hyz.evil.config.datasource;

/**
 * Create at 2018年1月2日 下午3:11:33
 *
 * @autuor EVIL
 *
 * @version 1.0
 *
 *          ProjectName SSMConfig
 *
 *          Description:
 * 
 */
public class DynamicDataSourceHolder {
	private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal<String>();

	public static String getDataSource() {
		return THREAD_DATA_SOURCE.get();
	}

	public static void setDataSource(String dataSource) {
		THREAD_DATA_SOURCE.set(dataSource);
	}

	public static void clearDataSource() {
		THREAD_DATA_SOURCE.remove();
	}
}
