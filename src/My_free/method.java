package My_free;


    class Car {
        private int currentSpeed;
        private int accelerationTime;

        public void accelerate(int speed, int second) {
            System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
        }
    }
    public class method {
    public static void main(String[] args) {
        //접근제어자 반환타입 메소드이름(매개변수목록) { // 선언부
        // 구현부
                Car myCar = new Car();		// 객체 생성
                myCar.accelerate(60, 3);	// 메소드 호출


            }

        }


