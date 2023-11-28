function sortByLength (array) {
    let newArray = [];
    for (let i = 0; i < array.length; i++) {
        newArray[i] = array[i];
        for (let j = i + 1; j < array.length; j++) {
            if (newArray[i].length > array[j].length) {
                let tempValue = newArray[i];
                newArray[i] = array[j];
                array[j] = tempValue;
            }
        }
    }
    return newArray;
}