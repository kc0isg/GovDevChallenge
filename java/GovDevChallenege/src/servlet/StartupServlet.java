package servlet;

import javax.servlet.http.*;

import com.googlecode.objectify.ObjectifyService;

import entity.Auditor;
import entity.Test;

public class StartupServlet extends HttpServlet {
	static {
    	System.out.println("servlet.StartupServlet");
    	System.out.println("");

        System.out.println("ObjectifyService - registering entities:");

        ObjectifyService.register(Auditor.class);
    	System.out.println("  Auditor.class");
   
    }
}
