public class Livro {
    //ATRIBUTOS
    private static int proximoIsbn = 1;
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean isDisponivel;
    private int idUsuarioEmprestadoPara;
    
    //CONSTRUTOR
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
        this.isDisponivel = true;
        this.idUsuarioEmprestadoPara = 0;
    }

    //GETTER
    public int getIsbn() {return this.isbn;}
    public String getTitulo() {return this.titulo;}
    public String getAutor() {return this.autor;}
    public int getAno() {return this.ano;}
    public boolean getIsDisponivel () {return this.isDisponivel;};
    public int getIdUsuarioEmprestadoPara () {return this.idUsuarioEmprestadoPara;}

    //SETTER
    public void setTitulo(String novoTitulo) {this.titulo = novoTitulo;}
    public void setAutor(String novoAutor) {this.autor = novoAutor;}
    public void setAno(int novoAno) {this.ano = novoAno;}
    public void setIsDisponivel (boolean isDisponivel) {this.isDisponivel = isDisponivel;}
    public void setIdUsuarioEmprestadoPara (int idUsuario) {this.idUsuarioEmprestadoPara = idUsuario;}
    
    //MÉTODO PARA EXIBIR AS INFORMAÇÕES
    public String exibirInformacoes () {
        String info = "Livro - ISBN:"+isbn+", Titulo:"+titulo+", Autor:"+autor+", Ano:"+ano+", Disponivel:"+(isDisponivel ? "Sim":"Nao");
        if(!isDisponivel && idUsuarioEmprestadoPara!=0){
          info+=", Emprestado para ID Usuario:"+idUsuarioEmprestadoPara;  
        }
        return info;
    }
}
