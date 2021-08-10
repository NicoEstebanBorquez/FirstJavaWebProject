<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/40f59e3244.js" crossorigin="anonymous"></script>

        <title>Editar M�vil</title>
    </head>
    <body>
        <!--Cabecero-->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idMovil=${movil.idMovil}"
              method="POST" class="was-validated">

            <!-- Barra navegacion Editar-->
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar M�vil</h4>
                                </div>
                                <div class="card-body">
                                    <div class="modal-body">
                                        <div class="form-group">
                                            <label for="marca">Marca</label>
                                            <input type="text" class="form-control" name="marca" required value="${movil.marca}">
                                        </div>
                                        <div class="form-group">
                                            <label for="modelo">Modelo</label>
                                            <input type="text" class="form-control" name="modelo" required value="${movil.modelo}">
                                        </div>
                                        <div class="form-group">
                                            <label for="imei">IMEI</label>
                                            <input type="text" class="form-control" name="imei" required value="${movil.imei}">
                                        </div>
                                        <div class="form-group">
                                            <label for="tipoReparacion">Tipo de reparaci�n</label>
                                            <input type="text" class="form-control" name="tipoReparacion" required value="${movil.tipoReparacion}">
                                        </div>
                                        <div class="form-group">
                                            <label for="estado">Estado de la reparaci�n</label>
                                            <input type="text" class="form-control" name="estado" required value="${movil.estado}">
                                        </div>
                                        <div class="form-group">
                                            <label for="precio">Precio</label>
                                            <input type="number" class="form-control" name="precio" required step="any" value="${movil.precio}">
                                        </div>
                                        <div class="form-group">
                                            <label for="nombreCliente">Nombre del cliente</label>
                                            <input type="text" class="form-control" name="nombreCliente" required value="${movil.nombreCliente}">
                                        </div>
                                        <div class="form-group">
                                            <label for="telefonoCliente">Tel�fono del cliente</label>
                                            <input type="tel" class="form-control" name="telefonoCliente" required value="${movil.telefonoCliente}">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>

        <!--Pie de Pagina-->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"/>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
