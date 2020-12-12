package com.bsbo_07_19turchenkov.task1;

public class cats {
    public String name;

    public void show() {
        this.name = name;
        System.out.println("name: " + name);
    }

    public static class Tigers extends cats {
        public Tigers(String name) {
            this.name = name;
        }
    }

    public static class Gepards extends cats {
        public Gepards(String name) {
            this.name = name;
        }
    }

    public static class Lions extends cats {
        public Lions(String name) {
            this.name = name;
        }
    }
}