package com.taobao.autopersistence.engine.builder.impl;

import java.io.File;
import org.apache.velocity.VelocityContext;
import com.taobao.autopersistence.context.PersistenceContext;
import com.taobao.autopersistence.engine.builder.AbstractResourceBuilder;


/**
 * 
 * ��DataSourceXMLBuilder.java��ʵ������������datasource,sqlmap��xml�ļ�
 * @author zhanzui.ldh 2012-10-18 ����02:56:16
 */
public class ApplicationContextXMLBuilder extends AbstractResourceBuilder{
    
    public ApplicationContextXMLBuilder(PersistenceContext context){
           super(context);
    }  
    
    @Override
    public void buildFile() {
        try {
            VelocityContext vc = new VelocityContext();
            vc.put("projectName", context.getString("projectName"));
            vc.put("charset", context.getString("charset"));
            String appContextPath = context.getString("resource");
            File file = new File(appContextPath  + "/applicationContext.xml");
            if(!file.exists()){
                    file.createNewFile();
                }
            transform("template/spring/applicationContext.xml",file, vc);
        }  catch (Exception e) {
            e.printStackTrace();
        } 
    }
 
    @Override
    public void createFileDir() {
        
    }
}
