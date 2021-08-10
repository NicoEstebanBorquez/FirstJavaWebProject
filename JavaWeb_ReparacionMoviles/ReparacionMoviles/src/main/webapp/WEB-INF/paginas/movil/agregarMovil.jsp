<div class="modal fade" id="agregarMovilModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Móvil</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
      
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="marca">Marca</label>
                        <input type="text" class="form-control" name="marca" required>
                    </div>
                    <div class="form-group">
                        <label for="modelo">Modelo</label>
                        <input type="text" class="form-control" name="modelo" required>
                    </div>
                    <div class="form-group">
                        <label for="imei">IMEI</label>
                        <input type="text" class="form-control" name="imei" required>
                    </div>
                    <div class="form-group">
                        <label for="tipoReparacion">Tipo de reparación</label>
                        <input type="text" class="form-control" name="tipoReparacion" required>
                    </div>
                    <div class="form-group">
                        <label for="estado">Estado de la reparación</label>
                        <input type="text" class="form-control" name="estado" required>
                    </div>
                    <div class="form-group">
                        <label for="precio">Precio</label>
                        <input type="number" class="form-control" name="precio" required step="any">
                    </div>
                    <div class="form-group">
                        <label for="nombreCliente">Nombre del cliente</label>
                        <input type="text" class="form-control" name="nombreCliente" required>
                    </div>
                    <div class="form-group">
                        <label for="telefonoCliente">Teléfono del cliente</label>
                        <input type="tel" class="form-control" name="telefonoCliente" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>    
            </form>
        </div>
    </div>
</div>
