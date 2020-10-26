package com.linghu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/*
* 测试文件的Action
*
* */
public class FileAction extends ActionSupport {
    private File aaa;


    public String upload() throws IOException {
        /*
        * 1.搜集数据
        * 2.处理业务
        * 3.流程跳转
        * */
        FileInputStream fileInputStream = new FileInputStream(aaa);
        //根据Upload文件夹的相对路径获取绝对路径
        String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
        //获取文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream(new File(realPath + "1.jpg"));
        //文件拷贝
        byte [] b=new byte[1024];
        int lenth=0;
        while (true){
            lenth=fileInputStream.read(b);
            if (lenth==-1) break;
            fileOutputStream.write(b,0,lenth);
            IOUtils.copy(fileInputStream,fileOutputStream);

        }
        //关流
        fileInputStream.close();
        fileOutputStream.close();


        return "OK";
    }

    public File getAaa() {
        return aaa;
    }


    public void setAaa(File aaa) {
        this.aaa = aaa;
    }
}
