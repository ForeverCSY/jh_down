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
	
	/*
	 * releaseSource 接受两个参数
	 * 1. List对象，含有文件信息
	 * 2. 需要发布的对象的list编号
	 * 
	 * */
	public static void writeSourceInfo(String imageUUID){
		if (imageUUID == null) {
			imageUUID = "/public/images/war3.jpg";
		}
		render(imageUUID);
	}
	
	public static void releaseSource() {
		
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
		writeSourceInfo(path);
	}
	
	
}
