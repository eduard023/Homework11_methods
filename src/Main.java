public class Main {
    public static void main(String[] args) {
        checkLeapYears(2022);
        getDeviceLink(0, 2016);
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println("Потребуеться дней - " + deliveryDays);

    }
    public static void checkLeapYears(int years){
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0){
            System.out.println(years+"високосный год.");
        } else {
            System.out.println(years+ " не високосный год.");
        }
    }

    public static void getDeviceLink(int osType, int manufacturingYear){
        if (osType != 1 && osType != 0){
            throw new IllegalArgumentException("Wrong OS type");
        }
        String osString = osType == 0 ? "IOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "полную" : "облегченную";
        System.out.printf("Установите %s версию %s по ссылке%n", versionString, osString);

    }
    public static int calculateDeliveryDays(int deliveryDistance){
        if (deliveryDistance <= 20) {
            return 1;
        }else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}