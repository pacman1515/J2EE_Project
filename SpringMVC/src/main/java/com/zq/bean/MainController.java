package com.zq.bean;

import com.zq.dao.UserMapper;
import com.zq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "",method = RequestMethod.GET)
public class MainController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request,
                              @RequestParam(required=true,defaultValue="") String username,
                              @RequestParam(required=true,defaultValue="") String password) {
        try {
            User user = new User(username, password);
            User currentUser = userMapper.selectByPrimaryKey(username);
            if (currentUser == null) {
                request.setAttribute("error", "用户名错误");
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                return "index";
            } else {
                if (currentUser.getPassword().equals(password)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("currentUser", currentUser);
                    return "main";
                } else {
                    request.setAttribute("error", "密码错误");
                    request.setAttribute("username", username);
                    request.setAttribute("password", password);
                    return "index";
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "index";
    }
}
