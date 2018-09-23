<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String dname = (String) session.getAttribute("name");
String dfathername = (String) session.getAttribute("fathername");
String dcollege = (String) session.getAttribute("college");
String ddegree = (String) session.getAttribute("degree");
String dyear = (String) session.getAttribute("year");
%>


<h4>Review your details and submit </h4>
</br></br>
You entered name  as <%= dname %>
</br></br>
You entered fathers name  as <%= dfathername %>
</br></br>
You entered college  as <%= dcollege %>
</br></br>
You entered degree as <%= ddegree %>
</br></br>
You entered year  as <%= dyear %>


</br></br>

</body>
</html>