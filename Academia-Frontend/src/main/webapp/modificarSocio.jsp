<%@taglib uri="/struts-tags" prefix="s" %>

<html>
    <head>
        <meta charset="utf-8">
        <title>Modificar Socio</title>
        <link rel="stylesheet" href="css/socio.css">
    </head>
    <body>
        <div class="menu">
            <main>
                <h2>Modificar Socio</h2>
                <form action="ModAction">
                    <label>Nombre de socio a modificar: <input type="text" name="nombreSocio" autocomplete="off" required></label><br><br>
                    <label>Nuevo nombre y apellido: <input type="text" name="nuevoNombre" autocomplete="off" required></label><br>
                    <input type="submit" value="Modificar" class="botonSubmit">
                    <input type="button" value="Volver" class="volver" onClick="history.go(-1);">
                </form>
            </main>
        </div>
    </body>
</html>