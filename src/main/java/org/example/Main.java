package org.example;

import cl.duoc.models.Pedido;
import cl.duoc.models.PedidoComida;
import cl.duoc.models.PedidoEncomienda;
import cl.duoc.models.PedidoExpress;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        Pedido pedido1 = new PedidoComida(
                1,
                "Av. Los Leones 123",
                "Comida"
        );

        Pedido pedido2 = new PedidoEncomienda(
                2,
                "Av. Providencia 456",
                "Encomienda"
        );

        Pedido pedido3 = new PedidoExpress(
                3,
                "Av. Apoquindo 789",
                "Compra Express"
        );

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        System.out.println("=== ASIGNACIÓN DE REPARTIDORES ===");

        for (Pedido pedido : pedidos) {

            pedido.asignarRepartidor();

            System.out.println("-------------------------");
        }

        System.out.println();
        System.out.println("=== ASIGNACIÓN CON REPARTIDOR ===");

        PedidoComida comida = new PedidoComida(
                6,
                "Vicente Perez 213",
                "Comida"
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                5,
                "Calbuco 594",
                "Encomienda"
        );

        PedidoExpress express = new PedidoExpress(
                6,
                "Frutillar 934",
                "Compra Express"
        );

        comida.asignarRepartidor("Camilo");

        encomienda.asignarRepartidor("Marcia");

        express.asignarRepartidor("Jaime");
    }
}