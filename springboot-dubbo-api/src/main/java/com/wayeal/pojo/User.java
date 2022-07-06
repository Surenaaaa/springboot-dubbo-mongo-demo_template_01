package com.wayeal.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/16/11:42
 * @Description:
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String pwd;
}
