<%@taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta charset="utf-8">
        <title>Socio service</title>
        <link rel="stylesheet" href="css/socio.css">
	</head>
	<body>
		<div class="menu">
            <main>
                <h1>ADMINISTRACION DE SOCIOS</h1>
                <hr>
                <p>
                	<h2><s:a href="nuevoSocio.jsp">Nuevo Socio</s:a></h2>
                    <h2><s:a href="modificarSocio.jsp">Modificar Socio</s:a></h2>
                    <h2><s:a href="eliminarSocio.jsp">Eliminar Socio</s:a></h2>
                </p> 
            </main>
        </div>
	</body>
</html>