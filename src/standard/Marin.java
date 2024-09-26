package standard;

public class Marin {

    //상태
    //체력
    int hp;    //공격력
    int dmg;

    //행위

    public Marin(int hp, int dmg) {
        System.out.println("마린 생성자 생성");
        this.hp = hp;
        this.dmg = dmg;
    }

    //공격한다
    public int attack() {
        return dmg;
    }
    //공격받다
    public void attackeByZergling(Zergling zergling) {
        this.hp = this.hp - (zergling.dmg*2);
    }
    public void attackeByZealot(Zealot zealot) {
        this.hp = this.hp - (zealot.dmg/2);
    }

    public void status() {
        System.out.println("마린 현재체력 :" + hp);
    }
//    public void test(int hp) {
//        //this 사용 예시
//        this.hp = this.hp - dmg;
//    }


}
