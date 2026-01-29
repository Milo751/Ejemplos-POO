package StaticWrapper;

public final class House {
    final int doors;
    final int rooms;
    final double size;

    public House(int doors, int rooms, double size) {
        this.doors = doors;
        this.rooms = rooms;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public double getSize() {
        return size;
    }
}
