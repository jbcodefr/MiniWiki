package com.jbcode.miniwiki.dao.bl;

import com.jbcode.miniwiki.beans.Article;

import static org.junit.jupiter.api.Assertions.*;

class ArticleDaoImplTest {
    public static void main(String[] args) {
        ArticleDaoImpl articleDao=new ArticleDaoImpl();
        try{
            Article article=articleDao.save(new Article("mon stitre","dsdufksdjfbskdfjksdf kjdsbf kjbds kjbf sd"));
            System.out.println("added"+article);
        }catch (Exception e){
        e.printStackTrace();
    }
}}