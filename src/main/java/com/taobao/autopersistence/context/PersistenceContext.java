package com.taobao.autopersistence.context;

import java.util.HashMap;
import java.util.Map;

/**
 * ��PersistenceContext.java��ʵ��������
 * ������
 * @author zhanzui.ldh 2012-9-27 ����1:31:51
 */
public class PersistenceContext {

    private Map<String, Object> contextMap = new HashMap<String, Object>();

    public void put(String key, Object value) {
        contextMap.put(key, value);
    }
    
    public String getString(String key) {
        return (String)contextMap.get(key);
    }
    
    public Object get(String key) {
        return contextMap.get(key);
    }
}
