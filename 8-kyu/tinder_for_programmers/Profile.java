package tinder_for_programmers;

class Profile {
    private final String name;
    private final int age;
    private final String bio;

    public Profile(String name, int age, String bio) {
        this.name = name;
        this.age = age;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBio() {
        return bio;
    }
}
