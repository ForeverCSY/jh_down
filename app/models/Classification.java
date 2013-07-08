package models;

import java.io.File;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;


@Entity
@Table(name="down_classification")
public class Classification extends Model {
	
	@Required
	public String first_level;
	
	@Required
	public String second_level;
	
	public Classification(String first, String second){
		
		this.first_level = first;
		this.second_level = second;
	}
	
}