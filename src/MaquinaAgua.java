

public class MaquinaAgua {

    public final int capacidadeAgua;
    public final int capacidadeCopos200;
    public final int capacidadeCopos300;
    public int quantidadeAguaAtual;
    public int quantidadeCopo200Atual;
    public int quantidadeCopo300Atual;

    public MaquinaAgua(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) throws Exception {
        if(capacidadeAgua <= 0) throw new Exception("Capacidade água deve ser positivo");
        if(capacidadeCopos200 <= 0) throw new Exception("Capacidade de 200mL deve ser positivo");
        if(capacidadeCopos300 <= 0) throw new Exception("Capacidade de 300mL deve ser positivo");
        this.capacidadeAgua = capacidadeAgua;
        this.quantidadeAguaAtual = 0;
        this.capacidadeCopos200 = capacidadeCopos200;
        this.quantidadeCopo200Atual = 0;
        this.capacidadeCopos300 = capacidadeCopos300;
        this.quantidadeCopo300Atual = 0;
    }

    public int agua() {
        return this.quantidadeAguaAtual;
    }

    public int copos200() {
        return this.quantidadeCopo200Atual;
    }

    public int copos300() {
        return this.quantidadeCopo300Atual;
    }

    public void servirCopo200() throws Exception {
        if(this.quantidadeCopo200Atual == 0) throw new Exception("Não tem mais copos disponíveis");
        if(this.quantidadeAguaAtual < 200) throw new Exception("Não tem mais agua disponível para encher o copo");
        this.quantidadeCopo200Atual--;
        this.quantidadeAguaAtual -= 200;
    }

    public void servirCopo300() throws Exception {
        if(this.quantidadeCopo300Atual == 0) throw new Exception("Não tem mais copos disponíveis");
        if(this.quantidadeAguaAtual < 300) throw new Exception("Não tem mais agua disponível para encher o copo");
        this.quantidadeCopo300Atual--;
        this.quantidadeAguaAtual -= 300;
    }

    public void abastecerAgua() {
        this.quantidadeAguaAtual = this.capacidadeAgua;
    }

    public void abastecerCopo200() {
        this.quantidadeCopo200Atual = this.capacidadeCopos200;
    }

    public void abastecerCopo300() {
        this.quantidadeCopo300Atual = this.capacidadeCopos300;
    }

}
