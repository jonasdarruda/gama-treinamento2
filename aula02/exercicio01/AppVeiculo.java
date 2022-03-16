package exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("BMW" , "X6" , 5 );
        
        v1.mostrar();
        System.out.println("Consumo " + v1.getConsumo());

    }
    
}
