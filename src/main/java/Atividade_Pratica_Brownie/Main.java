package Atividade_Pratica_Brownie;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        List<Brownie_Abstrata> listaBrownie = new ArrayList<Brownie_Abstrata>();

        ArrayList<String> Complementos_Brownie = new ArrayList<>();


        String Complemento, Complemento1, Complemento2, Complemento3, Complemento4, Complemento5;
        Scanner Define_Complemento = new Scanner(System.in);

        System.out.println("Digite o complemento desejado no Brownie de Chocolate, Ex Confete, granulado, chantilly, etc");
        Complemento = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento);
        Brownie_Abstrata brownie_chocolate = new Brownie_Chocolate(Complementos_Brownie.get(0), new Random().nextDouble()*100);

        System.out.println("Digite o complemento desejado no Segundo Brownie de Chocolate");
        Complemento1 = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento1);
        Brownie_Abstrata brownie_chocolate2 = new Brownie_Chocolate(Complementos_Brownie.get(1), new Random().nextDouble()*100);


        System.out.println("Digite o complemento desejado no Brownie de doce de leite");
        Complemento2 = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento2);
        Brownie_Abstrata brownie_doceDeLeite = new Brownie_DoceDeLeite(Complementos_Brownie.get(2),new Random().nextDouble()*100);


        System.out.println("Digite o complemento desejado no Segundo Brownie de doce de leite");
        Complemento3 = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento3);
        Brownie_Abstrata brownie_doceDeLeite2 = new Brownie_DoceDeLeite(Complementos_Brownie.get(3),new Random().nextDouble()*100);


        System.out.println("Digite o complemento desejado no Brownie de Morango");
        Complemento4 = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento4);
        Brownie_Abstrata brownie_Morango = new Brownie_Morango(Complementos_Brownie.get(4),new Random().nextDouble()*100);


        System.out.println("Digite o complemento desejado no Segundo Brownie de Morango");
        Complemento5 = Define_Complemento.nextLine();
        Complementos_Brownie.add(Complemento5);
        Brownie_Abstrata brownie_Morango2 = new Brownie_Morango(Complementos_Brownie.get(5),new Random().nextDouble()*100);



        listaBrownie.add(brownie_chocolate);
        listaBrownie.add(brownie_chocolate2);
        listaBrownie.add(brownie_doceDeLeite);
        listaBrownie.add(brownie_doceDeLeite2);
        listaBrownie.add(brownie_Morango);
        listaBrownie.add(brownie_Morango2);


        
        for (Brownie_Abstrata brownie : listaBrownie) {
            System.out.println(brownie.getPreco());
        }

        Collections.sort(listaBrownie, Collections.reverseOrder());

        System.out.println("");

        for (Brownie_Abstrata brownie : listaBrownie) {
            System.out.println(brownie.getPreco());
        }

    }


}
