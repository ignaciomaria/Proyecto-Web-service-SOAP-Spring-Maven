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
                    <h2><a href="nuevoSocio.jsp">Nuevo Socio</a></h2>
                    <h2><a href="modificarSocio.jsp">Modificar Socio</a></h2>
                    <h2><a href="eliminarSocio.jsp">Eliminar Socio</a></h2>
            </main>
        </div>
        <div class="listaSocios">
			<table>
				<caption>Tabla de socios</caption>
				<thead>
					<tr>
						<th>Nombre</th>
						<th>Tipo 2</th>
						<th>Tipo 3</th>
						<th>Tipo 4</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>2</td>
						<td>3</td>
						<td>4</td>
					</tr>
					<tr>
						<td>5</td>
						<td>6</td>
						<td>7</td>
						<td>8</td>
					</tr>
				</tbody>
			</table>
        </div>
    </body>
</html>