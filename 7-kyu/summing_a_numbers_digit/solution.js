const sumDigits = number => Array.from(Math.abs(number).toString()).map(Number).reduce((a, b) => a + b);
