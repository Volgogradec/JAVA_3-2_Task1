package ru.netology;

import java.util.Date;

public class Post {
    private String id;
    private String userId;
    private Date dataCreate;
    private String textPost;
    private String subjectId;
    private String urlSource;
    private Boolean signatureView;

    // Social networks
    private int likeSum;
    private int commentSum;
    private int shareSum;
    private int viewSum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(Date dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    public Boolean getSignatureView() {
        return signatureView;
    }

    public void setSignatureView(Boolean signatureView) {
        this.signatureView = signatureView;
    }

    public int getLikeSum() {
        return likeSum;
    }

    public void setLikeSum(int likeSum) {
        this.likeSum = likeSum;
    }

    public int getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(int commentSum) {
        this.commentSum = commentSum;
    }

    public int getShareSum() {
        return shareSum;
    }

    public void setShareSum(int shareSum) {
        this.shareSum = shareSum;
    }

    public int getViewSum() {
        return viewSum;
    }

    public void setViewSum(int viewSum) {
        this.viewSum = viewSum;
    }


}
