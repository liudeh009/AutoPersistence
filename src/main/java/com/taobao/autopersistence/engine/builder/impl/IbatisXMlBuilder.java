package com.taobao.autopersistence.engine.builder.impl;

import java.io.File;
import org.apache.velocity.VelocityContext;
import com.taobao.autopersistence.context.PersistenceContext;
import com.taobao.autopersistence.engine.builder.AbstractResourceBuilder;
import com.taobao.autopersistence.vo.JavaVO;
import com.taobao.autopersistence.vo.TableVO;

/**
 * 
 * ��IbatisXMlBuilder.java��ʵ������������xxx.ibatis.xml�ļ�
 * @author zhanzui.ldh 2012-10-10 ����10:03:35
 */
public class IbatisXMlBuilder extends AbstractResourceBuilder {
    private String ibatisDir;
    
    public IbatisXMlBuilder(PersistenceContext context){
        super(context);
    }
    
    
    @Override
    public void buildFile() {
        try {
            for(int i=0;i< javaVOList.size();i++){
                VelocityContext vc = new VelocityContext();
                JavaVO javaVO = javaVOList.get(i);
                TableVO tableVO = databaseVO.getTableList().get(i);
                vc.put("javaVO", javaVO);
                vc.put("tableVO", tableVO);
                vc.put("charset", context.getString("charset"));
                File file = new File(ibatisDir + "/"+javaVO.getSimpleClassName()+".ibatis.xml");
                if(!file.exists()){
                    file.createNewFile();
                }
                transform("template/ibatis/template.ibatis.xml",file, vc);
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createFileDir() {
        //����ibatis�ļ�Ŀ¼
        String resource = context.getString("resource");
        ibatisDir = resource + "/conf/ibatis";
        File file = new File(ibatisDir);
        if(!file.exists()){
            file.mkdirs();
        }
    }

}
