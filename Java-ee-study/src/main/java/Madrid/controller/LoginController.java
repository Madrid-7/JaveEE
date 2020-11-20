package Madrid.controller;

import Madrid.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
public class LoginController {

    /**
     * 两个页面，login.html和index.html，哪些url能访问，每个url访问的时候，是否是转发的？
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "/login.html";
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    @ResponseBody
    public Object login2() {
        User user = new User();

        user.setUsername("烤鸭");
        user.setPassword("123");
        user.setBirthday(new Date());
        return user;
    }
}
