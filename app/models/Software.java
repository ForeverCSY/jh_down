package models;

import java.io.File;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;


@Entity
@Table(name="software")
public class Software extends Model {
	
	@Required
	public String source_name;
	
	@Required
	public String type;
	
	public String kind = "";
	
	public String size = "";
	
	public String path = "";
	
	
	
	public Software(String source_name, String type){
		
		this.source_name = source_name;
		this.type = type;
		
		
	}
	
	
	
}