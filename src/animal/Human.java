package animal;

public class Human extends Animal implements Thinkable {
    // 趣味の情報を保管するフィールドを定義
    private String hobby;

    // 引数なしのコンストラクタ
    public Human() {
    }

    // コンストラクタを設定する
    public Human(String name, int age, String hobby) {
        // スーパークラス（Animal）のコンストラクタを呼び出し
        super(name, age);
        this.hobby = hobby;
    }

    // thinkメソッドの呼び出し
    @Override
    public void think() {
        // 文字の表示
        System.out.println("私は" + this.hobby + "について考えています。");
    }
}
