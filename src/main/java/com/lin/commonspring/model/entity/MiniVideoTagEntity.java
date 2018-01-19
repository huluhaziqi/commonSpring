package com.lin.commonspring.model.entity;

public class MiniVideoTagEntity {
    private Long id;

    private Long miniVideoId;

    private Long tagId;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}