package com.forestales.geforex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class LoginDto {
    private String login;
    private String key;
}
