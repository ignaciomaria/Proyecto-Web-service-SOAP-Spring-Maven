<%@taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta charset="utf-8">
        <title>Modificar socio</title>
        <link rel="stylesheet" href="css/socio.css">
	</head>
	<body>
        <div class="modificarSocioMenu">
            <main>
                <h2>Modificar Socio</h2>
                <s:form action="ModAction">
                    <s:textfield name="nombreSocio" label="Nombre de socio a modificar"/><br>
                    <s:textfield name="nuevoNombre" label="Nuevo nombre"/><br>
                    <s:submit value="Modificar"/>
                </s:form>
                <h3><a href="index.jsp">Volver</a></h3>
            </main>
        </div>
	</body>
</html>