<%@page import="com.app.dao.impl.UserDaoImpl" %>
<%@page import="com.app.service.impl.UserServiceImpl" %>
<jsp:useBean id="u" class="com.app.model.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<% 
  
   UserServiceImpl usi = new UserServiceImpl();

   int i = usi.save(u);
   if(i>0){
	   response.sendRedirect("adduser-success.jsp");
   }
   else{
	   response.sendRedirect("adduser-error.jsp");
   }

%>