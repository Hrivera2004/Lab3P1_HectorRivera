package lab3p1_hectorrivera;
import java.util.Scanner;
public class Lab3P1_HectorRivera {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1.¡Sucesiones y más sucesiones!");
        System.out.println("2.¡Pocket Monsters! ");
        System.out.println("3.¡Asterisco en casa!");
        System.out.print("Ingrese Cual desea usar: ");
        int opcion=leer.nextInt();
        while(opcion>0&&opcion<4){
            switch(opcion){
                
                case 1:{
                    System.out.println("--¡Sucesiones y más sucesiones!--");
                    System.out.println(" ");
                    System.out.print("Differencia: ");
                    int dif=leer.nextInt();
                    System.out.print("Inicial: ");
                    int ini=leer.nextInt();
                    System.out.print("cantidad: ");
                    int can=leer.nextInt();
                    System.out.print(ini);
                    int num= ini+dif;
                    for(int i=1;i<can;i++){
                        System.out.print(","+num);
                        num=num+dif+i;
                    }
                    System.out.println(" ");
                    System.out.println("Que numero desea ver mas adelante de la sucession:");
                    can=leer.nextInt();
                    num= ini+dif;
                    for (int j=1;j<can-1;j++) {
                        num=num+(dif+j);   
                    }
                    //Se puede mejorar
                    System.out.println("el numero seria: "+num);
                    
                }
                break;
                
                case 2:{
                    System.out.println("--¡Pocket Monsters!--");
                    System.out.println(" ");
                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1.Hasta la Muerte ");
                    System.out.println("2.Por Rondas ");
                    int type=leer.nextInt();
                    System.out.println("Estadisticas de los pokemons: ");
                    System.out.println("Sylveon- Vida:280 Ataque:80 Defensa:15%");
                    System.out.println("Gyrados- Vida:300 Ataque:50 Defensa:10%");
                    System.out.println("Giritina- Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Dragonite- Vida:250 Ataque:75 Defensa:20%");
                    System.out.println(" ");
                    System.out.println("Ingrese una pelea determinante");
                    System.out.println("1.Sylveon vrs Dragonnite ");
                    System.out.println("2.Gyrados vrs Giratina ");
                    System.out.println("3.Dragonite vrs Giratina ");
                    System.out.println("4.Giratina vrs Sylveon ");
                    int vrs=leer.nextInt();
                    double vida1,vida2,atq1,atq2,def1,def2;
                    
                    switch(vrs){
                        case 1:{
                        vida1=280.00;
                        atq1=80;
                        def1=0.15;
                        vida2=250.00;
                        atq2=75;
                        def2=0.20;
                            switch(type){
                                case 1:{
                                    int rond=1;
                                    while(vida1>0&&vida2>0){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                    
                                }
                                break;
                                case 2:{
                                    System.out.println("Ingrese limite de rondas: ");
                                    int lim= leer.nextInt();
                                    while(lim>10||lim<0){
                                       System.out.println("No puede ser mayor que 10 o menor que 1, Ingrese denuevo: ");
                                       lim= leer.nextInt(); 
                                    }
                                    int rond=1;
                                    while(lim>rond){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                }
                                break;
                            }   
                        }
                        break;   
                        case 2:{
                            vida1=300.00;
                            atq1=50;
                            def1=0.10;
                            vida2=300.00;
                            atq2=70;
                            def2=0.25;  
                            switch(type){
                                case 1:{
                                    int rond=1;
                                    while(vida1>0&&vida2>0){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                    
                                }
                                break;
                            
                                case 2:{
                                    System.out.println("Ingrese limite de rondas: ");
                                    int lim= leer.nextInt();
                                    while(lim>10||lim<0){
                                       System.out.println("No puede ser mayor que 10 o menor que 1, Ingrese denuevo: ");
                                       lim= leer.nextInt(); 
                                    }
                                    int rond=1;
                                    while(lim>rond){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                }
                                break;
                            }
                        }
                        break;
                        case 3:{
                            vida1=250.00;
                            atq1=75;
                            def1=0.20;
                            vida2=300;
                            atq2=70;
                            def2=0.25;
                            switch(type){
                                case 1:{
                                    int rond=1;
                                    while(vida1>0&&vida2>0){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                    
                                }
                                break;
                                case 2:{                        
                                    System.out.println("Ingrese limite de rondas: ");
                                    int lim= leer.nextInt();
                                    while(lim>10||lim<0){
                                       System.out.println("No puede ser mayor que 10 o menor que 1, Ingrese denuevo: ");
                                       lim= leer.nextInt(); 
                                    }
                                    int rond=1;
                                    while(lim>rond){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                }
                                break;
                            }
                        }
                        break;
                        case 4:{
                            vida1=300.00;
                            atq1=70;
                            def1=0.25;
                            vida2=280;
                            atq2=80;
                            def2=0.15;
                            switch(type){
                                case 1:{
                                    int rond=1;
                                    while(vida1>0&&vida2>0){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }
                                    
                                }
                                break;
                                case 2:{
                                    System.out.println("Ingrese limite de rondas: ");
                                    int lim= leer.nextInt();
                                    while(lim>10||lim<0){
                                       System.out.println("No puede ser mayor que 10 o menor que 1, Ingrese denuevo: ");
                                       lim= leer.nextInt(); 
                                    }
                                    int rond=1;
                                    while(lim>rond){
                                        System.out.println("------Ronda "+rond+"------");
                                        rond++;
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 ha atacado ");
                                        System.out.println("Pokemon 2 ha atacado");
                                        vida1=vida1-(atq2*def1);
                                        vida2=vida2-(atq1*def2);
                                        if(vida1<0){
                                            vida1=0;
                                        }else{ 
                                            if(vida2<0){
                                            vida2=0;
                                            }
                                        }
                                        System.out.println("Vida de Pokemon 1:"+vida1);
                                        System.out.println("Vida de Pokemon 2:"+vida2);
                                    }
                                    
                                    System.out.println("********FIN DEL COMBATE********");
                                    
                                    if (vida1>vida2){
                                        System.out.println("Pokemon 1 ha sido el ganador");    
                                    }else{
                                        System.out.println("Pokemon 2 ha sido el ganador");
                                    }   
                                }
                                break;
                            }
                        }
                        break;
                    }//fin swithc  
                }
                break;
                
                case 3:{
                    System.out.println("Ingrese el tamano(Numero impar): ");
                    int tam= leer.nextInt();
                    while(tam%2==0||tam<7){
                        System.out.println("No puede ser menor que 7 o impar");
                        System.out.println("Ingrese denuevo: ");
                        tam = leer.nextInt();
                    }
                    
                    for(int y=1;y<=tam;y++){
                        for(int x=1;x<=tam;x++){
                            if(x==1||y==1||x==tam||y==tam){
                                System.out.print("* ");
                            }else if(x== ((tam-1)/2)+1 ){
                                    System.out.print("| ");
                                }else if (y!=((tam-1)/2)+1 && x!=1 && x!=tam &&( x==y||(x+y)%2==0)){
                                        System.out.print("< ");
                                    }else{
                                    System.out.print("  ");
                                    
                                }
                            
                        }
                        System.out.println(" ");           
                    }
                }break;   
            }//fin switch
        System.out.println("--------Menu--------");
        System.out.println("1.¡Sucesiones y más sucesiones!");
        System.out.println("2.¡Pocket Monsters! ");
        System.out.println("3.¡Asterisco en casa!");
        System.out.print("Ingrese Cual desea usar: ");
        opcion=leer.nextInt();
        }//fin while
 
    }//fin main 
}// fin class
