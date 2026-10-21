//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final long LIGHT = 299_792_458; //m/s (미터/초)
    final float YEAR = 365.2422f;    // 1년

    float hour = YEAR * 24;
    float minute = hour * 60;
    float second = minute * 60;
    long light =(long) (second * LIGHT);

    System.out.printf("빛은 초당 %,d Km를 이동 합니다. \n", LIGHT / 1000);
    System.out.printf("빛이1년 간 거리는 %,d Km 입니다.\n", light, 1000);

}
