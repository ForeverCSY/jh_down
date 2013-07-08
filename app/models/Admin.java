package models;

import java.io.File;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;


@Entity
@Table(name="down_admin")
public class Admin extends Model {
	
	@Required
	public String username;
	
	@Required
	public String password;
	
	
	public String truename;
	
	
	public Admin(String username, String password){
		
		this.username = username;
		this.password = password;
	}
	
	
	
}