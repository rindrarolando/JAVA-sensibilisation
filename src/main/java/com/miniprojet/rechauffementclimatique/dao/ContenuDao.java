package com.miniprojet.rechauffementclimatique.dao;

import com.miniprojet.rechauffementclimatique.connection.Rescue;
import com.miniprojet.rechauffementclimatique.entities.Comment;
import com.miniprojet.rechauffementclimatique.entities.Information;
import com.miniprojet.rechauffementclimatique.entities.News;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContenuDao {

    public void insertInformation(String title, String description, String url , String rewriting) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("INSERT INTO informations "
                    + "(id,title,description,url,rewriting) "
                    + "VALUES ( DEFAULT, ? , ? , ? , ? ) ");
            pst.setString(1, title);
            pst.setString(2, description);
            pst.setString(3, url);
            pst.setString(4, rewriting);
            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public void deleteInformation(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("DELETE FROM informations WHERE id="+id);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public List<Information> getAllInformations() throws SQLException {
        List<Information> list = new ArrayList<>();
        Connection c = null;
        Statement stmt = null;
        try {
            c = Rescue.connectToDatabase();
            stmt = c.createStatement();
            ResultSet res = stmt.executeQuery("select * from informations");
            while(res.next()){
                int id = res.getInt("id");
                String title = res.getString("title");
                String description = res.getString("description");
                String url = res.getString("url");
                String rewriting = res.getString("rewriting");
                Information info = new Information(id,title,description,url,rewriting);
                list.add(info);
            }
            return list;
        }catch (Exception e){
            return null;
        }finally {
            if(c!=null) c.close();
            if(stmt!=null) stmt.close();
        }
    }

    public void insertNew(String title, String description, String url , String rewriting) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("INSERT INTO news "
                    + "(id,title,description,posted_on,url,rewriting) "
                    + "VALUES ( DEFAULT, ? , ? , NOW() , ?, ? ) ");
            pst.setString(1, title);
            pst.setString(2, description);
            pst.setString(3, url);
            pst.setString(4, rewriting);
            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public void deleteNew(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("DELETE FROM news WHERE id="+id);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public List<News> getAllNews() throws SQLException {
        List<News> list = new ArrayList<>();
        Connection c = null;
        Statement stmt = null;
        try {
            c = Rescue.connectToDatabase();
            stmt = c.createStatement();
            ResultSet res = stmt.executeQuery("select * from news");
            while(res.next()){
                int id = res.getInt("id");
                String title = res.getString("title");
                String description = res.getString("description");
                Date posted_on = res.getDate("posted_on");
                String url = res.getString("url");
                String rewriting = res.getString("rewriting");
                News news = new News(id,title,description,convertToLocalDateViaSqlDate(posted_on),url,rewriting);
                list.add(news);
            }
            return list;
        }catch (Exception e){
            return null;
        }finally {
            if(c!=null) c.close();
            if(stmt!=null) stmt.close();
        }
    }

    public List<News> getLastNews() throws SQLException {
        List<News> list = new ArrayList<>();
        Connection c = null;
        Statement stmt = null;
        try {
            c = Rescue.connectToDatabase();
            stmt = c.createStatement();
            ResultSet res = stmt.executeQuery("select * from news limit 10");
            while(res.next()){
                int id = res.getInt("id");
                String title = res.getString("title");
                String description = res.getString("description");
                Date posted_on = res.getDate("posted_on");
                String url = res.getString("url");
                String rewriting = res.getString("rewriting");
                News news = new News(id,title,description,convertToLocalDateViaSqlDate(posted_on),url,rewriting);
                list.add(news);
            }
            return list;
        }catch (Exception e){
            return null;
        }finally {
            if(c!=null) c.close();
            if(stmt!=null) stmt.close();
        }
    }

    public void insertCommentaire(String description) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("INSERT INTO comments "
                    + "(id,description,posted_on,can_be_posted) "
                    + "VALUES ( DEFAULT, ? ,NOW(),FALSE) ");
            pst.setString(1, description);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public void validerCommentaire(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("UPDATE comments SET can_be_posted=TRUE WHERE id="+id);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public void supprimerCommentaire(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {


            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("DELETE FROM comments WHERE id="+id);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }

    public List<Comment> getAllComments() throws SQLException {
        List<Comment> list = new ArrayList<>();
        Connection c = null;
        Statement stmt = null;
        try {
            c = Rescue.connectToDatabase();
            stmt = c.createStatement();
            ResultSet res = stmt.executeQuery("select * from comments");
            while(res.next()){
                int id = res.getInt("id");
                String description = res.getString("description");
                Date posted_on = res.getDate("posted_on");
                Boolean can_be_posted = res.getBoolean("can_be_posted");
                Comment comment = new Comment(id,description,convertToLocalDateViaSqlDate(posted_on),can_be_posted);
                list.add(comment);
            }
            return list;
        }catch (Exception e){
            return null;
        }finally {
            if(c!=null) c.close();
            if(stmt!=null) stmt.close();
        }
    }

    /*public List<Information> getAllInformations(){
        return em.createQuery("SELECT f FROM Information f").getResultList();
    }

    public Information getInformation(int id){
        return em.getReference(Information.class,id);
    }

    @Transactional
    public void deleteInformation(int id){
        tx.begin();
        em.remove(getInformation(id));
        tx.commit();
        em.close();
    }

    public void insertNew(News news){
        tx.begin();
        if(news.getId()==null){
            em.merge(news);
        }else{
            em.persist(news);
        }
        tx.commit();
        em.close();
    }

    public List<News> getLastNews(){
        return em.createQuery("SELECT n FROM News n").setMaxResults(10).getResultList();
    }

    public News getNew(int id){
        return em.getReference(News.class,id);
    }

    @Transactional
    public void deleteNew(int id){
        tx.begin();
        em.remove(getNew(id));
        tx.commit();
        em.close();
    }

    public List<News> getAllNews() {
        return em.createQuery("SELECT n FROM News n").getResultList();
    }

    public List<Comment> getComments(){
        return em.createQuery("SELECT c FROM Comment c").getResultList();
    }

    public Comment getComment(int id){
        return em.getReference(Comment.class,id);
    }

    @Transactional
    public void validerCommentaire(int id){
        tx.begin();
        em.createQuery("UPDATE Comment c SET c.can_be_posted='TRUE' WHERE c.id="+id);
        tx.commit();
        em.close();
    }

    @Transactional
    public void supprimerCommentaire(int id){
        tx.begin();
        em.remove(getComment(id));
        tx.commit();
        em.close();
    }*/

    public LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
        return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
    }

    public void addCommentaire(String commentaire) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Rescue.connectToDatabase();
            pst = conn.prepareStatement("INSERT INTO comments (id,description,posted_on,can_be_posted) VALUES " +
                    "(DEFAULT,?,NOW(),FALSE)");
            pst.setString(1, commentaire);

            pst.executeUpdate();
        } catch (Exception e) {

        }finally{
            if(conn!=null) {
                conn.close();
            }
            if(pst!=null) {
                pst.close();
            }
        }
    }
}
