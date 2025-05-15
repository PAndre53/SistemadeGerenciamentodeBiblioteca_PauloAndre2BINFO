import java.util.ArrayList;

 class Biblioteca {
      //ATRIBUTOS
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Administrador> administradores;
    
    private static final String SENHA_ADMIN_PADRAO = "admin";
    
    //CONSTRUTOR DA BIBLIOTECA
    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.administradores = new ArrayList<>();
    }
    
    //MÉTODO PARA VERIFICAR A SENHA
    private boolean autenticarAdmin(String senha){
        return SENHA_ADMIN_PADRAO.equals(senha);
    }
    
    //MÉTODO PARA BUSCAR LIVRO POR ISBN
    public Livro buscarLivroPorIsbn(int isbn){
        for(Livro livro : livros){
            if(livro.getIsbn()==isbn){
                return livro;
            }
        }
        return null;
    }
    
    //MÉTODO PARA BUSCAR USUÁRIO POR ID
    public Usuario buscarUsuarioPorId(int idUsuario){
        for(Usuario usuario : usuarios){
            if(usuario.getId()==idUsuario){
                return usuario;
            }
        }
        return null;
    }
    
     //MÉTODO PARA BUSCAR ADMINISTRADOR POR ID
    public Administrador buscarAdministradorPorId(int idAdmin){
        for(Administrador admin : administradores){
            if(admin.getId()==idAdmin){
                return admin;
            }
        }
        return null;
    }
    
    //MÉTODO PARA CADASTRAR LIVRO
    public String cadastrarLivro(String titulo, String autor, int ano){
        //VERIFICAR DADOS
        if(titulo==null || titulo.trim().isEmpty() || autor==null || autor.trim().isEmpty()){
      return "Erro: Titulo ou autor nao podem ser vazios.";  
    }
        
     Livro livro = new Livro(titulo, autor, ano);
     livros.add(livro);
     return "livro "+titulo+ "cadastrado com sucesso.";
    }
    
    //MÉTODO PARA CADASTRAR USUÁRIOS
    
    //MÉTODO PARA BUSCAR ADMINISTRADOR POR EMAIL
    public Administrador buscarAdministradorPorEmail(String email){
        for(Administrador administrador : administradores){
            if(administrador.getEmail() == null ? email == null : administrador.getEmail().equals(email)){
                return administrador;
            }
        }
        return null;
    }
}
