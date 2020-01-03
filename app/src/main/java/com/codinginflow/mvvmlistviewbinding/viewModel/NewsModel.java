package com.codinginflow.mvvmlistviewbinding.viewModel;

import com.codinginflow.mvvmlistviewbinding.model.News;

import java.util.ArrayList;

public class NewsModel {

    public String header;
    public String desc;

    public NewsModel() {
    }

    public NewsModel(News news) {
        this.header = news.header;
        this.desc = news.desc;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<NewsModel> getArrayListNews() {
        ArrayList<NewsModel> newsArrayList = new ArrayList<>();
        newsArrayList.add(new NewsModel(new News("Sajad", "developer")));
        newsArrayList.add(new NewsModel(new News("Sajad", "developer")));
        newsArrayList.add(new NewsModel(new News("Sajad", "developer")));
        newsArrayList.add(new NewsModel(new News("Sajad", "developer")));
        newsArrayList.add(new NewsModel(new News("Sajad", "developer")));
        return newsArrayList;
    }
}
