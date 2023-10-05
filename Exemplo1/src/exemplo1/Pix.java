package exemplo1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {

        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }


    public String imprimirCupomFiscal(){
        return "dataHoraPagamento: " + getDataHoraPagamento() + "\n numeroPagamento: " + getNumeroPagamento()+ "\n valorPago: " + getValorPago()+"\n comprovante pix: "+this.comprovanteTransacaoPix ;

    }

}
