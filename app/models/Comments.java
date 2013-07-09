package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;


@Entity
@Table(name="down_comments")
public class Comments extends Model {
	@Required
	public String author;
	
	@Required
	public String content;
	
	@Required
	public Date date;
	
	@Required
	public String type;//确定是
	
	@Required
	public long source_id;
	
	public Comments(String author,
			String content,
			String type,
			long source_id) {
		// TODO Auto-generated constructor stub
		
		this.author = author;
		this.content = content;
		this.date = new Date();
		this.type = type;
		this.source_id = source_id;
	}	
	
}