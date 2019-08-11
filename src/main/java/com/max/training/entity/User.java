package com.max.training.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private Long id;

    private String name;

    private String email;

    private String login;

    private String password;

}
