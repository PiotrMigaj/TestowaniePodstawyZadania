package pl.migibud.zadaniapodstawyDay3.ex12;

public class Computer {

    private Processor processor;
    private Memory memory;
    private ExternalPort externalPort;

    public Computer() {
    }

    public Computer(Processor processor, Memory memory, ExternalPort externalPort) {
        this.processor = processor;
        this.memory = memory;
        this.externalPort = externalPort;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", externalPort=" + externalPort +
                '}';
    }

    static class Processor {

        private int cores;
        private String producer;

        public Processor(int cores, String producer) {
            this.cores = cores;
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "cores=" + cores +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }

    static class Memory {

        private int memory;
        private String producer;
        private String type;

        public Memory(int memory, String producer, String type) {
            this.memory = memory;
            this.producer = producer;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "memory=" + memory +
                    ", producer='" + producer + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    static class ExternalPort {

        private String type;

        public ExternalPort(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "ExternalPort{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }

}
