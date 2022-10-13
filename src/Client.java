public class Client extends Person {
    private boolean wantsDesert;
    private boolean willTip;

    public Client(String name) {
        super(name);
    }

    public void setWantsDesert(boolean wantsDesert) {
        this.wantsDesert = wantsDesert;
    }

    public void setWillTip(boolean willTip) {
        this.willTip = willTip;
    }

    public boolean isWantsDesert() {
        return wantsDesert;
    }

    public boolean isWillTip() {
        return willTip;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
