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
                    <label>Documento: <input type="text" name="documento" autocomplete="off"></label><br>
                    <label>Direccion: <input type="text" name="direccion" autocomplete="off"></label><br>
                    <label>Telefono: <input type="text" name="telefono" autocomplete="off"></label><br>
                    <label>Email: <input type="text" name="mail" autocomplete="off"></label><br>
                    <label>Fecha de nacimiento: <input type="text" name="fechaDeNacimiento" autocomplete="off"></label><br>
                    <label>Sexo: <input type="text" name="sexo" autocomplete="off"></label><br>
                    <label>Plan: <input type="text" name="plan" autocomplete="off"></label><br>
                    <input type="submit" value="Crear" class="botonSubmit">
                    <input type="button" value="Volver" class="volver" onClick="history.go(-1);">
                </form>
            </main>
        </div>
    </body>
</html>