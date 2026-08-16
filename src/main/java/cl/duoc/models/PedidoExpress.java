package cl.duoc.models;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de compra express.");
        System.out.println("Buscando repartidor más cercano...");
        System.out.println("Verificando disponibilidad inmediata...");
        System.out.println("Repartidor disponible asignado.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Compra express asignada a " + nombreRepartidor);
        System.out.println("Verificando disponibilidad inmediata...");
        System.out.println("Repartidor disponible para realizar el pedido.");
    }
}