package com.taobao.autopersistence.engine.builder;
/**
 * 
 * 类ResourceBuilder.java的实现描述：
 * @author zhanzui.ldh 2012-10-10 上午10:00:19
 */
public interface ResourceBuilder {
    
    /**
     * 初始化
     * @return
     */
   public void init();
   
   /**
    * 实际调的方法
    */
   public void doWork();
   
    /**
     * 创建文件目录
     * @return
     */
   public void createFileDir();
   /**
    * 生成文件
    */
   public void buildFile();
}
