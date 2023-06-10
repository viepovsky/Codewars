package tinder_for_programmers;

class Profile {
    private final String name;
    private final int age;
    private final String bio;

    Profile(String name, int age, String bio) {
        this.name = name;
        this.age = age;
        this.bio = bio;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getBio() {
        return bio;
    }
}
