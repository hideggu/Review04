package animal;

public class Review04 {

    public static void main(String[] args) {
        // インスタンスを3つ作成する
        Human tanaka = new Human("田中　太朗", 25, "電車");
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        Human sato = new Human("佐藤　花子", 20, "映画");

        // AnimalとHumanで定義したメソッドをそれぞれ実行する
        tanaka.say();
        tanaka.think();

        suzuki.say();
        suzuki.think();

        sato.say();
        sato.think();

    }


}