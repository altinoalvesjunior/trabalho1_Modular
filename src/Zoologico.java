public class Zoologico {
    public static void main(String[] args){
        // n gaiolas, estabulos e aquarios podem ser criados e os animais podem ser adicionados com a funcao adicionaCavalo, Pombo, Papagaio e Peixes.
        Gaiola gaiola1 = new Gaiola(); 
        Estabulo estabulo1 = new Estabulo();
        Aquario aquario1 = new Aquario();
        /********************************************************* */
        //Para fins de testes, vamos instanciar 1 objeto para cada animal para verificar algumas das funcionalidades
        
        Pombo pombo1 = new Pombo();
        Papagaio papagaio1 = new Papagaio();
        Cavalo cavalo1 = new Cavalo();
        Gato gato1 = new Gato();
        Cachorro cachorro1 = new Cachorro();
        Tartaruga tartaruga1 = new Tartaruga();
        Cobra cobra1 = new Cobra();
        PeixePalhaco peixePalhaco1 = new PeixePalhaco();
        
        //Apenas para organizar a main, resolvi colocar o print em outro método
        printInstancias(pombo1, penasPombo1, papagaio1, cavalo1, gato1, cachorro1, tartaruga1, cobra1, peixePalhaco1);
    }
    public static void printInstancias(Pombo pombo1, Papagaio papagaio1, Cavalo cavalo1, Gato gato1, Cachorro cachorro1, Tartaruga tartaruga1, Cobra cobra1, PeixePalhaco peixePalhaco1){
        System.out.println("Nome:" + pombo1.getNome() + "\nGenero: " + pombo1.getGenero() + "\nSom: " + pombo1.emitirSom() + "\nTipo de vôo: " + pombo1.voar() + "\nBotar ovos: " + pombo1.botarOvos() +"\n\n");
        System.out.println("Nome:" + papagaio1.getNome() + "\nGenero: " + papagaio1.getGenero() + "\nSom: " + papagaio1.emitirSom() + "\nTipo de vôo: " + papagaio1.voar() + "\nBotar ovos: " + papagaio1.botarOvos()+ "\n\n");
        System.out.println("Nome:" + cavalo1.getNome() + "\nGenero: " + cavalo1.getGenero() + "\nSom: " + cavalo1.emitirSom()+ "\n\n");
        System.out.println("Nome:" + gato1.getNome() + "\nGenero: " + gato1.getGenero() + "\nSom: " + gato1.emitirSom()+ "\n\n");
        System.out.println("Nome:" + cachorro1.getNome() + "\nGenero: " + cachorro1.getGenero() + "\nSom: " + cachorro1.emitirSom()+ "\n\n");
        System.out.println("Nome:" + tartaruga1.getNome() + "\nGenero: " + tartaruga1.getGenero() + "\nSom: " + tartaruga1.emitirSom() + "\nÉ ectotermico: " + tartaruga1.ectotermia()+ "\n\n");
        System.out.println("Nome:" + cobra1.getNome() + "\nGenero: " + cobra1.getGenero() + "\nSom: " + cobra1.emitirSom() + "\nÉ ectotermico: " + cobra1.ectotermia()+ "\n\n");
        System.out.println("Nome:" + peixePalhaco1.getNome() + "\nGenero: " + peixePalhaco1.getGenero() + "\nSom: " + peixePalhaco1.emitirSom()+ "\nRespira dentro d'água: " + peixePalhaco1.respDentroDagua()+ "\n\n");
        
    }
}
abstract class Animal{
    String nome;
    String genero;

    Animal(String nome, String genero){
        setNome(nome);
        setGenero(genero);
    }
    Animal(){
        setNome("Shulambs");
        setGenero("Masculino");
    }
    
    public abstract String emitirSom();

    //SETTERS & GETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
}
/**************************************** */
abstract class Ave extends Animal{
    public abstract String voar(); //already public, already abstract. 
    public abstract int botarOvos();
    Ave(String nome, String genero){
        super(nome, genero);
    }
    Ave(){
        super();
    }
}

abstract class Mamifero extends Animal{
    public abstract void amamentar(); //already public, already abstract. 
    Mamifero(String nome, String genero){
        super(nome, genero);
    }
    Mamifero(){
        super();
    }
}

abstract class Reptil extends Animal{
    public abstract boolean ectotermia(); //already public, already abstract.
    Reptil(String nome, String genero){
        super(nome, genero);
    }
    Reptil(){
        super();
    }
}

