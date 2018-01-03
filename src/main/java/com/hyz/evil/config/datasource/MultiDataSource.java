package com.hyz.evil.config.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
*Create at 2018年1月2日 下午3:09:33
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName SSMConfig
*
*Description: 
*        
*/
public class MultiDataSource extends AbstractRoutingDataSource {

	
	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSource();
	}
	
}
