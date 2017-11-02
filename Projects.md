# Projects

You might need to classify and group database connections into projects.  Projects store objects related not to a particular database but to all database connections. These are usually files stored on the file system.

The Projects view displays all projects created in the system and provides tools to manage them. To open the Projects view, on the **Window** menu, click **Projects** (or use ALT+W+P shortcut).

<img src="https://www.dropbox.com/s/v51mrexzl4a561z/Projects%20view.png?raw=1"/>

## Filtering objects

Each database section  has an option to filter in or out specific objects. You can filter schemas, tables, views and procedures. The name of the section changes to include `(...)` marker if the filter is currently enabled.

To quickly filter out specific tables select them and use the option _Filter N objects_:

When defining the names of the objects to filter you can use SQL glob-like chars `%` and `_`.
