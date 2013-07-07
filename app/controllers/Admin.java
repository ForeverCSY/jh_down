package controllers;

import play.*;
import play.mvc.*;

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
	public static void writeSourceInfo(){
		
		render();
	}
	
	public static void releaseSource() {
		
	}
	
}
