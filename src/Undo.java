import java.util.ArrayList;
import java.util.List;

    public class Undo {
        private static Undo instance;
        private List<String> productos;

        private Undo() {
            productos = new ArrayList<>();
        }

        public synchronized static Undo getInstance() {
            if (instance == null) {
                instance = new Undo();
            }
            return instance;
        }

        public void addPedido(String pedido) {
            productos.add(pedido);
        }

        public void removePedido(String pedido) {
            productos.remove(pedido);
        }

        public void listPedido() {
            for (String pedido : productos) {
                System.out.println(pedido);
            }
        }
}
