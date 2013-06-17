package com.taobao.autopersistence.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ��DatabaseVO.java��ʵ�����������ݿ����
 * @author zhanzui.ldh 2012-9-15 ����4:12:15
 */
public class DatabaseVO {
    /**
     * ���ݿ�����
     */
    private String dbName;
    /**
     * ���ݿ���б�
     */
    private List<TableVO> tableList = new ArrayList<TableVO>();
    
    public String getDbName() {
        return dbName;
    }
    
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
    
    public List<TableVO> getTableList() {
        return tableList;
    }
    
    public void setTableVO(TableVO tableVO) {
        tableList.add(tableVO);
    }
}
