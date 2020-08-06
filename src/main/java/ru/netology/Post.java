package ru.netology;

import java.util.Date;

public class Post {
    private int id; // Идентификатор записи
    private int userId; // Идентификатор пользователя, сделавшего пост
    private int ownerId; // Идентификатор владельца стены, на которой сделана запись
    private int createdBy; // Идентификатор администратора, который опубликовал запись
    private Date dataCreate; // Дата публикации
    private String textPost; // Текст записи
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // Идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей».
    private String copyright; // Источник
    private String postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canPin; // информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete; // информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int canEdit; // информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int isPinned; // информация о том, что запись закреплена.
    private int markedAsAds; // информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; // true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    private String subjectId; // Идентификатор тематики поста
    private String urlSource; // Ссылка на ресурсы, файлы
    private Boolean signatureView; // Видима подпись или нет

    // Social networks
    private int likeSum; // Кол-во лайков
    private int commentSum; // Кол-во комментариев
    private int shareSum; // Кол-во поделившихся постом
    private int viewSum; // Кол-во просмотров

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
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

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
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
