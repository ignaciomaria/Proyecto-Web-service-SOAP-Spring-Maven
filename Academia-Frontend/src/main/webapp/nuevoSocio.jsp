<%@taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<title>Primer formulario</title>
	
	</head>
	<body>
		<s:form action="SocioAction">
			<s:textfield name="nombreSocio" label="Nombre del socio"/>
			<s:submit/>
		</s:form>
	</body>
</html>