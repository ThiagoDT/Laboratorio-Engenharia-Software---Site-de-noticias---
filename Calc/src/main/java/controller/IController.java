/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Thiago
 */
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IController {
    
    void doVerfirc(HttpServletRequest req, HttpServletResponse res, ServletContext sc);
    void doAdd(HttpServletRequest req, HttpServletResponse res, ServletContext sc);
    void doUpdate(HttpServletRequest req, HttpServletResponse res, ServletContext sc);
    void doDelete(HttpServletRequest req, HttpServletResponse res, ServletContext sc);
}
