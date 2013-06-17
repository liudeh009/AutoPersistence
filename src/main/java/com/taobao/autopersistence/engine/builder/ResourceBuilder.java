package com.taobao.autopersistence.engine.builder;
/**
 * 
 * ��ResourceBuilder.java��ʵ��������
 * @author zhanzui.ldh 2012-10-10 ����10:00:19
 */
public interface ResourceBuilder {
    
    /**
     * ��ʼ��
     * @return
     */
   public void init();
   
   /**
    * ʵ�ʵ��ķ���
    */
   public void doWork();
   
    /**
     * �����ļ�Ŀ¼
     * @return
     */
   public void createFileDir();
   /**
    * �����ļ�
    */
   public void buildFile();
}
