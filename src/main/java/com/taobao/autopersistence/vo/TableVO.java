package com.taobao.autopersistence.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * ��tableVO.java��ʵ�������������
 * 
 * @author zhanzui.ldh 2012-9-15 ����4:12:28
 */
public class TableVO {
    /**
     * ���ݱ�����
     */
    private String tableName;
    /**
     * ����
     */
    private String primaryKey;
    /**
     * ��ע��
     */
    private String remarks;
    
    /**
     * ���ݱ��е��б�
     */
    List<ColumnVO> columnList = new ArrayList<ColumnVO>(); ;
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    public String getPrimaryKey() {
        return primaryKey;
    }

    
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
    public List<ColumnVO> getColumnList() {
        return columnList;
    }

    
    public void setColumnVO(ColumnVO columnVO) {
        columnList.add(columnVO);
    }
   
}
