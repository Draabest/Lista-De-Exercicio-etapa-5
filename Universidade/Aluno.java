public class Aluno {

    private String nome;
    private String ra;
    private double[] notas;
    private boolean ead;
    private double presenca;
    
    

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isEad() {
        return ead;
    }

    public void setEad(boolean ead) {
        this.ead = ead;
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    
    // Construtor para disciplinas presenciais
    public Aluno(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.ead = false;
    }


    // Construtor para disciplinas EAD
    public Aluno(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.ead = true;
    }



     // Método para calcular a nota final
     public double calcularNotaFinal() {
        double notaFinal = 0.0;
        int numNotas = notas.length;

        if (numNotas == 2) {
            notaFinal = (notas[0] + notas[1]) / 2;
        } else if (numNotas == 3) {
            notaFinal = (notas[0] + 2 * notas[1] + 4 * notas[2]) / 7;
        } else if (numNotas == 4) {
            notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
        }

        return notaFinal;
    }



    // Método para verificar a situação do aluno
    public String verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        if (ead) {
            return notaFinal >= 5 ? "Aprovado" : "Reprovado";
        } else {
            return (notaFinal >= 5 && presenca >= 75) ? "Aprovado" : "Reprovado";
        }
    }


     // Método para imprimir os detalhes do aluno
     public void imprimirDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("RA: " + this.getRa());
        System.out.println("Nota Final: " + calcularNotaFinal());
        System.out.println("Situação: " + verificarSituacao());
    }


}