/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadonemodevi;

/**
 *
 * @author  Fatihcan Uslu
 */
import java.awt.event.*;
import javax.swing.*;

public class JavaDonemOdevi extends JFrame implements ActionListener{

    
    JButton jbt,jbt2,jbt3,jbt4;
    JTextField text1,text2,ad,soyad,mail,tel;
    JTextArea bilgi;
    JLabel ad1,soyad1,email,tel1;
    
    JavaDonemOdevi(String pencereninadi){
        super(pencereninadi);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        jbt=new JButton("Musteri Ekle");
        jbt.setBounds(250,200,150,30);
        jbt.setActionCommand("a");        
        this.add(jbt);
        
        jbt2=new JButton("Musteri Bilgileri");
        jbt2.setBounds(50,250,150,30);
        jbt2.setActionCommand("b");
        this.add(jbt2);
        
        jbt3=new JButton("Hesap Bilgileri");
        jbt3.setBounds(250,250,150,30);
        //jbt3.setActionCommand("c");
        this.add(jbt3);
        
        jbt4=new JButton("Kredi Bilgileri");
        jbt4.setBounds(450,250,150,30);
        //jbt4.setActionCommand("d");
        this.add(jbt4);
        
        text1=new JTextField("Author");
        text1.setBounds(600,470,150,30);
        this.add(text1);
        text2=new JTextField("Fatihcan Uslu");
        text2.setBounds(600,510,150,30);
        this.add(text2);
        
        ad=new JTextField("");
        ad.setBounds(250,20,150,20);
        this.add(ad);
        soyad=new JTextField("");
        soyad.setBounds(250,42,150,20);
        this.add(soyad);
        mail=new JTextField("");
        mail.setBounds(250,62,150,20);
        this.add(mail);
        tel=new JTextField("");
        tel.setBounds(250,82,150,20);
        this.add(tel);
        bilgi=new JTextArea("");
        bilgi.setBounds(50,300,650,100);
        this.add(bilgi);
        ad1=new JLabel("ad:");
        ad1.setBounds(200,20,150,20);
        this.add(ad1);
        soyad1=new JLabel("soyad:");
        soyad1.setBounds(200,42,150,20);
        this.add(soyad1);
        email=new JLabel("email:");
        email.setBounds(200,62,150,20);
        this.add(email);
        tel1=new JLabel("tel:");
        tel1.setBounds(200,82,150,20);
        this.add(tel1);
      
        
        jbt.addActionListener(this);
        jbt2.addActionListener(this);
        
        
        this.setSize(800,600);
        this.setVisible(true);
        
    }
    Musteri test=new Musteri("","","",0,0);
    BankaPersoneli test1=new BankaPersoneli("","","",0,0);
    
