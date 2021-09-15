
package reinoanimal;

public class ReinoAnimal {

    public static void main(String[] args) {
        
        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves a = new Aves();
        
        m.setCorpele("Castanho");
        m.setPeso(101.25f);
        m.setIdade(15);
        m.setMembros(4);
        
        System.out.println("===== MAMÍFERO =====\n" + m.toString() + m.getCorpele());
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        r.setCorescama("Verde");
        r.setPeso(20f);
        r.setIdade(50);
        r.setMembros(4);
        
        System.out.println("===== RÉPTIL =====\n" + r.toString() + r.getCorescama());
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
        p.setCorescama("Azul");
        p.setPeso(5f);
        p.setIdade(2);
        p.setMembros(3);
        
        System.out.println("===== PEIXE =====\n" + p.toString() + p.getCorescama());
        p.soltarBolha();
        p.locomover();
        p.alimentar();
        p.emitirSom();
        
        a.setCorpena("Branca");
        a.setPeso(1.5f);
        a.setIdade(4);
        a.setMembros(5);
        
        System.out.println("===== AVES =====\n" + a.toString() + a.getCorpena());
        a.locomover();
        a.alimentar();
        a.fazerNinho();
        a.emitirSom();*/
        
        Canguru cang = new Canguru();
        Cachorro cach = new Cachorro();
        Cobra cob = new Cobra();
        Tartaruga tart = new Tartaruga();
        Goldfish gold = new Goldfish();
        Arara ar = new Arara();
        
        
        cach.reagir("Olá");
        cach.reagir("Toma comida");
        cach.reagir("Vai apanhar");
        cach.reagir(true);
        cach.reagir(false);
        cach.reagir(12);
        cach.reagir(19);
        cach.reagir(10);
        cach.reagir(4, 9f);
        cach.reagir(5, 11f);
        cach.reagir(5, 8f);
    }
    
}
