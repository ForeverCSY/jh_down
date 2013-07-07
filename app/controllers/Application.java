package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Software soft = new Software("zzx23", "dfaf");
    	
    	soft.kind = "dfdf";
    	soft.size = "xx";
    	soft.path = "lll";
    	
    	soft.save();
    	
        render();
    }
    
    public static void showDetail(String id){
    	
    }
    

}