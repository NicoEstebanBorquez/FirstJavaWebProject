package datos;

import dominio.Movil;
import java.sql.*;
import java.util.*;

public class MovilDaoJDBC {

    private static final String SQL_SELECT = "SELECT id_movil, marca, modelo, imei, tipo_reparacion, estado, precio, nombre_cliente, telefono_cliente FROM moviles";
    private static final String SQL_SELECT_BY_ID = "SELECT id_movil, marca, modelo, imei, tipo_reparacion, estado, precio, nombre_cliente, telefono_cliente FROM moviles WHERE id_movil=?";
    private static final String SQL_INSERT = "INSERT INTO moviles (marca, modelo, imei, tipo_reparacion, estado, precio, nombre_cliente, telefono_cliente) VALUES(?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE moviles SET marca=?, modelo=?, imei=?, tipo_reparacion=?, estado=?, precio=?, nombre_cliente=?, telefono_cliente=? WHERE id_movil=?";
    private static final String SQL_DELETE = "DELETE FROM moviles WHERE id_movil=?";

    public List<Movil> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Movil movil = null;
        List<Movil> moviles = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idMovil = rs.getInt("id_movil");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String imei = rs.getString("imei");
                String tipo_reparacion = rs.getString("tipo_reparacion");
                String estado = rs.getString("estado");
                double precio = rs.getDouble("precio");
                String nombre_cliente = rs.getString("nombre_cliente");
                String telefono_cliente = rs.getString("telefono_cliente");

                movil = new Movil(idMovil, marca, modelo, imei, tipo_reparacion, estado, precio, nombre_cliente, telefono_cliente);
                moviles.add(movil);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return moviles;
    }

    public Movil encontrar(Movil movil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, movil.getIdMovil());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String imei = rs.getString("imei");
            String tipo_reparacion = rs.getString("tipo_reparacion");
            String estado = rs.getString("estado");
            double precio = rs.getDouble("precio");
            String nombre_cliente = rs.getString("nombre_cliente");
            String telefono_cliente = rs.getString("telefono_cliente");

            movil.setMarca(marca);
            movil.setModelo(modelo);
            movil.setImei(imei);
            movil.setTipoReparacion(tipo_reparacion);
            movil.setEstado(estado);
            movil.setPrecio(precio);
            movil.setNombreCliente(nombre_cliente);
            movil.setTelefonoCliente(telefono_cliente);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return movil;
    }

    public int insertar(Movil movil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, movil.getMarca());
            stmt.setString(2, movil.getModelo());
            stmt.setString(3, movil.getImei());
            stmt.setString(4, movil.getTipoReparacion());
            stmt.setString(5, movil.getEstado());
            stmt.setDouble(6, movil.getPrecio());
            stmt.setString(7, movil.getNombreCliente());
            stmt.setString(8, movil.getTelefonoCliente());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int actualizar(Movil movil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, movil.getMarca());
            stmt.setString(2, movil.getModelo());
            stmt.setString(3, movil.getImei());
            stmt.setString(4, movil.getTipoReparacion());
            stmt.setString(5, movil.getEstado());
            stmt.setDouble(6, movil.getPrecio());
            stmt.setString(7, movil.getNombreCliente());
            stmt.setString(8, movil.getTelefonoCliente());
            
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int eliminar(Movil movil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, movil.getIdMovil());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
