// Return an English translated sentence of the passed binary string.

// The binary string will be space separated.

// Get Help
// Tests
// Passed:binaryAgent("01000001 01110010 01100101 01101110 00100111 01110100 00100000 01100010 01101111 01101110 01100110 01101001 01110010 01100101 01110011 00100000 01100110 01110101 01101110 00100001 00111111") should return the string Aren't bonfires fun!?
// Passed:binaryAgent("01001001 00100000 01101100 01101111 01110110 01100101 00100000 01000110 01110010 01100101 01100101 01000011 01101111 01100100 01100101 01000011 01100001 01101101 01110000 00100001") should return the string I love FreeCodeCamp!

function binaryAgent(str) {
    // Split the binary string into an array of binary values
    const binaryArray = str.split(' ');

    // Convert each binary value to its ASCII equivalent
    const asciiArray = binaryArray.map(binary => String.fromCharCode(parseInt(binary, 2)));

    // Join the ASCII values to form the final sentence
    const result = asciiArray.join('');

    return result;
}

// parseInt(binary, 2): This part converts the binary string to its decimal equivalent. 

// Example usage:
console.log(binaryAgent("01000001 01110010 01100101 01101110 00100111 01110100 00100000 01100010 01101111 01101110 01100110 01101001 01110010 01100101 01110011 00100000 01100110 01110101 01101110 00100001 00111111"));