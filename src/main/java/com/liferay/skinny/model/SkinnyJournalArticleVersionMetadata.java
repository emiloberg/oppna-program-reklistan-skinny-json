package com.liferay.skinny.model;

import java.util.Date;

/**
 * Created by user on 19/02/16.
 */
public class SkinnyJournalArticleVersionMetadata {
    
    private final long groupId;
    private final String articleId;
    private final double version;
    private final Date modifiedDate;
    private final String author;
    private final int status;

    public SkinnyJournalArticleVersionMetadata(long groupId, String articleId, double version,
                                               Date modifiedDate, String author, int status) {
        this.groupId = groupId;
        this.articleId = articleId;
        this.version = version;
        this.modifiedDate = modifiedDate;
        this.author = author;
        this.status = status;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getArticleId() {
        return articleId;
    }

    public double getVersion() {
        return version;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public String getAuthor() {
        return author;
    }
    
    public int getStatus() {
        return status;
    }
}
