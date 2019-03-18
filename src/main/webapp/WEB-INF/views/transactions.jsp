<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
<title>Transactions</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Transactions</h1>
				<p>Expenses and income:</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="d-flex flex-column">
			<c:forEach items="${transactions}" var="transaction">
				<div class="p-2 transaction">
					<div class="d-inline-flex">
						<div class="p-2">
							<p>${transaction.category}</p>
							<p>${transaction.type}</p>
						</div>
						<div class="p-2">
							<p>${transaction.amount}PLN</p>
							<fmt:formatDate value="${transaction.date.time}"
								pattern="yyyy-MM-dd" />
						</div>
					</div>

				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
