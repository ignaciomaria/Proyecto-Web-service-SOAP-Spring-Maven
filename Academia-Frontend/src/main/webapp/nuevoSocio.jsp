<%@taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta charset="utf-8">
        <title>Nuevo socio</title>
        <link rel="stylesheet" href="css/socio.css">
	</head>
	<body>
		 <div class="nuevoSocioMenu">
            <main>
                <h2>Nuevo Socio</h2>
                <s:form action="AddAction">
                    <s:textfield name="nombreSocio" label="Nombre y apellido"/><br>
                    <s:submit value="Crear"/>
                </s:form>
                <h3><a href="index.jsp">Volver</a></h3>
            </main>
        </div>
	</body>
</html>