/**
 * Creates a counter module with an initial value, zero if not provided
 */
exports.createCounter = function (initialValue = 0) {
    let value = initialValue;

    return {
        get: function () {
            return value;
        },
        increment: function () {
            value++;
        },
        reset: function () {
            value = 0;
        }
    };
};

/**
 * Creates a person module with name and age
 * An initial name value should be provided and
 * an exception thrown if not
 */
exports.createPerson = function (name) {
    if (!name || typeof name !== 'string' || name.trim() === '') {
        throw new Error('Name must be provided and cannot be empty.');
    }

    let personName = name;
    let personAge = 0;

    return {
        getName: function () {
            return personName;
        },
        getAge: function () {
            return personAge;
        },
        setAge: function (age) {
            if (typeof age === 'number' && age >= 0) {
                personAge = age;
            }
        }
    };
};
