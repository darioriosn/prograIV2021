package com.progra.ui.contactenos;

import com.progra.en.contactenos.Contacto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Contactenos", value = "/Contactenos")
public class Contactenos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre, correo, asunto, mensaje;

        nombre = request.getParameter("name");

        correo = request.getParameter("email");

        asunto = request.getParameter("subject");

        mensaje = request.getParameter("message");

        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setCorreo(correo);
        contacto.setAsunto(asunto);
        contacto.setMensaje(mensaje);

        request.setAttribute("Contacto", contacto);
        request.getRequestDispatcher("result.jsp").forward(request, response);


    }
}
