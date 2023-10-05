package exemplo1;

public class Main {
    public static void main(String[] args) {
        CartaoCredito metodo1 = new CartaoCredito("06/10", 10, 150.34d, "12345", "mastercard", "Clesio");

        System.out.println("Pagamento por cartão Credito: "+metodo1.imprimirCupomFiscal());

        Pix metodo2 = new Pix("06/10", 10, 30.98d, false);

        System.out.println("\n\nPagamento por Pix: "+metodo2.imprimirCupomFiscal());

        CartaoDebito metodo3 = new CartaoDebito ("06/10", 10, 150.34d, "12345", "Clesio");

        System.out.println("\n\nPagamento por cartão Debito: "+metodo3.imprimirCupomFiscal());

    }
}