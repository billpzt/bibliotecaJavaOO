public class DVD {
    String nome, regiao, distribuidora, duracao, sinopse, bonus, ano, genero, upc;

    public DVD() {
    }

    public DVD(String nome, String regiao, String distribuidora, String duracao, String sinopse, String bonus, String ano, String genero, String upc) {
        this.nome = nome;
        this.regiao = regiao;
        this.distribuidora = distribuidora;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.bonus = bonus;
        this.ano = ano;
        this.genero = genero;
        this.upc = upc;
    }
    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", duracao='" + duracao + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", bonus='" + bonus + '\'' +
                ", ano='" + ano + '\'' +
                ", genero='" + genero + '\'' +
                ", upc='" + upc + '\'' +
                '}';
    }
    public String dadosDVD() {
        String dadosDoDVD = nome + ", " + distribuidora + ", " + duracao + ", " + sinopse + ", " + bonus + ", " + ano + ", " + genero + ", " + upc;
        return dadosDoDVD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }
}
