<%@ page contentType="text/html; charset=utf-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<script>
	alert("성공적으로 로그인이 되었습니다.");
	/* location.href="${pageContext.request.contextPath }/login.do";  */
	self.location = "${pageContext.request.contextPath }/index";
</script>
