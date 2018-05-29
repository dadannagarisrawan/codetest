<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
	function allLetter(inputtxt)
      { 
      var letters = /^[A-Za-z]+$/;
      if(inputtxt.value.match(letters)){
      return true;
      }
      else
      {
      alert('Please input alphabet characters only');
	}
	}
	</script>
	
</head>
<body>

<h1>Welcome to Spring Boot</h1>

<form name="myForm" action="/reverseString" method="post">

	<h3>Enter the string</h3>
	<input type="text" name="name" id="name"/>
	
	<input type ="submit" name="button" value="Reverse Case"/>
</form>

</body>
</html>