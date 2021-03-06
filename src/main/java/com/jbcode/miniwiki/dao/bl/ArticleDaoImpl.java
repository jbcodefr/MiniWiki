package com.jbcode.miniwiki.dao.bl;

import com.jbcode.miniwiki.beans.Article;
import com.jbcode.miniwiki.beans.SingletonConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArticleDaoImpl implements IArticleDao {


    @Override
    public Article save(Article article) {
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

        return null;
    }

    @Override
    public Article getArticle(Long articleId) {
        Connection conn= SingletonConnection.getConnection();

        return null;
    }

    @Override
    public Article updateArticle(Article article) {
        Connection conn= SingletonConnection.getConnection();

        return null;
    }

    @Override
    public void delete(Long articleId) {
        Connection conn= SingletonConnection.getConnection();

    }
}
