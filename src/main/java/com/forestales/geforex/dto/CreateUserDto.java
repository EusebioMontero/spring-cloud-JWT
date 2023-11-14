package com.forestales.geforex.dto;

import com.forestales.geforex.enums.E_UserAuthority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateUserDto {
    private String login;
    private String name;
    private Integer terrServiceId;
    private E_UserAuthority type;
    private String createdBy;
    private LocalDate alterDate;
    private String key;
    private String email;

    public CreateUserDto(String login, String name, Integer terrServiceId, E_UserAuthority type, String key, String email) {
        this.login = login;
        this.name = name;
        this.terrServiceId = terrServiceId;
        this.type = type;
        this.createdBy = "createdBy";
        this.alterDate = LocalDate.now();
        this.key = "tragsa";
        this.email = email;
    }
}
