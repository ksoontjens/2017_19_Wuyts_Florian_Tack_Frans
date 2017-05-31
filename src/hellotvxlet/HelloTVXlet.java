package hellotvxlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {
    
    private HScene scene;
    
    int timelineHeight=35;
    int timelineWidth=72;
    
    int programHeight=111;
    int programWidth= 24;
    
    Color lineOddColor = Color.decode("#727272");
    Color lineEvenColor = Color.decode("#adadad");
    Color popUp2Color = Color.decode("#a8daff");
    
    Font timelineFont= new Font("SansSerif", Font.PLAIN, 20);
    Font closeFont= new Font("SansSerif", Font.PLAIN, 15);
    
    HStaticText label1;
    
    HStaticText timeline1;
    HStaticText timeline2;
    HStaticText timeline3;
    HStaticText timeline4;
    HStaticText timeline5;
    HStaticText timeline6;
    HStaticText timeline7;
    HStaticText timeline8;
    HStaticText timeline9;
    HStaticText timeline10;
    
    HStaticText zender1;
    HStaticText zender2;
    HStaticText zender3;
    HStaticText zender4;
    
    HTextButton button1;
    HTextButton button2;
    HTextButton button3;
    HTextButton button4;
    HTextButton button5;
    HTextButton button6;
    HTextButton button7;
    HTextButton button8;
    HTextButton button9;
    HTextButton button10;
    HTextButton button11;
    HTextButton button12;
    HTextButton button13;
    HTextButton button14;
    HTextButton button15;
    HTextButton button16;
    
    HTextButton buttonX;
    
    HStaticText popUp1;
    HStaticText popUp2;
    HTextButton buttonClose;
    
    String mainTitle = "KdG TV";
    
    String channelName1 = "EEN";
    String channelName2 = "CANVAS";
    String channelName3 = "VTM";
    String channelName4 = "VIER";
    
    int programLength0 = 0;
    //------------------------------
    String title9 = "Iedereen Beroemd";
    String text9 = "Dagelijks magazine dat laat zien waar mensen in Vlaanderen echt mee bezig zijn.";
    int programLength9 = 90;
    
    String title13 = "Thuis";
    String text13 = "Mayra en Ann hebben het niet gemakkelijk. Frank en Simonne steunen Peggy.\nDe spanning is te snijden tussen Peter en Peggy. Nancy legt Leo op de rooster.\nLowie heeft een investeerder gevonden. Er is goed nieuws voor Waldek.\nToon wordt geplaagd op het werk.";
    int programLength13 = 90;
    
    String title5 = "Het Journaal";
    String text5 = "Meerdere keren per dag het nieuws van het moment.";
    int programLength5 = 30;
    
    String title1 = "Blokken";
    String text1 = "Dagelijks quiz met Ben Crabbé als host,\nwaarbij mensen bij goede antwoorden tetris moeten spelen.";
    int programLength1 = 60;
    //------------------------------
    String title2 = "De Afspraak";
    String text2 = "Actuamagazine over het nieuws en de actualiteit van de dag.";
    int programLength2 = 15;
    
    String title6 = "Terzake";
    String text6 = "Nieuws- en duidingsmagazine met Kathleen Cools en Annelies Beck";
    int programLength6 = 90;
    
    String title10 = "Culture Club";
    String text10 = "een talkshow waarin Sofie Lemaire en Bent Van Looy met een open,\ngretige en nieuwsgierige blik kijken naar cultuur en de culturele actualiteit.\nCultuur in de meest brede betekenis van het woord, live op vrijdagavond, vanuit hartje Antwerpen.";
    int programLength10 = 90;
    
    String title14 = "Blood Ties";
    String text14 = "New York, 1974. Wanneer Chris Pierzynski na twee jaar vrijgelaten wordt uit de gevangenis,\nstaat zijn broer Frank, een ambitieuze politieagent, hem aan de poort op te wachten.\nOndanks de duidelijke verschillen tussen de twee broers,blijft de band sterk.\nFrank biedt Chris onderdak, helpt hem aan een baan en brengt hem terug in contact met zijn ex.\nMaar Chris kan z'n verleden niet ontlopen. Terwijl hij opnieuw afdaalt in een\nneerwaartse spiraal van criminaliteit, raakt ook Frank via zijn nieuwe vriendin verstrikt\nin een web van maffiose intriges.\n\nZullen de rivaliteit, het verraad en de conflicten de bloedband dan toch kunnen breken?";   
    int programLength14 = 90;
    //------------------------------
    String title3 = "The Voice\nVan Vlaanderen";
    String text3 = "In de finale van The Voice van Vlaanderen hebben coaches Natalia, Bart Peeters, Koen Wauters en\nBent Van Looy elk nog 1 poulain over. Deze 4 talenten moeten het rechtstreeks\ntegen elkaar opnemen. Wie de uiteindelijke Voice van Vlaanderen wordt,\nbeslist kijkend Vlaanderen. Dé Voice van Vlaanderen wordt dus diegene die in het totaal\nhet hoogst aantal stemmen heeft gehaald van de kijker.";
    int programLength3 = 70;
    
    String title7 = "Wat Als?";
    String text7 = "Wat als? is een Vlaams komisch sketchprogramma dat wordt gemaakt door het\nproductiehuis Shelter. Het programma werd bekroond met verschillende\nnationale en internationale prijzen, waaronder de International Emmy Award.";
    int programLength7 = 60;
    
    String title11 = "Tegen De Sterren Op";
    String text11 = "Tegen de Sterren op is een Vlaams komisch televisieprogramma dat sinds december 2010 op\nVTM wordt uitgezonden. In de reeks worden diverse bekende televisiegezichten,\ntelevisieprogramma's en films geparodieerd.";
    int programLength11 = 100;
    
    String title15 = "Stadion";
    String text15 = "Stadion is een sportprogramma van de Vlaamse tv-zender VTM.\nHet werd voor het eerst uitgezonden tussen 1994 en 2005 en keerde in 2011 terug.\nHet programma wordt afwisselend gepresenteerd door Maarten Breckx en Tom Coninx."; 
    int programLength15 = 45;
    //------------------------------
    String title4 = "Gert Late Night";
    String text4 = "Gert Late Night is een laatavond-praatprogramma dat sinds 24 april 6 weken lang\nvan maandag tot donderdag wordt uitgezonden op de Vlaamse commerciële televisiezender VIER.";    
    int programLength4 = 45;
    
    String title8 = "Jani Gaat";
    String text8 = "Hoewel Jani in zijn jonge jaren heel wat dansvloeren onveilig maakte,\nheeft hij er nooit aan gedacht om ballet te dansen. Hij huivert bij de gedachte zichzelf\nin een tutu te moeten hijsen, maar hij was altijd al gefascineerd door de elegantie\nen souplesse van de artiesten en de verhalen achter de coulissen.\nNu het Koninklijk Ballet van Vlaanderen haar grootste productie ooit voorbereidt,\nziet Jani een uitgelezen kans om deze wondere wereld van binnenuit te verkennen.\nEen wereld die hij nooit zal kunnen begrijpen zonder zelf eens op het podium te staan.\nMaar kan Jani zichzelf omtoveren tot een echte balletdanser? En slaagt de ambitieuze voorstelling\nvan het Ballet van Vlaanderen erin het publiek te betoveren?";   
    int programLength8 = 60;
    
    String title12 = "Komen Eten";
    String text12 = "Enkele mensen uitnodigen, een glaasje serveren, lekker eten op het vuur zetten,\nen vervolgens gezellig met zijn allen rond de tafel. Een sappig stukje vlees of\neen heerlijk mootje vis, lekkere beetgare groentjes gestoofd in een klontje boter,\nen daarbij enkele krokant gebakken aardappeltjes of een toefje smeuïge puree.\nDit voorjaar pakt het populaire VIER-programma uit met zijn zeventiende seizoen,\nin een opgefriste versie en met enkele smakelijke themaweken. De Komen Eters zorgen\nzoals altijd voor de sfeer en de gezelligheid, Herman Verbruggen zorgt met\nzijn schalkse commentaar voor het zout op de patatjes.";
    int programLength12 = 90;
    
    String title16 = "Friends";
    String text16 = "Monica, Rachel, Chandler, Joey, Phoebe en Ross zijn beste vrienden die wonen in de metropool\nNew York City. Hun leven is niet altijd even gemakkelijk. Werk en relaties (of het gebrek eraan)\nbrengen natuurlijk zorgen met zich mee. Gelukkig steunen de zes vrienden elkaar\ndoor dik en dun, en dat gebeurt meestal op een bijzonder grappige manier...";
    int programLength16 = 80;
    //------------------------------
    
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      scene=HSceneFactory.getInstance().getDefaultHScene();
      
      label1=new HStaticText(mainTitle,0,0,720,100);
      label1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      label1.setBackground(Color.decode("#686868"));
      label1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      scene.add(label1);
      
      timeline1=new HStaticText("",(timelineWidth*0),100,72,timelineHeight);
      timeline1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline1.setBackground(Color.decode("#adadad"));
      timeline1.setFont(timelineFont);
      scene.add(timeline1);
      
      timeline2=new HStaticText("|  18:00",(timelineWidth*1),100,72,timelineHeight);
      timeline2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline2.setBackground(Color.decode("#adadad"));
      timeline2.setFont(timelineFont);
      scene.add(timeline2);
      
      timeline3=new HStaticText("|  18:30",(timelineWidth*2),100,72,timelineHeight);
      timeline3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline3.setBackground(Color.decode("#adadad"));
      timeline3.setFont(timelineFont);
      scene.add(timeline3);
      
      timeline4=new HStaticText("|  19:00",(timelineWidth*3),100,72,timelineHeight);
      timeline4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline4.setBackground(Color.decode("#adadad"));
      timeline4.setFont(timelineFont);
      scene.add(timeline4);
      
      timeline5=new HStaticText("|  19:30",(timelineWidth*4),100,72,timelineHeight);
      timeline5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline5.setBackground(Color.decode("#adadad"));
      timeline5.setFont(timelineFont);
      scene.add(timeline5);
      
      timeline6=new HStaticText("|  20:00",(timelineWidth*5),100,72,timelineHeight);
      timeline6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline6.setBackground(Color.decode("#adadad"));
      timeline6.setFont(timelineFont);
      scene.add(timeline6);
      
      timeline7=new HStaticText("|  20:30",(timelineWidth*6),100,72,timelineHeight);
      timeline7.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline7.setBackground(Color.decode("#adadad"));
      timeline7.setFont(timelineFont);
      scene.add(timeline7);
      
      timeline8=new HStaticText("|  21:00",(timelineWidth*7),100,72,timelineHeight);
      timeline8.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline8.setBackground(Color.decode("#adadad"));
      timeline8.setFont(timelineFont);
      scene.add(timeline8);
      
      timeline9=new HStaticText("|  21:30",(timelineWidth*8),100,72,timelineHeight);
      timeline9.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline9.setBackground(Color.decode("#adadad"));
      timeline9.setFont(timelineFont);
      scene.add(timeline9);
      
      timeline10=new HStaticText("|  22:00",(timelineWidth*9),100,72,timelineHeight);
      timeline10.setBackgroundMode(HVisible.BACKGROUND_FILL);
      timeline10.setBackground(Color.decode("#adadad"));
      timeline10.setFont(timelineFont);
      scene.add(timeline10);
      
      //---------------------PROGRAMMA'S-------------------------------------------------------------------------------------
      
      zender1=new HStaticText(channelName1,0,(programHeight*0)+135,80,programHeight);
      zender1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      zender1.setBackground(lineOddColor);
      zender1.setFont(timelineFont);
      scene.add(zender1);
      
      zender2=new HStaticText(channelName2,0,(programHeight*1)+135,80,programHeight);
      zender2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      zender2.setBackground(lineEvenColor);
      zender2.setFont(timelineFont);
      scene.add(zender2);
      
      zender3=new HStaticText(channelName3,0,(programHeight*2)+135,80,programHeight);
      zender3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      zender3.setBackground(lineOddColor);
      zender3.setFont(timelineFont);
      scene.add(zender3);
      
      zender4=new HStaticText(channelName4,0,(programHeight*3)+135,80,programHeight);
      zender4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      zender4.setBackground(lineEvenColor);
      zender4.setFont(timelineFont);
      scene.add(zender4);
      
      
      //---------------------LINE 1----------------------------------------------------------------------------
      button1=new HTextButton(title1,80+((programLength0/10)*programWidth),(programHeight*0)+135,(programLength1/10)*programWidth,programHeight);
      button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button1.setBackground(lineOddColor);
      scene.add(button1);
      
      button5=new HTextButton(title5,80+(((programLength0 + programLength1)/10)*programWidth),(programHeight*0)+135,(programLength5/10)*programWidth,programHeight);
      button5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button5.setBackground(lineOddColor);
      scene.add(button5);
      
      button9=new HTextButton(title9,80+(((programLength0 + programLength1 + programLength5)/10)*programWidth),(programHeight*0)+135,(programLength9/10)*programWidth,programHeight);
      button9.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button9.setBackground(lineOddColor);
      scene.add(button9);
      
      button13=new HTextButton(title13,80+(((programLength0 + programLength1 + programLength5 + programLength9)/10)*programWidth),(programHeight*0)+135,(programLength13/10)*programWidth,programHeight);
      button13.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button13.setBackground(lineOddColor);
      scene.add(button13);
      
      //---------------------LINE 2----------------------------------------------------------------------------
      button2=new HTextButton(title2,80+((programLength0/10)*programWidth),(programHeight*1)+135,(programLength2/10)*programWidth,programHeight);
      button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button2.setBackground(lineEvenColor);
      scene.add(button2);
      
      button6=new HTextButton(title6,80+(((programLength0 + programLength2)/10)*programWidth),(programHeight*1)+135,(programLength6/10)*programWidth,programHeight);
      button6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button6.setBackground(lineEvenColor);
      scene.add(button6);
      
      button10=new HTextButton(title10,80+(((programLength0 + programLength2 + programLength6)/10)*programWidth),(programHeight*1)+135,(programLength10/10)*programWidth,programHeight);
      button10.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button10.setBackground(lineEvenColor);
      scene.add(button10);
      
      button14=new HTextButton(title14,80+(((programLength0 + programLength2 + programLength6 + programLength10)/10)*programWidth),(programHeight*1)+135,(programLength14/10)*programWidth,programHeight);
      button14.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button14.setBackground(lineEvenColor);
      scene.add(button14);
      
      //---------------------LINE 3----------------------------------------------------------------------------
      button3=new HTextButton(title3,80+((programLength0/10)*programWidth),(programHeight*2)+135,(programLength3/10)*programWidth,programHeight);
      button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button3.setBackground(lineOddColor);
      scene.add(button3);
      
      button7=new HTextButton(title7,80+(((programLength0 + programLength3)/10)*programWidth),(programHeight*2)+135,(programLength7/10)*programWidth,programHeight);
      button7.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button7.setBackground(lineOddColor);
      scene.add(button7);
      
      button11=new HTextButton(title11,80+(((programLength0 + programLength3 + programLength7)/10)*programWidth),(programHeight*2)+135,(programLength11/10)*programWidth,programHeight);
      button11.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button11.setBackground(lineOddColor);
      scene.add(button11);
      
      button15=new HTextButton(title15,80+(((programLength0 + programLength3 + programLength7 + programLength11)/10)*programWidth),(programHeight*2)+135,(programLength15/10)*programWidth,programHeight);
      button15.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button15.setBackground(lineOddColor);
      scene.add(button15);
      
      //---------------------LINE 4----------------------------------------------------------------------------
      button4=new HTextButton(title4,80+((programLength0/10)*programWidth),(programHeight*3)+135,(programLength4/10)*programWidth,programHeight);
      button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button4.setBackground(lineEvenColor);
      scene.add(button4);
      
      button8=new HTextButton(title8,80+(((programLength0 + programLength4)/10)*programWidth),(programHeight*3)+135,(programLength8/10)*programWidth,programHeight);
      button8.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button8.setBackground(lineEvenColor);
      scene.add(button8);
      
      button12=new HTextButton(title12,80+(((programLength0 + programLength4 + programLength8)/10)*programWidth),(programHeight*3)+135,(programLength12/10)*programWidth,programHeight);
      button12.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button12.setBackground(lineEvenColor);
      scene.add(button12);
      
      button16=new HTextButton(title16,80+(((programLength0 + programLength4 + programLength8 + programLength12)/10)*programWidth),(programHeight*3)+135,(programLength16/10)*programWidth,programHeight);
      button16.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button16.setBackground(lineEvenColor);
      scene.add(button16);
      
      
      //--------------------------------------------------------------------------------------------------      
      
      button1.setFocusTraversal(null, button2, null, button5);
      button2.setFocusTraversal(button1, button3,null,button6);
      button3.setFocusTraversal(button2, button4, null,button7);
      button4.setFocusTraversal(button3, null,null,button8);
      button5.setFocusTraversal(null, button6, button1, button9);
      button6.setFocusTraversal(button5, button7,button2,button10);
      button7.setFocusTraversal(button6, button8, button3,button11);
      button8.setFocusTraversal(button7, null,button4,button12);
      button9.setFocusTraversal(null, button10, button5, button13);
      button10.setFocusTraversal(button9, button11,button6,button14);
      button11.setFocusTraversal(button10, button12, button7,button15);
      button12.setFocusTraversal(button11, null,button8,button16);
      button13.setFocusTraversal(null, button14, button9, null);
      button14.setFocusTraversal(button13, button15,button10,null);
      button15.setFocusTraversal(button14, button16, button11,null);
      button16.setFocusTraversal(button15, null,button12,null);
      
      button1.requestFocus();
      
      button1.setActionCommand("button1");
      button1.addHActionListener(this);
      button2.setActionCommand("button2");
      button2.addHActionListener(this);
      button3.setActionCommand("button3");
      button3.addHActionListener(this);
      button4.setActionCommand("button4");
      button4.addHActionListener(this);
      button5.setActionCommand("button5");
      button5.addHActionListener(this);
      button6.setActionCommand("button6");
      button6.addHActionListener(this);
      button7.setActionCommand("button7");
      button7.addHActionListener(this);
      button8.setActionCommand("button8");
      button8.addHActionListener(this);      
      button9.setActionCommand("button9");
      button9.addHActionListener(this);
      button10.setActionCommand("button10");
      button10.addHActionListener(this);
      button11.setActionCommand("button11");
      button11.addHActionListener(this);
      button12.setActionCommand("button12");
      button12.addHActionListener(this);
      button13.setActionCommand("button13");
      button13.addHActionListener(this);
      button14.setActionCommand("button14");
      button14.addHActionListener(this);
      button15.setActionCommand("button15");
      button15.addHActionListener(this);
      button16.setActionCommand("button16");
      button16.addHActionListener(this);
      
              
      scene.validate(); scene.setVisible(true);
      
      
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        if (arg0.getActionCommand().equals("button1"))
        {
            popUp1=new HStaticText(title1,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text1,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button1;
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("button2"))
        {
            popUp1=new HStaticText(title2,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text2,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button2;
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("button3"))
        {
            popUp1=new HStaticText(title3,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text3,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button3;
            
            scene.repaint(); 
        }
        else if (arg0.getActionCommand().equals("button4"))
        {
            popUp1=new HStaticText(title4,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text4,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button4;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button5"))
        {
            popUp1=new HStaticText(title5,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text5,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button5;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button6"))
        {
            popUp1=new HStaticText(title6,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text6,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button6;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button7"))
        {
            popUp1=new HStaticText(title7,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text7,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button7;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button8"))
        {
            popUp1=new HStaticText(title8,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text8,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button8;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button9"))
        {
            popUp1=new HStaticText(title9,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text9,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button9;
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("button10"))
        {
            popUp1=new HStaticText(title10,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text10,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button10;
            
            scene.repaint();
        }
        else if (arg0.getActionCommand().equals("button11"))
        {
            popUp1=new HStaticText(title11,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text11,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button11;
            
            scene.repaint(); 
        }
        else if (arg0.getActionCommand().equals("button12"))
        {
            popUp1=new HStaticText(title12,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text12,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button12;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button13"))
        {
            popUp1=new HStaticText(title13,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text13,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button13;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button14"))
        {
            popUp1=new HStaticText(title14,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text14,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button14;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button15"))
        {
            popUp1=new HStaticText(title15,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text15,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button15;
            
            scene.repaint(); 
        }
        
        else if (arg0.getActionCommand().equals("button16"))
        {
            popUp1=new HStaticText(title16,0,0,720,100);
            popUp1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp1.setBackground(Color.decode("#686868"));
            popUp1.setFont(new Font("SansSerif", Font.PLAIN, 50));
      
            popUp2=new HStaticText(text16,0,100,720,480);
            popUp2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            popUp2.setBackground(popUp2Color);
            popUp2.setFont(timelineFont);
            
            scene.add(popUp1);
            scene.popToFront(popUp1);            
            scene.add(popUp2);
            scene.popToFront(popUp2);
            
            
            buttonClose=new HTextButton("Sluiten",635,110,75,37);
            buttonClose.setBackgroundMode(HVisible.BACKGROUND_FILL);
            buttonClose.setBackground(lineOddColor);
            buttonClose.setFont(closeFont);
            scene.add(buttonClose);
            scene.popToFront(buttonClose);
            buttonClose.requestFocus();
            
            buttonClose.setActionCommand("buttonClose");
            buttonClose.addHActionListener(this);
            
            buttonX = button16;
            
            scene.repaint(); 
        }
        
        
        
        
        else if (arg0.getActionCommand().equals("buttonClose"))
        {
            scene.remove(popUp1);
            scene.remove(popUp2);
            scene.remove(buttonClose);
            
            scene.popToFront(button1);
            scene.popToFront(button2);
            scene.popToFront(button3);
            scene.popToFront(button4);
            scene.popToFront(button5);
            scene.popToFront(button6);
            scene.popToFront(button7);
            scene.popToFront(button8);
            scene.popToFront(button9);
            scene.popToFront(button10);
            scene.popToFront(button11);
            scene.popToFront(button12);
            scene.popToFront(button13);
            scene.popToFront(button14);
            scene.popToFront(button15);
            scene.popToFront(button16);
            
            scene.popToFront(zender1);
            scene.popToFront(zender2);
            scene.popToFront(zender3);
            scene.popToFront(zender4);
            
            scene.popToFront(timeline1);
            scene.popToFront(timeline2);
            scene.popToFront(timeline3);
            scene.popToFront(timeline4);
            scene.popToFront(timeline5);
            scene.popToFront(timeline6);
            scene.popToFront(timeline7);
            scene.popToFront(timeline8);
            scene.popToFront(timeline9);
            scene.popToFront(timeline10);
            
            buttonX.requestFocus();
            
            scene.repaint();
        };
    }
}
