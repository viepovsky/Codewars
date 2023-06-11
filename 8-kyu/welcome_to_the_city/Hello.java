package welcome_to_the_city;

class Hello {
    String sayHello(String[] name, String city, String state){
        StringBuilder result = new StringBuilder("Hello, ");
        for (int i = 0; i < name.length; i++) {
            if (i + 1 != name.length) {
                result.append(name[i]).append(" ");
            } else {
                result.append(name[i]);
            }
        }
        return result.append("! Welcome to ").append(city).append(", ").append(state).append("!").toString();
    }
}
