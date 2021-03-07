package com.jbcode.miniwiki.dao.bl;

import com.jbcode.miniwiki.beans.Article;
import com.jbcode.miniwiki.beans.SingletonConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements IArticleDao {


    @Override
    public  Article save(Article article) {
        Connection conn= SingletonConnection.getConnection();
      try{
          PreparedStatement ps=conn.prepareStatement(
                  "insert into article( title, content) values (?,?)"
          );
          ps.setString(1,article.getTitle());
          ps.setString(2,article.getContent());
          ps.executeUpdate();
          ps.close();
      }catch (SQLException e){
          e.printStackTrace();
      }

        return article;
    }

    @Override
    public List<Article> articlebyword(String word) {
        Connection conn= SingletonConnection.getConnection();
        List<Article> articleList=new ArrayList<Article>();
        try{
            PreparedStatement ps= conn.prepareStatement(
                    "select * from article where title like ? or content like ?");
            ps.setString(1,"%"+word+"%");
            ps.setString(2,"%"+word+"%");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Article p=new Article();
                p.setId(rs.getLong("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                articleList.add(p);
            }
        }catch (SQLException e ){
            e.printStackTrace();
        }
        return articleList;
    }

    @Override
    public Article getArticle(Long articleId) {
        Connection conn= SingletonConnection.getConnection();

        Article p=new Article();
        try{
            PreparedStatement ps=conn.prepareStatement("select *from article where id = ?");
            ps.setLong(1,articleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                p.setId(rs.getLong("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return p;
    }

    @Override
    public Article updateArticle(Article article) {
        Connection conn= SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("UPDATE article set title=?,content=? where id=?");
            ps.setString(1, article.getTitle());
            ps.setString(2,article.getContent());
            ps.setLong(3,article.getId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return article;
    }

    @Override
    public void delete(Long articleId) {
        Connection conn= SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("DELETE from article where id=?");
            ps.setLong(1,articleId);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
