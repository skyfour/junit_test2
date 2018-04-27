package com.sky.beans;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@Document(indexName = "agentusertest", type = "agentusertest", shards = 20)
public class AgentUserHistory implements Serializable {

    private static final long serialVersionUID = 2123265083933907184L;
    @Id
    @Field(type = FieldType.Long, index = FieldIndex.not_analyzed, store = true)
    private Long userId;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
    private String username;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
    private String nicename;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
    private String trueName;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
    private String tenantId;
}
