package main;

/**
 *
 * @author Layla
 */
        
        
   public class Dados {

   private String nome_do_anúncio;
   
   private String cliente;
   
   private String data_de_inicio;
   
   private String data_de_término;
    
   private String Inv_por_Dia;
   
   public Dados(){
   
   
   }
   
   public String getNome_do_anúncio(){
   
   return nome_do_anúncio;
   
   }
   
   public void setNome_do_anúncio(String name){
   
   nome_do_anúncio = name;
   }
   
   public String getCliente(){
   
   return cliente;
   }
   
   public void setCliente(String cli ){
   
   cliente = cli;
   }
   
   public String getData_de_inicio(){
   
   return data_de_inicio;
   }
   
   public void setData_de_inicio(String date){
   
   data_de_inicio = date;
    
   }
   public String getData_de_término(){
   
   return data_de_término;
   }
   public void setData_de_término(String date){
   
   data_de_término = date;
   }
   public String getInv_por_Dia(){
   
   return Inv_por_Dia;
   
   }
   public void setInv_por_Dia(String inv){
   
   Inv_por_Dia = inv;
   }
   
}
