DBeaver supports following commands:

| Command | Database | Description |
-----------|-------------|-------------|
@set&nbsp;var&nbsp;=&nbsp;value | All | Sets script variable. You can use expressions as value. Variables can be used as SQL queries input parameters
@echo&nbsp;message | All | Prints message to output log. You can use macro in message (e.g. ${var})
@include&nbsp;fileName | All | Executes specified file name. Can be used in scripts. Opens new SQL console withy specified file and processes SQL queries as in regular SQL editor.
source&nbsp;fileName | MySQL | The same as @include but in MySQL cli syntax
define&nbsp;var&nbsp;=&nbsp;value | Exasol | The same as @set but in Exasol EXAPlus syntax.

