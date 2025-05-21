
import java.util.ArrayList;

public class Biblioteca {

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
     return "Livro "+titulo+" cadastrado com sucesso.";
    }
    
    //MÉTODO PARA CADASTRAR USUÁRIOS
    public String cadastrarUsuario(String nome, String email){
        Usuario usuario = new Usuario(nome, email);
        usuarios.add(usuario);
        return "Usuario "+nome+" foi cadastrado com sucesso.";
    }
    
    //MÉTODO PARA CADASTRAR ADMIN
    public String cadastrarAdmin(String nome, String email, String cargo){
        Administrador admin = new Administrador(nome, email, cargo);
        administradores.add(admin);
        return "Admin "+nome+" foi cadastrado com sucesso.";
    }
    
    //MÉTODO PARA EMPRESTAR LIVRO
    public void emprestarLivro(int isbn, int idUsuario){
        for (Livro livro : livros) {
            if(livro.getIsbn() == isbn) {
                if (livro.getIsDisponivel() == true) {
                    livro.setIsDisponivel(false);
                    livro.setIdUsuarioEmprestadoPara (idUsuario);
                    System.out.println("Livro emprestado com sucesso.");
                   }else {
                    System.out.println("Livro nao disponivel.");
                }
            }
        }
    }
    
    //MÉTODO PARA DEVOLVER LIVRO
    public void devolverLivro(int isbn) {
        for(Livro livro : livros) {
            if (livro.getIsbn() == isbn) {
                    if(livro.getIsDisponivel() == false);
                    livro.setIsDisponivel(true);
                    livro.setIdUsuarioEmprestadoPara (0);
                    System.out.println("Livro devolvido com sucesso.");
                   }else {
                    System.out.println("Livro nao estava emprestado.");
                }
        }
    }


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
