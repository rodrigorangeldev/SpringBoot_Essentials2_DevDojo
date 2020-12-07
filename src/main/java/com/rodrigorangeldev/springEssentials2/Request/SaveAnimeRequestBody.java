package com.rodrigorangeldev.springEssentials2.Request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SaveAnimeRequestBody {
    @NotEmpty
    private String name;
}
