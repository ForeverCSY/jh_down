package controllers;

import play.*;
import play.libs.Files;
import play.mvc.*;

import java.io.File;
import java.util.*;

import models.*;

/**
 * @author zarzen
 *
 */
public class Admin extends Controller {
	
	public static void login(){
		
	}
	
	
	/*
	 * manageSource需要调用一个list函数，返回所有在tmp目录中的文件
	 * 
	 * */
	public static void manageSource(){
		
		render();
	}
	
	public static void choice(String fileName) {
		
	}
	
	/*
	 * 从manageSource，跳转到write info 中间调用 choice方法，在session中存下对应file的信息
	 * 然后writeSourceInfo 页面中先调用uploadImage上传文件。（这里暂时做不出ajax）
	 * 回转到writeSourceInfo页面，填写剩下的文件信息，完成后调用releaseSource方法
	 *  
	 * */
	public static void writeSourceInfo(){
		String imageUUID = session.get("imageUUID");
		if (imageUUID == null) {
			imageUUID = "/public/images/war3.jpg";
		}
		render(imageUUID);
	}
	
	public static void releaseSource(String source_name, String source_type, String source_info, String source_img_path) {
		Software software = new Software(source_name, source_type, source_info, source_img_path);
		software.kind = source_img_path.substring(source_img_path.lastIndexOf('.')).toLowerCase();

		//软件目录，需要指定一个路径，还需要filename,filename通过session获得
		//String file_name =session.get("fileName");
		//文件目录需要做移动
		String fileName = "testtesttest.rar";
		software.path = "/data/attachments/"+fileName;
		software.file_name = fileName;
		//获取时间
		software.release_date = new Date().toString();
		//获取文件大小
		software.size = getFileSize(software.path);
		
		software.save();
	}
	
	public static void uploadImage(File image){
		if (image == null) {
			System.err.println("image is null");
			//System.err.println(test_test);
		}
		String imageType=image.getName().substring(image.getName().lastIndexOf('.')).toLowerCase();
		UUID uuid = UUID.randomUUID();
		String imageNewName=uuid+imageType;
		String path="/public/images/cover/"+imageNewName;
		
		Files.copy(image, Play.getFile(path));
		session.put("imageUUID", path);
		writeSourceInfo();
	}
	
	//获取文件大小
	private static String getFileSize(String filePath) {
		
		return "231412423";
	}
	
	
}
