package animal;

public class Human extends Animal implements Thinkable {

    //フィールド
    private String hobby; //趣味
    
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public void think() {
        
        System.out.println("私は" + this.hobby + "について考えています。");

    }

  //コンストラクタ
    public Human() {
        
    }

    //引数ありのコントラクタ
    public Human(String hobby) {
        this.hobby = hobby;

    }



}