    BankaPersoneli fatma=new BankaPersoneli("fatma","vakif","fatma@gmail.com",55123,test1.personelid());//bankada olu??turdu??um bir ??al????an
    Musteri[] musteri=new Musteri[100];    
    public void actionPerformed(ActionEvent e){
        String komut=e.getActionCommand();
        int i=0;
        
        
        if(komut.equals("a")){
            
            //rastgele ??retilen m????teri numarasi
            double x=Double.parseDouble(tel.getText());// telefon numaras??n?? tutup yeni m????teri olu??tururken kullanabilmek i??in kulland??k
            musteri[i]=new Musteri(ad.getText(),soyad.getText(),mail.getText(),x,test.musterinumarasi());
                       
            fatma.musteriEkle(musteri[i]);//m??steriyi m????teri arraylist'ime eklemeye ??al????t??m
            i++;
            
            fatma.musterileriGoster();
            JOptionPane.showMessageDialog(null,"Musteri eklendi","Musteri eklendi ba??l??????",3);//buttonda joptionpane ile bir mesaj g??stertdim
            
        }
        if(komut.equals("b")){
            bilgi.setText(fatma.musterileridondur());//bilgi1 bir label oy??zede g??z??kmesini istedim musterileridondur m??steri arraylistinden elemanlar?? alan bir method
            
        }
            
                
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        JavaDonemOdevi ahmet=new JavaDonemOdevi("pencereninadi");
            
        
        
       
       
        
        
        
        
        
        
        
        //B??t??n testlerim a??a????dad??r
        
        
        
        
        //Kredi kart?? borcu ??deme ve kart?? kapatma
                            
        /*
        
        //Ulvi vadesiz hesab??ndan kredi karti borcunu odeyip kart??n?? kapat??yor  
        
        BankaHesabi test=new BankaHesabi(0,0);
        KrediKarti  test1=new KrediKarti(0,0,0,0);
        Musteri ulvi=new Musteri("ulvi","uslu","ahmet@gmail.com",5376,1);        
        VadesizHesap vh1=new VadesizHesap(test.randomiban(),500.0,"vadesiz");
        KrediKarti kk1=new KrediKarti(test1.randomkartnumarasi(),5000.0,300.0,4700);
        ulvi.krediKartiEkle(kk1);
        ulvi.hesapEkle(vh1);
        ulvi.krediKartiBilgileriniGoster();
        ulvi.krediKartiSil(kk1);
        vh1.krediKartiBorcOdeme(kk1, vh1, 300);
        ulvi.krediKartiBilgileriniGoster();
        ulvi.krediKartiSil(kk1);
        */
        
        
        //ParaCek
        /*
        
        //Ruveyda yat??r??m hesab??ndan kendi hesab??na para aktar??yor 
        
        BankaHesabi test=new BankaHesabi(0,0);
        Musteri ruveysa=new Musteri("ruveysa","uslu","ayse@gmail.com",5321,2);
        VadesizHesap vh1=new VadesizHesap(test.randomiban(),500.0,"vadesiz");
        YatirimHesabi vh2=new YatirimHesabi(test.randomiban(),500.0,"yatirim");
        ruveysa.hesapEkle(vh1); 
        ruveysa.hesapEkle(vh2);
        ruveysa.hesapBilgileriniGoster();
        vh2.paraCek(vh2,vh1,200);
        ruveysa.hesapBilgileriniGoster();
        */
        
        
        //ParaEkle
        /*
        
        //Ruveyda kendi hesabindan yatirim hesabina para atiyor 
        
        BankaHesabi test=new BankaHesabi(0,0);
        Musteri ruveysa=new Musteri("ruveysa","uslu","ayse@gmail.com",5321,2);
        VadesizHesap vh1=new VadesizHesap(test.randomiban(),500.0,"vadesiz");
        YatirimHesabi vh2=new YatirimHesabi(test.randomiban(),500.0,"yatirim");
        ruveysa.hesapEkle(vh1); 
        ruveysa.hesapEkle(vh2);
        ruveysa.hesapBilgileriniGoster();
        vh2.paraEkle(vh1,vh2,200);
        ruveysa.hesapBilgileriniGoster();
        */
        //ParaTransferi
        
        /*
        
        //iki farkl?? m????teriye ait biri yat??r??m ??teki vadesiz olmak ??zere para transferi
        
        BankaHesabi test=new BankaHesabi(0,0);
        Musteri ulvi=new Musteri("ulvi","uslu","ahmet@gmail.com",5376,1);
        VadesizHesap vh1=new VadesizHesap(test.randomiban(),500.0,"vadesiz");
        ulvi.hesapEkle(vh1); 
        ulvi.hesapBilgileriniGoster();
        Musteri ruveysa=new Musteri("ruveysa","uslu","ayse@gmail.com",5321,2);
        YatirimHesabi vh2=new YatirimHesabi(test.randomiban(),500.0,"yatirim");
        ruveysa.hesapEkle(vh2); 
        ruveysa.hesapBilgileriniGoster();
        vh1.paraTransferi(vh1,vh2,200.0);//vadesizden yat??r??ma 
        ulvi.hesapBilgileriniGoster();
        ruveysa.hesapBilgileriniGoster();
        */
        
        
        
        
         /*
            
           //Di??er Test a??amalar??m
        
        Musteri ahmet=new Musteri("ahmet","uslu","ahmet@gmail.com",5376,1);
        VadesizHesap vh1=new VadesizHesap(1111,850.0,"vadesiz");
        VadesizHesap vh2=new VadesizHesap(1112,450.0,"vadesiz");
        YatirimHesabi yh1=new YatirimHesabi(1113,1000.0,"yatirim hesabi");
        KrediKarti kk1=new KrediKarti(1,5000.0,300.0,4700);
        ahmet.hesapEkle(vh1);     
        ahmet.hesapEkle(yh1); 
        Musteri ayse=new Musteri("ayse","uslu","ayse@gmail.com",5321,2);
        ayse.hesapEkle(vh2);
        ahmet.hesapBilgileriniGoster();
        BankaPersoneli fatma=new BankaPersoneli("fatma","vakif","fatma@gmail.com",55123,2);
        Musteri veli=new Musteri("veli","uslu","ahmet@gmail.com",5376,1);         
        fatma.musteriEkle(veli);
        fatma.musteriEkle(ayse);
        fatma.musterileriGoster();        
        ahmet.hesapBilgileriniGoster();
        ahmet.krediKartiEkle(kk1);
        ayse.hesapBilgileriniGoster();
        ahmet.hesapBilgileriniGoster();
        ayse.hesapBilgileriniGoster();
        vh1.paraTransferi(vh1,vh2,1.0);
        ahmet.hesapBilgileriniGoster();
        ayse.hesapBilgileriniGoster();
        ahmet.krediKartiBilgileriniGoster();
        vh2.krediKartiBorcOdeme(kk1,vh1,300.0);
        ahmet.hesapBilgileriniGoster();
        ahmet.krediKartiBilgileriniGoster();
        ayse.hesapBilgileriniGoster();
     
        
         */
         
         /*
        
        BankaHesabi test=new BankaHesabi(0,0);
        KrediKarti  test1=new KrediKarti(0,0,0,0);
        Musteri ulvi=new Musteri("ulvi","uslu","ahmet@gmail.com",1,1);
        
        KrediKarti kk1=new KrediKarti(test1.randomkartnumarasi(),5000.0,300.0,4700);       
        ulvi.krediKartiEkle(kk1);
        ulvi.krediKartiBilgileriniGoster();
        */
    }

   
    
}
