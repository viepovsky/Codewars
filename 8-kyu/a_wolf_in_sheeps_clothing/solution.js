function warnTheSheep(queue) {
    let length = queue.length;
    for (let i = 0; i < length; i++) {
        if (queue[i] === "wolf") {
            return length > i + 1 ? `Oi! Sheep number ${length - (i + 1)}! You are about to be eaten by a wolf!`: "Pls go away and stop eating my sheep";
        }
    }
}