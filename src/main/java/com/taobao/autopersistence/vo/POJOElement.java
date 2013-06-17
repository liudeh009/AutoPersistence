package com.taobao.autopersistence.vo;

public class POJOElement {
    /**
     * ���ж�Ӧ��java��pojo������
     */
    private String javaName;
    /**
     * ���ж�Ӧ��java��pojo��������
     */
    private String javaType;
    /**
     * ���ж�Ӧ��java��pojo���Լ�����,��java.lang.Integer�ļ�����ΪInteger
     */
    private String javaSimpleType;
    /**
     * pojo����ע��
     */
    private String remarks;
    
    public String getJavaName() {
        return javaName;
    }
    
    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }
    
    public String getJavaType() {
        return javaType;
    }
    
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }
    
    public String getJavaSimpleType() {
        return javaSimpleType;
    }
    
    public void setJavaSimpleType(String javaSimpleType) {
        this.javaSimpleType = javaSimpleType;
    }

    
    public String getRemarks() {
        return remarks;
    }

    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
