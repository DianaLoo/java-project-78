### Hexlet tests and linter status:
[![Actions Status](https://github.com/DianaLoo/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/DianaLoo/java-project-78/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/74a4f9955ede974f4397/maintainability)](https://codeclimate.com/github/DianaLoo/java-project-78/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/74a4f9955ede974f4397/test_coverage)](https://codeclimate.com/github/DianaLoo/java-project-78/test_coverage)

Validator
Performs data verification using a previously created schema.

To use the validator, you need to create an object for this program.
var v = new Validator();
After that, you need to create and configure a data validation scheme that will contain validation rules. A schema is an object that contains rules and restrictions for data.
The validation scheme can be configured using various methods.

The string() method call is used to validate string data.
A set of methods:

required() — makes the data mandatory. In other words, it adds a restriction to the schema that prevents the use of null or an empty string as a value.
minLength() — adds a minimum length limit for a string to the schema. The string must be equal to or longer than the specified number
contains() — adds a restriction on the contents of the string to the schema. The string must contain a specific substring

The number() method is used to validate numbers.
A set of methods:

required() — adds a restriction to the scheme that prevents the use of null as a value
positive() — adds a restriction on the sign of the number. The number must be positive
range() — adds a valid range to which the value of the number should fall, including the boundaries.

The map() method is used to validate Map type objects.
A set of methods:

required() — adds a constraint to the schema that does not allow null to be used as a value. Requires the Map
sizeof() data type — adds a limit on the size of the map. The number of key-value pairs in the Map object must be equal to the specified value.

After the validation scheme has been set up, you can start verifying the data. To do this, call the isValid() method on the configured schema and pass it the data that needs to be validated. The result will be a boolean value of true if the data conforms to all the rules specified in the schema, or false if it does not.