abstract class Peixe extends Animal{
    public abstract boolean respDentroDagua(); //already public, already abstract.
    Peixe(String nome, String genero){
        super(nome, genero);
    }
    Peixe(){
        super();
    }
}
/**************************************** */
interface AnimalDomesticado{
    void alimentar();
    void levarVeterinario();
    void chamarVeterinario();
}
interface AnimalEstimacao{
    void brincar();
    void levarPassear();
}
/**************************************** */
class Pombo extends Ave{
    Pombo(String nome, String genero){
        super(nome, genero);
    }
    Pombo(){
        super("Pombo Shulambs", "Masculino");
    }
    public String emitirSom(){
        return "Pruu";
    }
    public String voar(){
        return "baixo";
    }
    public int botarOvos(){
        return 3;
    }

}    
/***************************************** */
class Papagaio extends Ave{
    Papagaio(String nome, String genero){
        super(nome, genero);
    }
    Papagaio(){
        super("Pagapaio Shulambs", "Feminino");
    }
    public String emitirSom(){
        return "Repete tudo o que o humano diz.";
    }
    public String voar(){
        return "alto";
    }
    public int botarOvos(){
        return 4;
    }
}
/***************************************** */
class Cavalo extends Mamifero implements AnimalDomesticado{
    Cavalo(String nome, String genero){
        super(nome, genero);
    }
    Cavalo(){
        super("Cavalo Shulambs", "Masculino");
    }
    public String emitirSom(){
        return "Relincha";
    }
    public void amamentar(){
        //amamente o cavalo
    }
    public void alimentar(){
        //alimenta o cavalo
    }
    public void levarVeterinario(){
        //levar ao veterinario
    }
    public void chamarVeterinario(){
        //chama o veterinario
    }
}
/******************************************* */
class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    Gato(String nome, String genero){
        super(nome, genero);
    }
    Gato(){
        super("Gato Shulambs", "Masculino");
    }
    public String emitirSom(){
        return "Miau";
    }
    public void amamentar(){
        //amamente o gato
    }
    public void alimentar(){
        //alimenta o gato
    }
    public void levarVeterinario(){
        //levar ao veterinario
    }
    public void chamarVeterinario(){
        //chama o veterinario
    }
    public void brincar(){
        //brincar
    }
    public void levarPassear(){
        //levar para passear
    }
}
/************************************************ */
class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    Cachorro(String nome, String genero){
        super(nome, genero);
    }
    Cachorro(){
        super("Cachorro Shulambs", "Feminino");
    }
    public String emitirSom(){
        return "Auau";
    }
    public void amamentar(){
        //amamente o gato
    }
    public void alimentar(){
        //alimenta o gato
    }
    public void levarVeterinario(){
        //levar ao veterinario
    }
    public void chamarVeterinario(){
        //chama o veterinario
    }
    public void brincar(){
        //brincar
    }
    public void levarPassear(){
        //levar para passear
    }
}
/********************************************* */
class Tartaruga extends Reptil{ // Aqui consideramos uma tartaruga selvagem. Nao-domestica.
    Tartaruga(String nome, String genero){
        super(nome, genero);
    }
    Tartaruga(){
        super("Turtle Shulambs", "Masculino");
    }
    public String emitirSom(){
        return "Silêncio";
    }
    public boolean ectotermia(){
        return true;
    }
    public void andaLento(){
        //alguma contabilização de passos. I don't know. Be creative
    }
}
/********************************************** */
class Cobra extends Reptil{ 
    Cobra(String nome, String genero){
        super(nome, genero);
    }
    Cobra(){
        super("Cobra Shulambs", "Masculino");
    }
    public String emitirSom(){
        return "s...ss...sss....ssss";
    }
    public boolean ectotermia(){
        return true;
    }
    public void trocarpele(){
        //alguma acao de troca de pele.
    }
    public void rastejar(){
        //alguma acao de rastejamento
    }
}
/************************************************* */
class PeixePalhaco extends Peixe{
    PeixePalhaco(String nome, String genero){
        super(nome, genero);
    }
    PeixePalhaco(){
        super("Peixe Shulambs", "Feminino");
    }
    public String emitirSom(){
        return "bubble, bubble";
    }
    public boolean respDentroDagua(){
        return true;
    }
}   
/**************************************** */
class Penas{
    float comprimento;
    String cor;

    void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    float getComprimento(){
        return this.comprimento;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }
    boolean impermeabiliza(){
        return true;
    }
}
class Pelos{
    float comprimento;
    String cor;

    public void escovar(){
        //acao para escovar pelo
    }
    public void tosar(){
        //acao para tosar o pelo
    }
    public void darBanho(){
        //acao para dar banho
    }

    void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    float getComprimento(){
        return this.comprimento;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }
}
class Aquario{
    int capacidade;
    String modelo;

    void purificarAgua(){
        //alguma acao purificadora
    }
    void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    int getCapacidade(){
        return this.capacidade;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return this.modelo;
    }
}
class Estabulo{
    Cavalo[] cavaloX = new Cavalo[10]; // limite de cavalos no estabulo
    final int capacidade = 10;
    int countCavalo = 0;
    float tamanho;
    
    void adicionarCavalo(Cavalo cavaloExistente) throws Exception{
        try{    
            if(countCavalo < capacidade){
                countCavalo++;
                cavaloX[0] = cavaloExistente;
            }
        }catch(Exception e){
            throw new Exception("Erro");
        }    
    }
    void retirarCavalo() throws Exception{
        if(countCavalo > 0){
            countCavalo--;
        }else{
            throw new Exception("Erro");
        }    
    }

    void limpar(){
        //alguma acao de limpeza
    }

    int getCapacidade(){
        return this.capacidade;
    }
    void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    float getTamanho(){
        return this.tamanho;
    }
}
class Gaiola{
    Pombo[] pomboX = new Pombo[10]; // capacidade maxima de pombos na gaiola
    Papagaio[] papagaioX = new Papagaio[10]; // capacidade maxima de papagaios na gaiola
    final int capacidade = 10;
    int countAve = 0;
    String modelo;
    String cor;

    //@Override
    void adicionarAve(Pombo pomboExistente) throws Exception{
        if(countAve < capacidade){
            countAve++;
            pomboX[countAve] = pomboExistente;
        }else{
            throw new Exception("Erro");
        }
    }
    //@Override
    void retirarAve() throws Exception{
        if(countAve > 0){
            countAve--;
        }else{
            throw new Exception("Erro");
        }
    }
    //@Override
    void adicionarAve(Papagaio papagaioExistente) throws Exception{
        if(countAve < 10){
            countAve++;
            papagaioX[countAve] = papagaioExistente;
        }else{
            throw new Exception("Erro");
        }
    }
    Gaiola(){
        
    }
}

