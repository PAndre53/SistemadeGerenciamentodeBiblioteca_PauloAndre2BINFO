public class Administrador extends Usuario {
    //ATRIBUTOS
    private String cargo;
        
    
        public Administrador(String nome, String email) {
        super(nome, email);
    }
    
    //GETTER
    public String getCargo() {return this.cargo;}
    
    //SETTER
    public void setCargo(String novoCargo) {this.cargo = novoCargo;}
    
    @Override
    public String exibirInformacoes(){
        String info = "Id: "+getId()+", Usuario: "+getNome()+", Email: "+getEmail()+", Cargo: "+cargo;
        return info;
    }
    
    //MÉTODO PARA CADASTRAR USUÁRIOS
    
    //MÉTODO PARA DELETAR USUÁRIO
    //MÉTODO PARA CADASTRAR LIVRO
    //MÉTODO PARA DELETAR LIVRO
}
