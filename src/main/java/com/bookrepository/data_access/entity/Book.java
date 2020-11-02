package com.bookrepository.data_access.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Column(name = "id", unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    @Size(min = 1, max = 30)
    private String title;
    @Column(name = "author")
    @Size(min = 1, max = 30)
    private String author;
    @Column(name = "publishmentyear")
    private Integer publishmentyear;
    @Column(name = "Category")
    private String category;
}