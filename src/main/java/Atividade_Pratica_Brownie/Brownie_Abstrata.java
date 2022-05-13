package Atividade_Pratica_Brownie;

public abstract class Brownie_Abstrata implements Comparable <Brownie_Abstrata>{

    protected String nome;
    protected double preco;
    public Brownie_Abstrata(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

//    @Override
//    public int compareTo(Brownie_Abstrata o) {
//        if(this.preco < o.getPreco()){
//            return -1;
//        }
//        if(this.preco > o.getPreco()){
//            return 1;
//        }
//        return 0;
//    }
      @Override
        public int compareTo(Brownie_Abstrata o) {

            return Double.compare(this.preco, o.getPreco());

        }

    public void mostraInfo(){
        System.out.println("Nome do brownie: "+ nome);
        System.out.println("Preço do brownie: "+preco);
    }



    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
