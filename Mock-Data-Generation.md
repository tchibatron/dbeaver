Sometimes in software development we need to generate mock but valid data for the testing. Filling in the database by hand is a time-consuming and exhausting process. It can be very complicated when you need to generate not just 5–10 users, but thousands entities of different types. DBeaver Mock Data generator helps you generate test data much easier. 

> _Disclaimer:_ Mock data idea is to generate fake data in the table and it is **NOT TO BE USED IN PRODUCTION ENVIRONMENTS**. Please ensure you have a backup of your database before running the Mock Data generation process.

DBeaver Mock Data generator features:
* works for all the RDBMS are supported by DBeaver (DB2, MS SQL Server, MySQL, Oracle, PostgreSQL, SQLite etc)
* generation of data that matches to your database schema
** generated data are matched the database column types
** all base data types are supported
** constraints (PK, FK, unique) support
* over 20 configurable data generators (random, sequences, names, domains, addresses, prices, regex based etc)
* old database data can be saved or rewritten

Mock data generators for data types with their configurable parameters:
* Boolean
    * Random
    * Sequence (initial, order)
* Date
    * Random (start, end)
    * Sequence (start, step, reverse)
* Numeric
    * Random
    * Sequence (start, step, reverse)
    * Advanced (min, max, precision, scale) <sup>*</sup>
        * Price preset <sup>*</sup>
        * Coordinate preset <sup>*</sup>
* String
    * Text (template, min length, max length)
    * UUID
    * Address <sup>*</sup>
    * City <sup>*</sup>
    * Country <sup>*</sup>
    * Domain <sup>*</sup>
    * Email (gender, with surname, numeric suffix) <sup>*</sup>
    * Name (gender, with surname) <sup>*</sup>
    * Price (country, min, max) <sup>*</sup>
    * Regex based random (regex template) <sup>*</sup>
        * Credit Card preset <sup>*</sup>
        * Email preset <sup>*</sup>
        * Gender preset <sup>*</sup>
        * HEX Color preset <sup>*</sup>
        * IP4 address preset <sup>*</sup>
        * IP6 address preset <sup>*</sup>
        * Phone Number preset <sup>*</sup>
        * Postal Code preset <sup>*</sup>
        * Price preset <sup>*</sup>
* NULL values
* FK - data from the related table according to the constraint


***
<sup>*</sup> These features are available i the DBeaver Enterprise Edition only.