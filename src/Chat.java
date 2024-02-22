public abstract class Chat {
    private final String name;
    private final int id;
    private final boolean status;

    public Chat(String name, int id, boolean status) {
        this.name = String.valueOf(name);
        this.id = id;
        this.status = status;
    }
    abstract void sendingSms(String message);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return status;
    }
}
