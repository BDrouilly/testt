package miniSIG;

import java.sql.*;
import mapping.*;

public class test {

	public static void main(String[] args) {
            MappingPoi mpoi = new MappingPoi();
            ResultSet rs;
            
            mpoi.SearchPOI("le rez", "cate", 1);
	}

}
