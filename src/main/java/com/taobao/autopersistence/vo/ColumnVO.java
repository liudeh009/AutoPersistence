package com.taobao.autopersistence.vo;
/**
 * 
 * ��ColumnVO.java��ʵ������������ж���
 * @author zhanzui.ldh 2012-9-15 ����4:22:05
 */
public class ColumnVO {
    /**
     * ������
     */
    private String columnName;
    /**
     * ����������
     */
    private String columnType;
    /**
     * ��ע��
     */
    private String columnRemarks;
    
    public String getColumnName() {
        return columnName;
    }
    
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    
    public String getColumnType() {
        return columnType;
    }
    
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnRemarks() {
        return columnRemarks;
    }
    
    public void setColumnRemarks(String columnRemarks) {
        this.columnRemarks = columnRemarks;
    }
}
