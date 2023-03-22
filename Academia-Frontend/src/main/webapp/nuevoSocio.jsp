<%@taglib uri="/struts-tags" prefix="s" %>

<html>
    <head>
        <meta charset="utf-8">
        <title>Nuevo Socio</title>
        <link rel="stylesheet" href="css/socio.css">
    </head>
    <body>
        <div class="menu">
            <main>
                <h2>Nuevo Socio</h2>
                <form action="AddAction">
                    <label>Nombre y apellido: <input type="text" name="nombreSocio" autocomplete="off" required></label><br>
                    <input type="submit" value="Crear" class="botonSubmit">
                    <input type="button" value="Volver" class="volver" onClick="history.go(-1);">
                </form>
            </main>
        </div>
    </body>
</html>