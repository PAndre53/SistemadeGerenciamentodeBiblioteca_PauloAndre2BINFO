import java.util.Scanner;
public class GerenciadorBiblioteca {
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
       
       try (Scanner scanner = new Scanner(System.in)) {
           
           while(true){
           System.out.println("****************************");
           System.out.println("BIBLIOTECA");
           System.out.println("1. Cadastrar-se");
           System.out.println("2. Pegar livro emprestado");
           System.out.println("3. Devolver livros");
           System.out.println("4. Cadastrar livro");
           System.out.println("5. Apenas administradores");
           System.out.println("6. Sair");
           System.out.println("****************************");
           System.out.println("Digite a opcao (1 a 6):  ");
           int opcao = scanner.nextInt();
           scanner.nextLine();
           
           if (opcao>6 || opcao<1){
               System.out.println("Opcao invalida.");
           }
           
           
           switch(opcao){
               case 1 -> {
                   System.out.print("Digite o nome do usuario: ");  
                   String nome = scanner.nextLine();
                   System.out.print("Digite o email do usuario: ");
                   String email = scanner.nextLine();
                   Usuario usuario = new Usuario(nome, email); 
                   String resultado = biblioteca.cadastrarUsuario(usuario);
                   System.out.println(resultado + " ID: " + usuario.getId());              
                                    
               }
               case 2 -> {
                   System.out.print("Digite o isbn do livro desejado: ");
                   int isbn = scanner.nextInt();
                   System.out.print("Digite o ID do usuario: ");
                   int idUsuario = scanner.nextInt();
                   scanner.nextLine();
                   Livro livro = biblioteca.buscarLivroPorIsbn(isbn);
                   Usuario usuario = biblioteca.buscarUsuarioPorId(idUsuario);
                   if (livro == null) {
                   System.out.println("Erro: Livro com ISBN " + isbn + " não encontrado.");
                   } else if (usuario == null) {
                   System.out.println("Erro: Usuário com ID " + idUsuario + " não encontrado.");
                   } else {
                   biblioteca.emprestarLivro(isbn, idUsuario);
                  }
                }
                     
               
           
               case 3 -> {
                   System.out.print("Digite o ISBN do livro a ser devolvido: ");
                   int isbn = scanner.nextInt();
                   scanner.nextLine(); 
                   Livro livro = biblioteca.buscarLivroPorIsbn(isbn);
                   if (livro == null) {
                  System.out.println("Erro: Livro com ISBN " + isbn + " não encontrado.");
                  } else if (livro.getIsDisponivel()) {
                  System.out.println("Erro: Livro não está emprestado.");
                  } else {
                  livro.setIsDisponivel(true);
                  livro.setIdUsuarioEmprestadoPara(0);
                  System.out.println("Livro devolvido com sucesso.");
    }
}
    
               
               case 4 -> {
                   
               }
               case 5 -> {
                   
               }
               case 6 -> {
                   System.out.println("Saindo...");
                   return;
               }
               default -> {
                   System.out.println("Opcao invalida.");
               }
           }
           
       
           }
   }        
}    
}    

    
   

    

