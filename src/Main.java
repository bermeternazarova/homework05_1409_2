public class Main {
    public static void createHeroes () {                                               // �����
        Hero superman = new Hero(450, 432, "laser");
        System.out.println("��������: �������� " + superman.getHealth() + " ����: " + superman.getDamage()
                + " �����������: " + superman.getSuperPower());
        Hero spiderman = new Hero(150, 156);
        System.out.println("������� ����: �������� " + spiderman.getHealth() + " ����: " + spiderman.getDamage());
        Hero halk = new Hero(300, 270, "regeneration");
        System.out.println("����: �������� " + halk.getHealth() + " ����: " + halk.getDamage()
                + " �����������: " + halk.getSuperPower());


        /* int[] array1 ={superman.getHealth(), spiderman.getHealth(), halk.getHealth()};
        for (int i = 0; i < array1.length ; i++) {
            System.out.println( " ��������: " + array1[i] + ";");
        }
         int[] array2 = {superman.getDamage(), spiderman.getDamage(), halk.getDamage()};
        for (int i = 0;i < array2.length; i++) {
            System.out.println(" ����: "+ array2[i] + ";");
        }
         String[] array3 = {superman.getSuperPower(), halk.getSuperPower()};
        for (int i = 0; i < array3.length ; i++) {
            System.out.println("C���������������: " + array3[i] + ";");
        }*/
        Hero[] array=  new Hero[3];
        array [0] = superman;
        array[1]= spiderman;
        array [2]= halk;
    }
    public static void main(String[] args) {
        createHeroes();
        Hero[] array = new Hero[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        Hero hero = new Hero(100, 55, "telekinesis");
            System.out.println("�������� : " + hero.getHealth() + "; " +
                    "���� :" + hero.getDamage() + "; " + " ���������������� :" + hero.getSuperPower());


            System.out.println(" ������ � ����� ");
            Boss boss = new Boss(222, 111, "fire");
            boss.setBossHealth(222);
            boss.setBossDamage(111);
            boss.setDefenceType("fire");

            System.out.println("��������: " + boss.getBossHealth() + "; " + "����: " + boss.getBossDamage() + "; " +
                    "��� ������: " + boss.getDefenceType());

}}










