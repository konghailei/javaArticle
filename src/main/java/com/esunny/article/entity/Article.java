package com.esunny.article.entity;

import javax.xml.crypto.Data;

public class Article {

    // 文章主键
    private Integer articleId;

    // 文章标题
    private String articleTitle;

    // 文章内容
    private String articleContent;

    // 创建时间
    private Data createTime;

    // 更新时间
    private Data lastEditTime;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }

    public Data getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Data lastEditTime) {
        this.lastEditTime = lastEditTime;
    }



}
