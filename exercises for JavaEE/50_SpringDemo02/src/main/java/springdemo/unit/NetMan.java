package springdemo.unit;

public class NetMan {
    String mName;
    Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }


    public void readNews() {
//        Mobile mobile = new Mobile;
//        mobile.setBrand("iphone6");
        System.out.println(mName + " is " + mobile.read());

    }
}
