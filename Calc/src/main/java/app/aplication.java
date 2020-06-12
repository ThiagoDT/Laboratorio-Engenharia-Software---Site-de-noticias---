package app;

public class aplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
                            String[][] lista={{"1", "2","adicao", "3"},
                                    {"2", "3","multiplicacao", "6"},
                                    {"1", "2","divisao", "0.5"}};

                            for(int x=0;x<lista.length;x++){
                                for(int y=0;y<lista[x].length;y++){
                                    System.out.print(lista[x][y]);
                                }
                                System.out.println("");
                            }
                        }catch(Exception ex){
                            System.err.println("ERR0: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
                        }
    }
}
