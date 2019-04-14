package com.ttn.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Component(service = Servlet.class,
        property={
                Constants.SERVICE_DESCRIPTION + "=Simple Demo Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.resourceTypes="+ "ttnblog/components/structure/ttnblogpage",
                //   "sling.servlet.paths="+ "/bin/content/ttnblog/basepage",
                "sling.servlet.selectors=" + "blogs"
        })
public class DisplayBlogs extends SlingSafeMethodsServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        resp.setContentType("text/html");
        List<Blogs> list = new ArrayList();
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<br />Title of Page: " + resource.getValueMap().get(JcrConstants.JCR_TITLE));

        printWriter.println("<br>resource has children" + resource.getParent().hasChildren());
        if(resource.getParent().hasChildren()){
               for(Resource resource1:resource.getParent().getChildren()) {
                    printWriter.println("<br />---------------------------------------------<br />");
                    printWriter.println("<br />Name: "+resource1.getName());
                    printWriter.println("<br />Creation_date: "+resource1.getValueMap().get("jcr:created",resource1.getResourceType()));
                   printWriter.println("<br />---------------------------------------------<br />");

                list.add(new Blogs(resource1.getValueMap().get("jcr:created",resource1.getResourceType()),resource1.getName()));

               }
                printWriter.write("list in sorted order");
               list.sort((Blogs b1,Blogs b2)->b1.getCreationDate().compareTo(b2.getCreationDate()));
        for(Blogs blogs:list){
            printWriter.print(blogs.toString());
        }
        }



        else {
            printWriter.print("resource has no children");
        }

    }

}
