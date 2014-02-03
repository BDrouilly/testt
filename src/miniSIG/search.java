/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miniSIG;
import java.sql.*;
import DataLayer.*;

/**
 *
 * @author Ugo
 */
public class search {
    
    static ResultSet SearchPOI(String search, String categorie, int mapID) {//fonction de recherche
        try {
            PreparedStatement requete;
            ResultSet rs;
            int i = 0; //compteur
            
            String sql = "SELECT POI_ID, POI_NAME FROM TB_POI INNER JOIN TB_MAP ON TB_POI.MAP_ID = TB_MAP.MAP_ID "
                  +   "WHERE MAP_ID=? " 
                    +"AND POI_CATEGORIE=? " +
                    "AND ("; //debut de requete sql
            String mots[] = search.split(" ");//On separe la chaine en mots cles
            for (String mot : mots) {//pour chaque mot
                i++; //incrÃ©mente compteur
                sql += " POI_NAME LIKE ?" + " OR POI_DESCRIPTION LIKE ?" +  " OR"; //on ajoute la recherche Ã  la requete SQL en crÃ©ant des param avec le compteur
            }
            sql += " 1=0 )"; //on ajoute la fin de la requete, avec une condition or toujours fausse et une limite au nb de resultats

            requete = DatabaseHandler.connection.prepareStatement(sql); //on prepare la requete

            
             i = 0; //on reinitialise le compteur
             for (String mot : mots) {//pour chaque mot clÃ©
                i++; //incrmente le compteur pour faire correspondre au param crÃ©Ã©  la boucle prÃ©cÃ©dente
                mot = "%" + mot + "%"; //on ajout des % pour le LIKE sql
                requete.setString(i+2, mot);
                i++;
                requete.setString(i+2, mot);
            }

             categorie = "%" + categorie + "%"; //on ajout des % pour le LIKE sql
             requete.setString(2, categorie);
             if(mapID >= 0)
                requete.setInt(1, mapID);
             else
                 requete.setString(1, "*");

            rs = requete.executeQuery();//on execute la requete
            requete.close();

            
            return rs; //renvoie le tableau de resultats
        } catch (SQLException e) {
            System.out.printf("Erreur :" + e.getCause() + "</br>" + e.getMessage());
            ResultSet rs = null;
            return rs;
        }
    }
    
    
    
    static ResultSet SearchPOI(String search, String categorie, int mapID) {//fonction de recherche
            PreparedStatement requete;
            ResultSet rs;
           
                
            int i = 0; //compteur
            
            String sql = "SELECT POI_ID, POI_NAME FROM TB_POI INNER JOIN TB_MAP ON TB_POI.MAP_ID = TB_MAP.MAP_ID ";
            
            if (mapID > 0)
                sql += "WHERE MAP_ID= " + mapID + "AND ";
            else
                sql += "WHERE ";
                        
            sql += " POI_CATEGORIE=%" + categorie + "%" +  
                    " AND ("; //debut de requete sql
            String mots[] = search.split(" ");//On separe la chaine en mots cles
            for (String mot : mots) {//pour chaque mot
                sql += " POI_NAME LIKE %" + mot + "% OR POI_DESCRIPTION LIKE %" + mot + "% OR"; //on ajoute la recherche Ã  la requete SQL en crÃ©ant des param avec le compteur
            }
            sql += " 1=0 )"; //on ajoute la fin de la requete, avec une condition or toujours fausse et une limite au nb de resultats

        
            rs = db.getRows(sql);//on execute la requete
         
            return rs; //renvoie le tableau de resultats
      
    }
    
    
    
}

