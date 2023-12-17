function array(string) {
    switch (string.split(",").length) {
        case 0: return null;
        case 1: return null;
        case 2: return null;
        default: {
            let result = "";
            string = string.split(",");
            console.log(string);
            for (let i = 1; i < string.length - 1; i++) {
                console.log(`Add:${string[i]}`)
                result += string[i] + " ";
            }
            return result.trim();
        }
    }
}