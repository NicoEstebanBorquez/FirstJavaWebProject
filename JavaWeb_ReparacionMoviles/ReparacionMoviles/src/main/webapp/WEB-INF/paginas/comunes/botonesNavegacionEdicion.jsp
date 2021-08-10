<!-- Botones de navegacion Edicion (JSP) -->
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="index.jsp" class="btn btn-primary btn-block">
                    <i class="fas fa-arrow-left"></i> Regresar al Inicio
                </a>
            </div>
            <div class="col-md-3">
                <button type="submit" class="btn btn-success btn-block">
                    <i class="fas fa-check"></i> Guardar Móvil
                </button>
            </div>
            <div class="col-md-3">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idMovil=${movil.idMovil}"
                   class="btn btn-danger btn-block">
                    <i class="fas fa-trash"></i> Eliminar Móvil
                </a>
            </div>
        </div>
    </div>
</section>