<%@taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta charset="utf-8">
        <title>Eliminar Socio</title>
        <link rel="stylesheet" href="css/socio.css">
	</head>
	<body>
        <div class="eliminarSocioMenu">
            <main>
                <h2>Eliminar Socio</h2>
                <form action="DelAction">
                    <s:textfield name="nombreEliminar" label="Nombre de socio a eliminar"/><br>
                    <s:submit value="Eliminar"/>
                </form>
                <h3><a href="index.jsp">Volver</a></h3>
            </main>
        </div>
	</body>
</html>