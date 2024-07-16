package animal;

public class Animal {
    // フィールドの設定
    private String name;
    private int age;

    // 引数なしのコンストラクタ
    public Animal() {

    }

    // 名前と年齢の引数を設定したコンストラクタの設定
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // sayというメソッドを定義する
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

}
