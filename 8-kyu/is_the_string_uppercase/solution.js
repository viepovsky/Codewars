String.prototype.isUpperCase = function() {
    for (let i = 0; i < this.length; i++) {
        let character = this.charAt(i);
        if (character !== character.toUpperCase()) {
            return false
        }
    }
    return true;
}