class atv1 {
    public static void main(String[] args){
        Livro livro = new Livro("Freud", 217, "A volta dos que não foram", 1623);
        livro.MostrarDetalhes();
        System.out.println();
        Dvd dvd =  new Dvd("suspense", 120, "O segredo", 2016);
        dvd.MostrarDetalhes();
        System.out.println();

    }
}
class ItensBiblioteca {
    private String titulo;
    private int ano_publicacao;

    public ItensBiblioteca(String titulo, int ano_publicacao ){
        this.titulo = titulo;
        this.ano_publicacao = ano_publicacao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAno_publicacao(int ano_publicacao){
        this.ano_publicacao = ano_publicacao;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAno_publicacao(){
        return ano_publicacao;
    }

    public void MostrarDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicacao: " + getAno_publicacao());
    }
}
class Livro extends ItensBiblioteca {
    private String autor;
    private int numpages;

    public Livro(String autor, int numpages , String titulo, int ano_publicacao){
        super(titulo, ano_publicacao);
        this.autor = autor;
        this.numpages = numpages;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setNumpages(int numpages){
        this.numpages = numpages;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumpages(){
        return numpages;
    }
    @Override
    public void MostrarDetalhes(){
        System.out.println("Detalhes do Livro");
        super.MostrarDetalhes();
        System.out.println("Nome Autor: "+ getAutor());
        System.out.println("Numero de Paginas: "+ getNumpages());
    }
}
class Dvd extends ItensBiblioteca{
    private String categoria;
    private int duracao;

    public Dvd(String categoria, int duracao, String titulo, int ano_publicacao){
        super(titulo, ano_publicacao);
        this.categoria = categoria;
        this.duracao = duracao;
    }
    public void categoria(String categoria){
        this.categoria = categoria;
    }
    public void duracao(int duracao){
        this.duracao = duracao;
    }
    public  String getCategoria(){
        return categoria;
    }
    public int getDuracao(){
        return duracao;
    }
    @Override
    public void MostrarDetalhes(){
        System.out.println("Detalhes do DVD");
        super.MostrarDetalhes();
        System.out.println("Categoria: "+ getCategoria());
        System.out.println("Duracao em minutos: "+ getDuracao());
    }

}