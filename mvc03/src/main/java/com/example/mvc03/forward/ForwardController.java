package com.example.mvc03.forward;

import com.example.mvc03.model.MemberVO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/fc.do")
public class ForwardController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "shin";
        int age = 26;
        String email = "sinmagic1@naver.com";

        MemberVO vo = new MemberVO();
        vo.setName(name);
        vo.setAge(age);
        vo.setEmail(email);
        //forward.jsp
        //객체바인딩
        request.setAttribute("vo", vo);
        // forward
        RequestDispatcher rd = request.getRequestDispatcher("view/forward.jsp");
        rd.forward(request, response);

    }
}
