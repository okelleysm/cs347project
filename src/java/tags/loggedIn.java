/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class loggedIn extends TagSupport {

    @Override
    public int doStartTag() throws JspTagException {
        HttpServletRequest request
                = (HttpServletRequest) this.pageContext.getRequest();
        HttpServletResponse response
                = (HttpServletResponse) this.pageContext.getResponse();

        HttpSession session = request.getSession(true);

        boolean loggedIn = (boolean) session.getAttribute("loggedIn");

        if (loggedIn) {
            return EVAL_BODY_INCLUDE;
        } else {
            try {
                response.sendRedirect("https://" + request.getServerName()
                        + ":8443" + request.getContextPath() + "/login.jsp");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return SKIP_BODY;
        }
    }
}
