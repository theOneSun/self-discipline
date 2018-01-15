package com.sun.domain;

import lombok.Data;

/**
 * @author sunjian.
 */
@Data
public class User
{
    private String id;
    private String account;
    private String password;
    private String nickName;
    private String phone;
    private String eMail;
}
