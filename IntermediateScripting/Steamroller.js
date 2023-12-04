// Flatten a nested array. You must account for varying levels of nesting.

// Get Help
// Tests
// Waiting:steamrollArray([[["a"]], [["b"]]]) should return ["a", "b"].
// Waiting:steamrollArray([1, [2], [3, [[4]]]]) should return [1, 2, 3, 4].
// Waiting:steamrollArray([1, [], [3, [[4]]]]) should return [1, 3, 4].
// Waiting:steamrollArray([1, {}, [3, [[4]]]]) should return [1, {}, 3, 4].
// Waiting:Your solution should not use the Array.prototype.flat() or Array.prototype.flatMap() methods.
// Waiting:Global variables should not be used.

function steamrollArray(arr) {
    let result = [];

    function flatten(element) {
        if (Array.isArray(element)) {
            for (let i = 0; i < element.length; i++) {
                flatten(element[i]);
            }
        } else {
            result.push(element);
        }
    }

    arr.forEach(flatten);
    return result;
}

// Example usage:
console.log(steamrollArray([[["a"]], [["b"]]])); // Output: ["a", "b"]
console.log(steamrollArray([1, [2], [3, [[4]]]])); // Output: [1, 2, 3, 4]
console.log(steamrollArray([1, [], [3, [[4]]]])); // Output: [1, 3, 4]
console.log(steamrollArray([1, {}, [3, [[4]]]])); // Output: [1, {}, 3, 4]
