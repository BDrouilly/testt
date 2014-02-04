package miniSIG;
import java.sql.ResultSet;
import mapping.MappingPoi;
import GUI.Window;

public class test {

	public static void main(String[] args) {
            MappingPoi mpoi = new MappingPoi();
            ResultSet rs;
            Window fen = new Window();
            fen.setVisible(true);
            mpoi.SearchPOI("le rez", "cate", 1);
	}

}
