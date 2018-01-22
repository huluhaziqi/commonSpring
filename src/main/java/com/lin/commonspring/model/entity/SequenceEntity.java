package com.lin.commonspring.model.entity;

public class SequenceEntity {
    private String tableName;

    private Long nexId;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Long getNexId() {
        return nexId;
    }

    public void setNexId(Long nexId) {
        this.nexId = nexId;
    }
}