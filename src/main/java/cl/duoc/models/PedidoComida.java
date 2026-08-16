package cl.duoc.models;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de comida.");
        System.out.println("Buscando repartidor con mochila térmica...");
        System.out.println("Repartidor con mochila térmica asignado.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido de comida asignado a " + nombreRepartidor);
        System.out.println("Validando mochila térmica...");
        System.out.println("Mochila térmica validada correctamente.");
    }
}