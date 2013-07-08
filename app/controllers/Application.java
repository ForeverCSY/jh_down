package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<Software> softs = Software.find("order by id desc").fetch(0, 5);
    	
    	HashMap<String, String> reference = new HashMap<String, String>();
    	reference.put("about_sys", "【系统相关】");
    	reference.put("about_media", "【多媒体类】");
    	
    	String fitstString = "软件";
    	List<Classification> classifications = Classification.find("first_level=?", fitstString).fetch();
    	
        render(softs, reference, classifications);
    }
    
    public static void showDetail(String id){
    	
    }
    

}