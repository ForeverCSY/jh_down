package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;
import sun.security.util.BigInt;


@Entity
@Table(name="down_software")
public class Software extends Model {
	
	@Required
	public String source_name;
	
	@Required
	public String type;//分类
	
	public String kind;//文件类型
	
	public String size;
	
	public String path;
	
	public Date release_date;
	
	public String file_name;
	
	public String image;
	
	public String intro;
	
	public String brief_intro;
	
	public int counter;
	
	public Software(String source_name, 
			String type, 
			String intro, 
			String img_path){
		
		this.source_name = source_name;
		this.type = type;
		this.intro = intro;
		this.image = img_path;
	}
	
	
	
}