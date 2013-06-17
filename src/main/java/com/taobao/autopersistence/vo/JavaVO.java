package com.taobao.autopersistence.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 
 * ��JavaVO.java��ʵ������������ʵ��java pojo����
 * @author zhanzui.ldh 2012-9-15 ����4:55:05
 */
public class JavaVO {
    /**
     * java pojo���������
     */
    private String simpleClassName;
    
    /**
     * java pojo������ȫ��
     */
    private String className;
   
    /**
     * ��������Ӧ��java������
     */
    private String primaryKey;
    
    /**
     * pojo���õ�����
     */
    Set<String> referenceSet = new HashSet<String>();
    
    private List<POJOElement>  pojoElementList = new ArrayList<POJOElement>();
    
    public String getSimpleClassName() {
        return simpleClassName;
    }
    
    public void setSimpleClassName(String simpleClassName) {
        this.simpleClassName = simpleClassName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }  
    
    public String getPrimaryKey() {
        return primaryKey;
    }

    
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Set<String> getSet() {
        return referenceSet;
    }
    
    public void setSetType(String javaType) {
        referenceSet.add(javaType);
    }


    
    public List<POJOElement> getPojoElementList() {
        return pojoElementList;
    }
    
    public void setPOJOElement(POJOElement pojoElement) {
        pojoElementList.add(pojoElement);
    }
    
    /**
     * pojo���ڰ�������
     * @return
     */
    public String getVOPackage(){
        return className.substring(0,className.lastIndexOf("."));
    }
    
    /**
     * pojo��������Ƶ�����ĸСд,��Ϊ����ʹ��
     * @return
     */
    public String getVO2Param(){
        String cs = new String(new char[]{Character.toLowerCase(simpleClassName.charAt(0))})+simpleClassName.substring(1);
        return cs; 
    }
}
