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
						<th>Documento</th>
						<th>Direccion</th>
						<th>Telefono</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="socios">
					<s:if test="%{#socios == null}">
						<tr>
							<td>NULL</td>
							<td>NULL</td>
							<td>NULL</td>
							<td>NULL</td>
						</tr>
					</s:if>
					<tr>
						<td><s:property value="nombreYapellido"/></td>
						<td><s:property value="documento"/></td>
						<td><s:property value="direccion"/></td>
						<td><s:property value="telefono"/></td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
        </div>
    </body>
</html>