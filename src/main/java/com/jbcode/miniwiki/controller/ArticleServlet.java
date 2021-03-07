package com.jbcode.miniwiki.controller;

import com.jbcode.miniwiki.beans.Article;
import com.jbcode.miniwiki.dao.bl.ArticleDaoImpl;
import com.jbcode.miniwiki.dao.bl.IArticleDao;
import com.jbcode.miniwiki.dao.model.ModelArticle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="css",urlPatterns= {"/","*.do"})
public class ArticleServlet extends HttpServlet {

    IArticleDao iarticleDao;
    @Override
    public void init() throws ServletException {
        iarticleDao= new ArticleDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path=req.getServletPath();
        if (path.equals("/index.do")){
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else if (path.equals("/search.do")){
            String word=req.getParameter("word");
            ModelArticle model = new ModelArticle();
            model.setWord(word);
            List<Article>articleList= iarticleDao.articlebyword(word);
            model.setArticleList(articleList);
            req.setAttribute("model",model);
            req.getRequestDispatcher("index.jsp").forward(req,resp);

        }

        else if(path.equals("/add.do")){
            req.getRequestDispatcher("add.jsp").forward(req,resp);
        }
        else if(path.equals("/save.do") ){
            String title = req.getParameter("title");
            String content = req.getParameter("content");
            Article a=iarticleDao.save(new Article(title,content));
            req.setAttribute("article",a);
            req.getRequestDispatcher("confirm.jsp").forward(req,resp);
        }
        else if(path.equals("/delete.do")){
            Long id=Long.parseLong(req.getParameter("id"));
            iarticleDao.delete(id);
            resp.sendRedirect("search.do?word=");
        }else if(path.equals("/edit.do")){
            Long id=Long.parseLong(req.getParameter("id"));
            Article a=iarticleDao.getArticle(id);
            req.setAttribute("article",a );
            req.getRequestDispatcher("edit.jsp").forward(req,resp);
        }
        else if(path.equals("/update.do")){
            Long id=Long.parseLong(req.getParameter("id"));
            String title = req.getParameter("title");
            String content = req.getParameter("content");
            Article a=new Article();
            a.setId(id);
            a.setTitle(title);
            a.setContent(content);
            iarticleDao.updateArticle(a);
            req.setAttribute("article",a);
            req.getRequestDispatcher("confirm2.jsp").forward(req,resp);
        }
        else {
            System.out.println("pas de lien choisi");
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }


}

