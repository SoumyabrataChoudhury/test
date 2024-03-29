<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page IsELIgnored="false"%>

<c:choose>
	<c:when test="${!empty empsList}">
	<h1 style="color:red;text-alin:center">EmployeesRepor</h1>
	<table border="1" align="center" bgcolor="cyan">
		<tr style="color:red"><th>empno</th><th>ename</th><th>job</th><th>salary</th><th>deptno</th></tr>
		<c:forEach var="emp" items="${empsList}">
		<tr style="color:blue">
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.job}</td>
			<td>${emp.salary}</td>
			<td>${emp.deptno}</td>
			
			<td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px"height="30px"</a>
				<a href="emp_delete?no=${emp.empno}"><img src="images/delete.png" width="30px"height="30px"</a>
			</td>
						
			</tr>
			</c:forEach>
	</table>
	</c:when>
	
	<c:ortherwise>
		<h1 style="color:red;text-align:center">Employees Not Found</h1>
	</c:ortherwise>
</c:choose>