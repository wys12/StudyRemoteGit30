package com.yc.taokefu.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.yc.taokefu.entity.Login;

public class ServletUtil {
	public static String ERROR_MESSAGE="errorMsg";
	public static String DEPLOY_NAME;//项目发布名
	public static String LOGIN_USER="loginUser";//登录用户
	public static String UPLOAD_DIR_PATH;
	public static final String VARTUAL_UPLOAD_DIR = "/upload/";
	public static String UPLOAD_DIR;//文件上传目录 
	public static Map<String, String> userMap;
	
	public static File getUploadFile(String fileName){

		File file=new File(UPLOAD_DIR,fileName); //上传文件

		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs(); //如果不存在就创建
		}

		return file;
	}
}
