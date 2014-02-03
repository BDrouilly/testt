/**
 * TODO Add body to methods and table/fields name to queries
 */
package mapping;

import java.sql.*;

import DataLayer.DatabaseHandler;

/**
 * @author SamuelD
 * Mapping class between Poi and database
 */
public class MappingPoi {
	private String query;
	private DatabaseHandler db;
	
	public MappingPoi(){
		this.db = new DatabaseHandler();
	}
	/**
	 * Returns rows for given id
	 * @param id
	 * @return results : ResultSet
	 */
	public ResultSet getPoiById(int id){
		this.query = "SELECT * FROM TB_POI WHERE POI_ID = " + id;
		return db.getRows(this.query);
	}
	/**
	 * return rows for given coordinates
	 * @param x : int
	 * @param y : int 
	 * @return results : ResultSet
	 */
	public ResultSet getPoiByCoord(int x, int y){
		this.query = "SELECT * FROM TB_POI WHERE (POI_X = " + x + " AND POI_Y = " + y + ")";
		return db.getRows(this.query);
	}
	/**
	 * return rows for given horizontal coordinate
	 * @param x : int
	 * @return results : Resultset
	 */
	public ResultSet getPoiByX(int x){
		this.query = "SELECT * FROM TB_POI WHERE POI_X = " + x;
		return db.getRows(this.query);
	}
	/**
	 * return rows for given vertical coordinate
	 * @param y : int
	 * @return results : ResultSet
	 */
	public ResultSet getPoiByY(int y){
		this.query = "SELECT * FROM TB_POI WHERE POI_Y = " + y;
		return db.getRows(this.query);
	}
	/**
	 * return rows for given POI name
	 * @param name : String
	 * @return results : ResultSet
	 */
	public ResultSet getPoiByName(String name){
		this.query = "SELECT * FROM TB_POI WHERE POI_NAME = " + name;
		return db.getRows(this.query);
	}
	/**
	 * return rows for given POI label
	 * @param label : String
	 * @return results : ResultSet
	 */
	public ResultSet getPoiByLabel(String label){
		this.query = "SELECT * FROM TB_POI WHERE POI_LABEL = " + label;
		return db.getRows(this.query);		
	}
	/**
	 * add a new POI into 
	 * @param name
	 * @param x
	 * @param y
	 */
	public void setNew(String name, int x, int y){
		
	}
	public void setNew(String name, int x, int y, String label, String test){
		
	}
	public void setNewPoiPicture(int poiId, String pictureUrl){
		
	}
	public void updateFullPoi(String name, int x, int y, String label, String text, int id){
		
	}
	public void updatePoiName(int poiId, String name){
		
	}
	public void updatePoiCoord(int poiId, int x, int y){
		
	}
	public void updatePoiLabel(int poiId, String label){
		
	}
	public void updatePoiText(int poiId, String label){
		
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @param db the db to set
	 */
	public void setDb(DatabaseHandler db) {
		this.db = db;
	}
}
