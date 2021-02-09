package Day0209;
//게임: Unit()

//Unit: 공통기능(이동좌표, 이동, 멈춘다) : 추상화, 일반화
//Unit: 이동 방법은 다르다 (이동 방법은 Unit 마다 별도의 구현)
//추상 클래스

abstract class Unit {
    int x, y;

    void stop() {
        System.out.println("Unit stop");
    }

    abstract void move(int x, int y);// 추상 자원 // 강제 구현
}

//Tank
class Tank extends Unit {

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동: " + this.x + " , " + this.y);
    }

    // Tank 구체화 , 특수화
    void chaneMode() {
        System.out.println("시즈 모드");
    }
}

class Marine extends Unit {

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동: " + this.x + " , " + this.y);
    }

    // 특수화, 구체화
    void stimpack() {
        System.out.println("스팀팩 사용");
    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("DropShip 이동: " + this.x + " , " + this.y);

    }
    //특수화, 구체화
    void load() {
        System.out.println("Unit Load..");
    }
    void unload() {
        System.out.println("Unit Unload..");
    }

}

public class Ex02_abstract_class {

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.chaneMode();
        
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        
        DropShip ds = new DropShip();
        //1. 탱크 3대를 만들고 [같은 좌표] 이동 시키세요 (555,444)
        Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
        for(Tank tank: tanklist) {
            tank.move(555, 444);
        }
        Unit[] unitList = {new Tank(), new Marine(), new DropShip()};
        for(Unit unit : unitList) {
            unit.move(666, 444);
        }
        
        //2. 탱크 1, 마린 1, 드랍쉽 1 같은 좌표로 이동(666,444)
        
        
    }

}
