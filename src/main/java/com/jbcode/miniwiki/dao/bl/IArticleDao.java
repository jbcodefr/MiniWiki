package com.jbcode.miniwiki.dao.bl;

import com.jbcode.miniwiki.beans.Article;

import java.util.List;

public interface IArticleDao {
    public Article save(Article article);
    public List<Article> articlebyword(String word);
    public Article getArticle(Long articleId);
    public Article updateArticle(Article article);
    public void delete(Long articleId);
}
