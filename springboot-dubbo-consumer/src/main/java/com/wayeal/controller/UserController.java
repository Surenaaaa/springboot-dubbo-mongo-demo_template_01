package com.wayeal.controller;

import com.wayeal.pojo.User;
import com.wayeal.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/16/10:55
 * @Description:
 */

@RestController
@RequestMapping("/site")
public class UserController {

    @Reference
    private UserService userService;


    @GetMapping("/name")
    public String getName(String name){
        return userService.getName(name);
    }

    /**
    * @Description: 保存用户信息
    * @Param: user
    * @return: 保存成功
    * @Author: tyf
    * @Date: 2022/6/16 */
    @GetMapping("/save")
    public String save(User user) {
        userService.save(user);
        return "保存成功";
    }

    /**
    * @Description: 根据用户id删除
    * @Param: id
    * @return: 删除成功
    * @Author: tyf
    * @Date: 2022/6/16 */
    @GetMapping("/delete")
    public String delete(Integer id) {
        userService.delete(id);
        return "删除成功";
    }

    /**
    * @Description: 修改用户信息
    * @Param: 
    * @return: 
    * @Author: tyf
    * @Date: 2022/6/16 */
    @GetMapping("/update")
    public void update(Integer id, String name, Integer age, String pwd){
        userService.update(id,name,age,pwd);
        System.out.println("修改成功");
    }
    
    /**
     * @Description: 查询全部用户信息
     * @Param: 无
     * @return: List<User> all
     * @Author: tyf
     * @Date: 2022/6/16 */
    @GetMapping("/findAll")
    public Object findAll() {
        return userService.findAll();
    }

    /**
    * @Description: 根据id查询
    * @Param: id
    * @return: User
    * @Author: tyf
    * @Date: 2022/6/16 */
    @GetMapping("/findById")
    public Object findById(Integer id){
        return userService.findById(id);
    }
}
