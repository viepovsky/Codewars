function addLength(str) {
    return str.split(" ").map(n => n.concat(" ", n.length));
}
