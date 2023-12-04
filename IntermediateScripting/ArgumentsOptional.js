// Create a function that sums two arguments together. If only one argument is provided, then return a function that expects one argument and returns the sum.

// For example, addTogether(2, 3) should return 5, and addTogether(2) should return a function.

// Calling this returned function with a single argument will then return the sum:

// var sumTwoAnd = addTogether(2);
// sumTwoAnd(3) returns 5.

// If either argument isn't a valid number, return undefined.

// Get Help
// Tests
// Passed:addTogether(2, 3) should return 5.
// Passed:addTogether(23.4, 30) should return 53.4.
// Passed:addTogether("2", 3) should return undefined.
// Passed:addTogether(5, undefined) should return undefined.
// Passed:addTogether("https://www.youtube.com/watch?v=dQw4w9WgXcQ") should return undefined.
// Passed:addTogether(5) should return a function.
// Passed:addTogether(5)(7) should return 12.
// Passed:addTogether(2)([3]) should return undefined.
// Passed:addTogether(2, "3") should return undefined.

function addTogether(a, b) {
    // Check if all arguments are valid numbers
    const areValidNumber = (...args) => args.every(arg => typeof arg === 'number');

    // If two arguments are provided, return their sum
    if (arguments.length === 2 && areValidNumber(arguments[0], arguments[1])) {
        return arguments[0] + arguments[1];
    }

    // If one argument is provided, return a function to accept the second argument
    if (arguments.length === 1 && areValidNumber(arguments[0])) {
        const firstArg = arguments[0];
        return function (secondArg) {
            return areValidNumber(firstArg, secondArg) ? firstArg + secondArg : undefined;
        }
    }
    return undefined;
}

addTogether(2, 3);