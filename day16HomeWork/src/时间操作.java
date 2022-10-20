/**
 * @date 2022/9/2 - 17:44
 */
public class 时间操作 {
    public static void main(String[] args) {
        MyTime m = new MyTime(0, 0, 0);
        m.display();
        m.addSecond(6);
        m.display();
//        m.addMinute(1439);
//        m.display();
//        m.subHour(25);
//        m.display();
//        m.subMinute(61);
//        m.display();
        m.setHour(1);
        m.display();
        m.subMinute(60);
//        m.display();
        m.subSecond(1);
        m.display();
    }
}

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public void addHour(int hou) {
        this.setHour(this.getHour() + hou);
        if (this.getHour() >= 24) {
            this.hour = this.getHour() % 24;
        }

    }

    public void subHour(int hou) {
        this.setHour(this.getHour() - hou);
        this.hour = this.hour + 24;
    }

    public void addMinute(int min) {
        this.setMinute(this.getMinute() + min);
        if (this.getMinute() >= 60) {
            this.hour = this.getMinute() / 60 + this.getHour();
            this.minute = this.getMinute() % 60;
            if (this.getHour() >= 24) {
                this.setHour(this.getHour() % 24);
            }
        }

    }

    public void subMinute(int min) {
        if (min >= 60) {
            this.setMinute(this.getMinute() - min + 60);
            this.setHour(this.getHour() - min / 60);
            if (this.getHour() < 0) {
                this.setHour(this.getHour() + 24);
            }
        }
    }

    public void addSecond(int sec) {
        this.setSecond(this.getSecond() + sec);

        if (this.getSecond() >= 60) {
            this.minute = this.getSecond() / 60 + this.getMinute();
            this.second = this.getSecond() % 60;
        }
    }

    public void subSecond(int sec) {
        if (sec >= 60) {
            this.setSecond((this.getSecond() - sec) % 60 + 60);
            this.setMinute(this.getMinute() - sec / 60);
            if (this.getMinute() < 0) {
                this.setHour(this.getHour() + (this.getMinute() / 60) / 24);
                this.setMinute(this.getMinute() % 60 + 60);
            }
        } else {
            this.setSecond(this.getSecond() - sec);
            if (this.getSecond() < 0) {
                this.setSecond(this.getSecond() + 60);
                this.setMinute(this.getMinute() - 1);
                if (this.getMinute() < 0) {
                    this.setHour(this.getHour() - 1);
                }

                this.setMinute((this.getMinute()) + 60);
                if (this.getHour() < 0) {
                    this.setHour(this.getHour() + 24);
                }
            }

        }

    }

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if (second >= 60) {
            this.second = second % 60;
            this.minute = minute + (second / 60);
            if (this.minute >= 60) {

                this.hour = hour + (minute / 60);
                this.minute = this.minute % 60;
                if (this.hour >= 24) {
                    this.hour = this.hour % 24;
                }
            }
        } else {
            this.second = second;
            if (minute >= 60) {
                this.hour = hour + (minute / 60);
                this.minute = minute % 60;
                if (this.hour >= 24) {
                    this.hour = this.hour % 24;
                }
            } else {
                this.minute = minute;
                if (this.hour >= 24) {
                    this.hour = this.hour % 24;
                }

            }

        }


//        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void display() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
}
