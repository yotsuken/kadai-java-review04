package animal;

public class Review04 {

    public static void main(String[] args) {
        
        Animal tanaka = new Animal("田中太郎",25);
        
        Human tanaka1 = new Human("電車");
                
        tanaka.say();
        tanaka1.think();
    
        Animal suzuki = new Animal("鈴木次郎",30);
        
        Human suzuki1 = new Human("野球");
                
        suzuki.say();
        suzuki1.think();
        
        
        Animal satou = new Animal("佐藤花子",20);
        
        Human satou1 = new Human("映画");
                
        satou.say();
        satou1.think();
        
            
        
    }
    
    
    
    
}
