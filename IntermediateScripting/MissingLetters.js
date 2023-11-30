// Find the missing letter in the passed letter range and return it.

// If all letters are present in the range, return undefined.

// Tests
// Waiting:fearNotLetter("abce") should return the string d.
// Waiting:fearNotLetter("abcdefghjklmno") should return the string i.
// Waiting:fearNotLetter("stvwx") should return the string u.
// Waiting:fearNotLetter("bcdf") should return the string e.
// Waiting:fearNotLetter("abcdefghijklmnopqrstuvwxyz") should return undefined.




function fearNotLetter(str) {
    for (let i = 0; i < str.length - 1; i++) {
        if (str.charCodeAt(i + 1) - str.charCodeAt(i) != 1) {
            // console.log(String.fromCharCode(str.charCodeAt(i)+1));
            return String.fromCharCode(str.charCodeAt(i) + 1);
        }
    }
    return undefined;
}

fearNotLetter("abce");