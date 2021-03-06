package com.xzcode.jdbclink.codegen.custom.extra;

import java.util.Collections;
import java.util.Map;

import com.xzcode.jdbclink.codegen.model.TableEntityInfo;

/**
 * 
 * 默认额外模版数据生成器
 * 
 * @author zai
 * 2018-04-19
 */
public class DefaultExtraDataGenerator implements IExtraTemplateDataGenerator {

	@Override
	public Map<String, Object> generate(TableEntityInfo tableEntityInfo) {
		Map<String, Object> emptyMap = Collections.emptyMap();
		emptyMap.put("tableInfo", tableEntityInfo);
		return emptyMap;
	}

}
