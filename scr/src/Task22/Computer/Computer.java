package Task22.Computer;

public class Computer {

    private OS os;
    private CPU cpu;
    private RAM ram;

    public Computer(OS os, CPU cpu, RAM ram) {
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getOs() {
        return os.getInfo();
    }

    public String getCpu() {
        return cpu.getInfo();
    }

    public String getRam() {
        return ram.getInfo();
    }

    private class OS implements Equipment {
        String version;

        public OS(String version) {
            this.version = version;
        }

        @Override
        public void increaseCapacity(String newCapacity) {
            version = newCapacity;
        }

        @Override
        public String getInfo() {
            return version;
        }
    }

    private class CPU implements Equipment{
        String version;

        public CPU(String version) {
            this.version = version;
        }

        @Override
        public void increaseCapacity(String newCapacity) {
            version = newCapacity;
        }

        @Override
        public String getInfo() {
            return version;
        }
    }

    private class RAM implements Equipment{
        String version;

        public RAM(String version) {
            this.version = version;
        }

        @Override
        public void increaseCapacity(String newCapacity) {
            version = newCapacity;
        }

        @Override
        public String getInfo() {
            return version;
        }
    }
}
