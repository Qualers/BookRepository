package com.bookrepository.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@NoArgsConstructor
public class BookDTO {

    private Integer id;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 30)
    private String title;
    @Size(min = 1, max = 50)
    private String author;
    private Integer publishmentyear;
    private String category;
}