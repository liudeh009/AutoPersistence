package com.taobao.autopersistence.util;

/**
 * 
 * ��StringUtils.java��ʵ���������ַ���������
 * @author zhanzui.ldh 2013-6-4 ����10:00:08
 */
public class StringUtils {
  /**
   * ȥ���ַ������ߵĿհ��ַ�
   * @param text
   * @return
   */
  public static String trim(String text){
      if(text == null){
          return null;
      }
      return text.trim();
  }
  
  /**
   * �ַ����Ƿ�Ϊ���ж�
   * @param text
   * @return
   */
  public static boolean isBlank(String text){
      if(text == null || "".equals(text.trim())){
          return true;
      }
      return false;
  }
  
  /**
   * ��дתСд
   * @param projectName
   * @return
   */
  public static String upperToLower(String projectName){
      StringBuilder sb = new  StringBuilder("");
      for(int i = 0;i<projectName.length();i++){
          sb.append(projectName.substring(i,i+1).toLowerCase());
      }
      return sb.toString();
  }
}
