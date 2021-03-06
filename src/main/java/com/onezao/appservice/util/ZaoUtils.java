package com.onezao.appservice.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 蜗牛
 *  pathSD  :   获取SD卡路径
 */
public class ZaoUtils {
    public static String ONEZAO = "onezao";
    public static String logintoast = "用户名或者密码不能为空！";
    public static String loginToast2 = "登录成功！";
    public static String saveSucc = "保存成功！";
    public static String selectCB = "没有勾选CheckBox哦";
    public static String loginToastSave = "正在保存用户名和密码！";
    public static String loginToastSaveSucc = "保存用户名和密码成功！";
    public static String loginToastSaveFail = "保存用户名和密码失败！";
    public static String SELECTGENDERANDNAME = "请输入姓名并选择性别！";
    public static String DIALOG_TITLE = "版本更新";
    public static String CHECK_VERSION_JSON_URL2 = "http://www.onezao.com/zao.apk";
    public static String CHECK_VERSION_JSON_URL1 = "http://www.wanandroid.com/tools/mockapi/7828/update0725json";
    public static String CHECK_VERSION_JSON_URL = "https://coding.net/api/share/download/ff61ea71-517e-41c4-b688-7b08b832002d";
    public static int CHECKVERSIONCONTIME = 6000;



    //获取系统时间。
    public  static String getSystemTime(){
        //	SimpleDateFormat    formatter    =   new    SimpleDateFormat    ("yyyy年MM月dd日 HH:mm:ss ");
        SimpleDateFormat formatter    =   new    SimpleDateFormat    ("yyyy-MM-dd HH:mm:ss ");
        Date curDate    =   new    Date(System.currentTimeMillis());//获取当前时间
        String    str    =    formatter.format(curDate);
        return str;
    }

    //获取系统时间。
    public  static String getSystemTimeHello(){
        Date date    =   new    Date(System.currentTimeMillis());//获取当前时间

        SimpleDateFormat formatter =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EEEE");
        //2018年07月24日 15时16分27秒 星期二
        System.out.println( "time1="+formatter.format(date));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE");
        System.out.println( "time2="+format.format(date));
        format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println( "time2="+format.format(date));
        format=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println( "time3="+format.format(date));
        format=new SimpleDateFormat("HH:mm:ss");
        System.out.println( "time4="+format.format(date));
        format=new SimpleDateFormat("EEEE");
        System.out.println( "time5="+format.format(date));
        format=new SimpleDateFormat("E");
        System.out.println( "time6="+format.format(date));

        //	SimpleDateFormat    formatter    =   new    SimpleDateFormat    ("yyyy年MM月dd日 HH:mm:ss ");
//        SimpleDateFormat formatter    =   new    SimpleDateFormat    ("yyyy年MM月dd日 , EEEE ");
        SimpleDateFormat formatter2    =   new    SimpleDateFormat    ("yyyy年MM月dd日 ，EEEE ");
        String    str    =    formatter.format(date);
        return str;
    }

    //时间转换
    public static String  tranTime(String    time){
        SimpleDateFormat    formatter    =   new    SimpleDateFormat    ("yyyy-MM-dd HH:mm:ss ");
        Date    curDate    =   new    Date(Long.valueOf(time));//获取当前时间
        String    str    =    formatter.format(curDate);
        return str;
    }

    //复制文件
    public static void copyFile(String path1,String path2) {
        // TODO Auto-generated method stub
        //封装数据源
        FileInputStream fis;
        try {
            fis = new FileInputStream(new File(path1));
            //封装目的地
            FileOutputStream fos = new FileOutputStream(new File(path2));

            int by = 0;
            while((by = fis.read()) != -1){
                fos.write(by);
            }
            //释放资源(先关谁都行)
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取文件
    public static String readFile(String  path){
        File  file =  new  File(path);
        try {
            BufferedReader bf = new  BufferedReader(new FileReader(file));
            String  content  =  "";
            StringBuilder  sb =  new  StringBuilder();
            while(content != null){
                content = bf.readLine();
                if(content == null){
                    break;
                }
                sb.append(content.trim());
            }
            bf.close();
            return sb.toString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return  null;
        }
    }

    //睡眠
    public static void  sleep(long  time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

