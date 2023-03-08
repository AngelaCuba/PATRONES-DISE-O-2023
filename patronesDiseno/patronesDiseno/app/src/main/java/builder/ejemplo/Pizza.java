package builder.ejemplo;

public class Pizza {
    
    private String tipoQueso;
    private String tipoMasa;
    private String tipoCarne;
    private String preparacion;
    private String fruta;
    private String condimentos;
    

    public String getCondimentos() {
        return condimentos;
    }
    public Pizza setCondimentos(String condimentos) {
        this.condimentos = condimentos;
        return this;
    }
    public String getTipoQueso() {
        return tipoQueso;
    }
    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    public String getTipoMasa() {
        return tipoMasa;
    }
    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }
    public String getTipoCarne() {
        return tipoCarne;
    }
    public Pizza setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }
    public String getPreparacion() {
        return preparacion;
    }
    public Pizza setPreparacion(String preparacion) {
        this.preparacion = preparacion;
        return this;
    }
    public String getFruta() {
        return fruta;
    }
    public Pizza setFruta(String fruta) {
        this.fruta = fruta;
        return this;
    }

    public void showInfo(){
        System.out.println(tipoQueso+tipoMasa+tipoCarne+preparacion+fruta+condimentos);
    }
    

}
