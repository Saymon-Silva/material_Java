package net.weg.crud.util;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.util.WebUtils;

import javax.swing.*;

public class Cookieutil {

    //centraliza as questoes relacionadas aos cookies

    public Cookie gerarCookie(UserDetails userDetails) {
        String token = new JwtUtil().gerarToken(userDetails);
        Cookie cookie = new Cookie("JWT", token);
        cookie.setPath("/");
        cookie.setMaxAge(300);
        return cookie;
    }

    public Cookie gerarCookieNull() {
//        String token = new JwtUtil().gerarToken("""");
        Cookie cookie = new Cookie("JWT", "");
        cookie.setPath("/");
        cookie.setMaxAge(0);
        return cookie;
    }


    public Cookie getCookie(HttpServletRequest request, String name) throws Exception {
        Cookie cookie = WebUtils.getCookie(request, name);
        if (cookie != null) {
            return cookie;
        }
        throw new Exception("cu-kie é bom ninguem me da");
    }
}