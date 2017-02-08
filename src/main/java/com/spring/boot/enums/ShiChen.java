package com.spring.boot.enums;

/**
 * Created by ayu on 2017/2/8.
 * 时辰.
 */
public enum ShiChen {

    zi("23:00-00:59","子时"),chou("01:00-02:59","丑时"),yin("03:00-04:59","寅时"),mao("05:00-06:59","卯时"),
    chen("07:00-08:59","辰时"),si("09:00-10:59","己时"),wu("11:00-12:59","午时"),wei("13:00-14:59","未时"),
    shen("15:00-16:59","申时"),you("17:00-18:59","酉时"),xu("19:00-20:59","戊时"),hai("21:00-22:59","亥时");

    private String time;
    private String shichen;

    ShiChen(String time, String shichen) {
        this.time = time;
        this.shichen = shichen;
    }

    public String getTime() {
        return time;
    }

    public String getShichen() {
        return shichen;
    }

    @Override
    public String toString() {
        return this.getShichen();
    }
}