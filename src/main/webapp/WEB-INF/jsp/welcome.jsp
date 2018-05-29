<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
        function validate() {
            var x = document.forms.myForm.name.value;
            var letters = /^[a-zA-Z]+$/;
            if(x.match(letters)) {
                return true;
            } else {
                alert('Please enter alphabetic characters only');
                return false;
            }
        }
	</script>
</head>
<body onload='document.myForm.name.focus()'>

<h1>Welcome to Spring Boot</h1>

<form name="myForm" action="/reverseString" onsubmit="validate()" method="post">

	<h3>Enter the string</h3>
	<input type="text" name="name" id="name"/>
	
	<input type ="submit" name="button" value="Reverse Case"/>
</form>

</body>
</html>