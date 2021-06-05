import java.util.ArrayList;

public class ATM {

    public final int numeroSerie;
    private int quantidadeCedula5;
    private int quantidadeCedula10;
    private int quantidadeCedula20;
    private int quantidadeCedula50;
    private int quantidadeCedula100;
    private final int totalCedula5;
    private final int totalCedula10;
    private final int totalCedula20;
    private final int totalCedula50;
    private final int totalCedula100;

    public ATM(int numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.quantidadeCedula5 = 0;
        this.quantidadeCedula10 = 0;
        this.quantidadeCedula20 = 0;
        this.quantidadeCedula50 = 0;
        this.quantidadeCedula100 = 0;
        this.totalCedula5 = 100;
        this.totalCedula10 = 100;
        this.totalCedula20 = 100;
        this.totalCedula50 = 100;
        this.totalCedula100 = 100;
    }

    public int consultarValor() {
        int result = 0;
        result += this.quantidadeCedula5 * 5;
        result += this.quantidadeCedula10 * 10;
        result += this.quantidadeCedula20 * 20;
        result += this.quantidadeCedula50 * 50;
        result += this.quantidadeCedula100 * 100;

        return result;
    }

    public void abastecer(int quantidade, int cedula) {
        switch(cedula){
            case 5: 
                if(this.quantidadeCedula5 + quantidade <= 100) this.quantidadeCedula5 += quantidade; break;
            case 10: 
                if(this.quantidadeCedula10 + quantidade <= 100) this.quantidadeCedula10 += quantidade; break;
            case 20: 
                if(this.quantidadeCedula20 + quantidade <= 100) this.quantidadeCedula20 += quantidade; break;
            case 50: 
                if(this.quantidadeCedula50 + quantidade <= 100) this.quantidadeCedula50 += quantidade; break;
            case 100: 
                if(this.quantidadeCedula100 + quantidade <= 100) this.quantidadeCedula100 += quantidade; break;
            default: break;
        }
    }

    public int consultarQuantidade(int cedula) {
        switch(cedula){
            case 5: 
                return this.quantidadeCedula5;
            case 10: 
                return this.quantidadeCedula10;
            case 20: 
                return this.quantidadeCedula20;
            case 50: 
                return this.quantidadeCedula50;
            case 100: 
                return this.quantidadeCedula100;
            default: return 0;
        }
    }

    public void retirar(int dinheiro) {

        ArrayList<Integer> cedulas = new ArrayList<Integer>();//, cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0;
        int[] valoresCedulas = { 100, 50, 20, 10, 5 };
        int[] quantidadesCedulas = { this.quantidadeCedula100, this.quantidadeCedula50, this.quantidadeCedula20, this.quantidadeCedula10, this.quantidadeCedula5 };
        int i = 0;
        for(int valorCedula : valoresCedulas){
            if(quantidadesCedulas[i] - (dinheiro / valorCedula) >= 0) {
                cedulas.add(dinheiro / valorCedula); 
                dinheiro %= valorCedula;
            }else{
                cedulas.add(0);
            }
            i++;
        }
        if(dinheiro == 0){
            if(this.quantidadeCedula100 - cedulas.get(0) >= 0)this.quantidadeCedula100 -= cedulas.get(0);
            if(this.quantidadeCedula50 - cedulas.get(1) >= 0)this.quantidadeCedula50 -= cedulas.get(1);
            if(this.quantidadeCedula20 - cedulas.get(2) >= 0)this.quantidadeCedula20 -= cedulas.get(2);
            if(this.quantidadeCedula10 - cedulas.get(3) >= 0)this.quantidadeCedula10 -= cedulas.get(3);
            if(this.quantidadeCedula5 - cedulas.get(4) >= 0)this.quantidadeCedula5 -= cedulas.get(4);
        }
    }
}