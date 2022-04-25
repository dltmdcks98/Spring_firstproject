package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//DB가 해당 객체를 인식 가능
@AllArgsConstructor
@ToString
public class Article {

    @Id//기본키 지정
    @GeneratedValue//자동 생성
    private  Long id;//기본키

    @Column
    private String title;
    @Column
    private String content;

    public Article(){

    }
}
