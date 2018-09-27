package com.example.tarunmittal.news;

import java.util.Date;
public class News {

    String webTitle;
    String webPublicationDate;
    String webUrl;
    String authorName;
    String sectionName;
    String authorImage;

    public News(String webTitle, String webPublicationDate, String webUrl, String authorName, String sectionName, String authorImage) {

        this.webTitle = webTitle;
        this.webPublicationDate = webPublicationDate;
        this.webUrl = webUrl;
        this.authorName = authorName;
        this.sectionName = sectionName;
        this.authorImage = authorImage;
    }

    public String getWebTitle() {

        return webTitle;
    }



    public String getWebPublicationDate() {

        return webPublicationDate;
    }


    public String getWebUrl() {

        return webUrl;
    }


    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public String getSectionName() {

        return sectionName;
    }


    public String getAuthorImage() {

        return authorImage;
    }


}
