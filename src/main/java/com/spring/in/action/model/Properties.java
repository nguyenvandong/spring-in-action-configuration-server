package com.spring.in.action.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author DONGNV - 10/13/2019
 */

@Getter
@Setter
@Document(value = "properties")
public class Properties {

    @Id
    @Field(value = "_id")
    private ObjectId id;

    @Field(value = "application")
    private String application;

    @Field(value = "profile")
    private String profile;

    @Field(value = "label")
    private String label;

    @Field(value = "key")
    @Indexed
    private String key;

    @Field(value = "value")
    private String value;

}
