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
		this.query = "SELECT * FROM WHERE = " + id;
		return db.getRows(this.query);
	}
	/**
	 * return rows for given coordinates
	 * @param x : int
	 * @param y : int 
	 * @return results : ResultSet
	 */
	public ResultSet getPoiByCoord(int x, int y){
		this.query = "SELECT * FROM ";
		return db.getRows(this.query);
	}
	public ResultSet getPoiByX(int x){
		return db.getRows(this.query);

	}
	public ResultSet getPoiByY(int y){
		return db.getRows(this.query);

	}
	public ResultSet getPoiByName(String name){
		return db.getRows(this.query);

	}
	public ResultSet getPoiByLabel(String label){
		return db.getRows(this.query);

	}
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
