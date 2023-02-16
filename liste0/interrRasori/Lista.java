public class Lista{
  private Nodo head;
  public Lista(){
    head=null;
  }
  public void inserisciInTesta(char info){
    Nodo pn=new Nodo(info);
    pn.setLink(head);
    head=pn;
  }
  public String toString(){
    String s  ="Lista: ";
    Nodo p = head;
    while(p != null){
      s += p.getInfo() + " ";
      p = p.getLink();
    }
    return s;
  }
  public int spostaInizio(){
    Nodo p = head;
    Nodo pPrec = head;
    if(head == null || head.getLink() == null){
      return -1;
    }
    else{
      while(p.getLink()!=null){
        pPrec=p;
        p=p.getLink();
      }
      pPrec.setLink(null);
      p.setLink(head);
      head=p;
      return 0;
    }
  }
  public int scambiaCoppie(){
    Nodo p=head;
    Nodo pPrec=head;
    if(head == null || head.getLink() == null){
      return -1;
    }
    while(p.getLink()!=null){
      if(p==null){
        return 0;
      }
      else{
        p.setLink(p.getLink().getLink())
      }
      pPrec=p;
      p=p.getLink();
      p.setLink(pPrec);
    }
  }
}