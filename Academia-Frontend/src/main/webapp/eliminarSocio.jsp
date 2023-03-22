<%@taglib uri="/struts-tags" prefix="s" %>

<html>
    <head>
        <meta charset="utf-8">
        <title>Eliminar Socio</title>
        <link rel="stylesheet" href="css/socio.css">
    </head>
    <body>
        <div class="menu">
            <main>
                <h2>Eliminar Socio</h2>
                <form action="DelAction">
                    <label>Nombre de socio a eliminar: <input type="text" name="nombreSocio" autocomplete="off" required></label><br>
                    <input type="submit" value="Eliminar" class="botonSubmit">
                    <input type="button" value="Volver" class="volver" onClick="history.go(-1);">
                </form>
            </main>
        </div>
    </body>
</html>