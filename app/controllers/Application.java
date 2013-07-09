package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(int page) {
    	
    	/*
    	 * 没有值传给page时，默认为page = 0；
    	 * 但是fetch要求start = 1，才是复合分页逻辑的
    	 * */
    	if (page == 0) {
			page = 1;
		}
    	List<Software> softs = Software.find("order by id desc").fetch(page, 5);
    	long dividePage = Software.count();
    	dividePage = dividePage/5 + 1;
    	
    	
    	String fitstString = "软件";
    	List<Classification> classifications = Classification.find("first_level=?", fitstString).fetch();
    	
        render(softs, classifications, dividePage, page);
        
    }
    
    public static void showDetail(String id){
    	
    	render();
    }
    

}