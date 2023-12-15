function calculateAge(yob, ytc) {
    let subtract = ytc - yob;
    switch (subtract) {
        case -1:
            return "You will be born in 1 year.";
        case 0:
            return "You were born this very year!";
        case 1:
            return "You are 1 year old."
        default:
            if (subtract > 1) {
                return `You are ${subtract} years old.`;
            } else {
                return `You will be born in ${yob - ytc} years.`;
            }
    }
}