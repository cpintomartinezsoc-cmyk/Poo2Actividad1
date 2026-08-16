package cl.duoc.models;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de encomienda.");
        System.out.println("Validando peso y embalaje...");
        System.out.println("Peso y embalaje validados.");
        System.out.println("Asignando repartidor para la encomienda.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Encomienda asignada a " + nombreRepartidor);
        System.out.println("Validando peso y embalaje...");
        System.out.println("Peso y embalaje validados correctamente.");
    }
}
