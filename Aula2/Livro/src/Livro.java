    public class Livro {
    	private String titulo;
    	private String autor;
    	private int ano;
    	String editora;    	
    
    Livro(String titulo, String autor,int ano,String editora){
      this.titulo = titulo;
      this.autor = autor;
      this.editora = editora;
      this.ano = ano;
   }
      
 
    @Override
    
    public String toString() {
    	 return "Titulo:" + titulo + "Autor:" + autor + "Editora" + editora + "Ano" + ano;
    }
       public void setTitulo(String titulo) {
    	   this.titulo = titulo;
       }
       public String getTitulo() {
    	   return titulo;
       }
    public void setAutor(String autor) {
    	 this.autor = autor;
    }
       public String getAutor() {
    	   return autor;
       }
    public void setAno(int ano) {
    	this.ano = ano;
    }
      public int getAno() {
    	  return ano;
      }
      public void setEditora(String editora) {
   	   this.titulo = editora;
      }
      public String getEditora() {
   	   return editora;
      }
    
    
    
    
    
    }