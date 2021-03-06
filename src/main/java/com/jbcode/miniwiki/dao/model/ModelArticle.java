package com.jbcode.miniwiki.dao.model;

import com.jbcode.miniwiki.beans.Article;

import java.util.ArrayList;
import java.util.List;

public class ModelArticle {
    private String word;
    List<Article> articleList=new ArrayList<>();

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
