// Fill in the object constructor with the following methods below:

// getFirstName()
// getLastName()
// getFullName()
// setFirstName(first)
// setLastName(last)
// setFullName(first, last)
// Run the tests to see the expected output for each method. These methods must be the only available means of interacting with the object. Each test will declare a new Person instance as new Person('Bob', 'Ross').

// Get Help
// Tests
// Passed:You should not change the function signature.
// Passed:You should not reassign the first parameter.
// Passed:You should not reassign the last parameter.
// Passed:No properties should be added. Object.keys(Person).length should always return 6.
// Passed:You should be able to instantiate your Person object.
// Passed:Your Person object should not have a firstName property.
// Passed:Your Person object should not have a lastName property.
// Passed:The .getFirstName() method should return the string Bob.
// Passed:The .getLastName() should return the string Ross.
// Passed:The .getFullName() method should return the string Bob Ross.
// Passed:The .getFullName() method should return the string Haskell Ross after calling .setFirstName('Haskell').
// Passed:The .getFullName() method should return the string Bob Curry after calling .setLastName('Curry').
// Passed:The .getFullName() method should return the string Haskell Curry after calling .setFullName('Haskell', 'Curry').
// Passed:The .getFirstName() method should return the string Haskell after calling .setFullName('Haskell', 'Curry').
// Passed:The .getLastName() method should return the string Curry after calling .setFullName('Haskell', 'Curry').
// Passed:The .getFullName() method should return the string Emily Martinez de la Rosa after calling .setFullName('Emily Martinez', 'de la Rosa').
// Passed:The .getFirstName() property should return the string Emily Martinez after calling .setFullName('Emily Martinez', 'de la Rosa').
// Passed:The .getLastName() property should return the string de la Rosa after calling .setFullName('Emily Martinez', 'de la Rosa').

const Person = function (first, last) {
    // Private variables to store first and last names
    let firstName = first;
    let lastName = last;

    // Public methods to access and modify names
    this.getFirstName = function () {
        return firstName;
    }

    this.getLastName = function () {
        return lastName;
    }

    this.getFullName = function () {
        return `${firstName} ${lastName}`;
    };

    this.setFirstName = function (newfirst) {
        firstName = newfirst;
    }

    this.setLastName = function (newlast) {
        lastName = newlast;
    }

    this.setFullName = function (newfirst, newlast) {
        firstName = newfirst;
        lastName = newlast;
    }
    return "";
};