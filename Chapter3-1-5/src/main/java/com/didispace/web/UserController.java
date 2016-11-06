package com.didispace.web;

import com.didispace.domain.User;

import java.util.*;

import com.didispace.utils.Response;
import com.didispace.utils.Result;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET,produces = "application/json")
    public Response<List<User>> getUserList() {

        Response<List<User>> response = null;
        List<User> r = new ArrayList<User>(users.values());
        User user = new User();
        user.setRole("ROLE_USER");
        user.setUsername("admin");
        user.setPassword("123456");
        r.add(user);
        response = new Response(Result.SUCCESS, r);
        System.out.println("====================" + response);
        return response;
    }

//    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    @RequestMapping(value="", method=RequestMethod.POST)
//    public String postUser(@RequestBody User user) {
//        users.put(user.getId(), user);
//        System.out.println("====================");
//        return "success";
//    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(paramType = "path" ,name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value="/{id}", method=RequestMethod.GET,produces = "application/json")
    public Response<User> getUser(@PathVariable String id) {
        Response<User> response = null;
        User user = new User();
        user.setRole("ROLE_USER");
        user.setUsername("admin");
        user.setPassword("123456");
        response = new Response(Result.SUCCESS, user);
        System.out.println("====================" + response);
        return response;
    }

//    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
//            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    })
//    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
//    public String putUser(@PathVariable Long id, @RequestBody User user) {
//        User u = users.get(id);
//        u.setName(user.getName());
//        u.setAge(user.getAge());
//        users.put(id, u);
//        return "success";
//    }
//
//    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
//    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
//    public String deleteUser(@PathVariable Long id) {
//        users.remove(id);
//        return "success";
//    }

}