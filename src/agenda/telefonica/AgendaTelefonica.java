package agenda.telefonica;

public class AgendaTelefonica {

    public static void main(String[] args) {
      Ventana agends = new Ventana();
      agends.setTitle("Agenda telefonica");
       agends.setBounds(200,300, 900,400);
       agends.setResizable(false);
       agends.inserpanel();
       agends.textos();
       agends.botones();
    }

}
