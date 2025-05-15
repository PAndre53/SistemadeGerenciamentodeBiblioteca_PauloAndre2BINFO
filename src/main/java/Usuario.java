public class Usuario {
    //ATRIBUTOS
    private static int proximoId=1;
    private int id;
    private String nome;
    private String email;
    
    //CONSTRUTOR
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.id = proximoId++;
    }
    
    //GETTER
   public int getId() {return this.id;}
   public String getNome() {return this.nome;}
   public String getEmail() {return this.email;}
   
   //SETTER
   public void setNome (String novoNome) {this.nome = novoNome;}
   public void setEmail (String novoEmail) {this.email = novoEmail;}
   
   //MÉTODO PARA EXIBIR AS INFORMAÇÕES DO USUÁRIO
   public String exibirInformacoes(){
       String info ="Id: "+id+", Usuario: "+nome+", Email: "+email;
       return info;
   }
}
