/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OTROS;

/**
 *
 * @author Ottoniel
 */
public class manejaCaracteres {
    int contadorA = 12;
    int contadorB = 2;
    int contadorC = 4;
    int contadorD = 5;
    int contadorE = 12;
    int contadorF = 1;
    int contadorG = 2;
    int contadorH = 2;
    int contadorI = 6;
    int contadorJ = 1;
    int contadorL = 4;
    int contadorM = 2;
    int contadorN = 5;
    int contadorÑ = 1;
    int contadorO = 9;
    int contadorP = 2;
    int contadorQ = 1;
    int contadorR = 5;
    int contadorS = 6;
    int contadorT = 4;
    int contadorU = 5;
    int contadorV = 1;
    int contadorY = 1;
    int contadorZ = 1;
    public int contadorGeneral = 93;       
    public manejaCaracteres(){
            
    }
    public char caracterRandom(int n){
            
        switch(n){
            case 1:
                if(contadorA>0){
                    contadorA--;
                    contadorGeneral--;
                    return 'A';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 2:
                if(contadorB>0){
                    contadorB--;
                    contadorGeneral--;
                    return 'B';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 3:
                if(contadorC>0){
                    contadorGeneral--;
                    contadorC--;
                    return 'C';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 4:
                if(contadorD>0){
                    contadorGeneral--;
                    contadorD--;
                    return 'D';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 5:
                if(contadorE>0){
                    contadorGeneral--;
                    contadorE--;
                    return 'E';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 6:
                if(contadorF>0){
                    contadorGeneral--;
                    contadorF--;
                    return 'F';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 7:
                if(contadorG>0){
                    contadorGeneral--;
                    contadorG--;
                    return 'G';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 8:
                if(contadorH>0){
                    contadorGeneral--;
                    contadorH--;
                    return 'H';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 9:
                if(contadorI>0){
                    contadorGeneral--;
                    contadorI--;
                    return 'I';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 10:
                if(contadorJ>0){
                    contadorGeneral--;
                    contadorJ--;
                    return 'J';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 11:
                if(contadorL>0){
                    contadorGeneral--;
                    contadorL--;
                    return 'L';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 12:
                if(contadorM>0){
                    contadorGeneral--;
                    contadorM--;
                    return 'M';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 13:
                if(contadorN>0){
                    contadorGeneral--;
                    contadorN--;
                    return 'N';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 14:
                if(contadorÑ>0){
                    contadorGeneral--;
                    contadorÑ--;
                    return 'Ñ';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 15: 
                if(contadorO>0){
                    contadorGeneral--;
                    contadorO--;
                    return 'O';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 16:
                if(contadorP>0){
                    contadorGeneral--;
                    contadorP--;
                    return 'P';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 17:
                if(contadorQ>0){
                    contadorGeneral--;
                    contadorQ--;
                    return 'Q';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 18:
                if(contadorR>0){
                    contadorGeneral--;
                    contadorR--;
                    return 'R';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 19:
                if(contadorS>0){
                    contadorGeneral--;
                    contadorS--;
                    return 'S';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 20:
                if(contadorT>0){
                    contadorGeneral--;
                    contadorT--;
                    return 'T';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 21:
                if(contadorU>0){
                    contadorGeneral--;
                    contadorU--;
                    return 'U';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 22:
                if(contadorV>0){
                    contadorGeneral--;
                    contadorV--;
                    return 'V';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 23:
                if(contadorY>0){
                    contadorGeneral--;
                    contadorY--;
                    return 'Y';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            case 24:
                if(contadorZ>0){
                    contadorGeneral--;
                    contadorZ--;
                    return 'Z';
                }else{
                    return caracterRandom((int)(Math.random()*24)+1);
                }
            default:
                return 'W';
        }
    }
    public int devolverValor(char a){
        switch(a){
            case 'A':
                return 1;
            case 'B':
                return 3;
            case 'C':
                return 3;
            case 'D':
                return 2;
            case 'E':
                return 1;
            case 'F':
                return 4;
            case 'G':
                return 2;
            case 'H':
                return 4;
            case 'I':
                return 1;
            case 'J':
                return 8;
            case 'L':
                return 1;
            case 'M':
                return 3;
            case 'N':
                return 1;
            case 'Ñ':
                return 8;
            case 'O':
                return 1;
            case 'P':
                return 3;
            case 'Q':
                return 5;
            case 'R':
                return 1;
            case 'S':
                return 1;
            case 'T':
                return 1;
            case 'U':
                return 1;
            case 'V':
                return 4;
            case 'Y':
                return 4;
            case 'Z':
                return 10;
            default:
                return 0;
        }
    }
}
