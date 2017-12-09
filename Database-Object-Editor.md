The metadata editor is available for multiple database objects such as tables, views and schemas. To open the metadata editor for an object, in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator) or in the [Projects](https://github.com/serge-rider/dbeaver/wiki/Projects) view:
* Double-click the database object
* Click the database object and press <kbd>Enter</kbd> or <kbd>F4</kbd>

The editor has three tabs:
* [Properties](https://github.com/serge-rider/dbeaver/wiki/Properties) tab - appears for all objects, contains properties of the database object and its sub-entities
* **Data** tab appears for tables and views and represents a [Data Editor](https://github.com/serge-rider/dbeaver/wiki/Data-Editor)
* [ER Diagram](https://github.com/serge-rider/dbeaver/wiki/ER-Diagram) tab - appears for tables and schemas

The tabs have the following common parts:

<img src="https://www.dropbox.com/s/jt5icc117393bg2/DB%20Object%20edito%20with%20markup.png?raw=1"/>

The object`s path shows the chain of all its parent entities. The entities are clickable: clicking an entity in the path, depending on its nature, either shows its children or opens an editor or a settings window.

The toolbar contains different tools on each of the three tabs.

An asterisk appears in the title of an editor if it contains unsaved changes:

<img src="https://www.dropbox.com/s/deojn9xj28njz4a/Asterisk.png?raw=1"/>

The Database Object editor supports the Ctrl+Z (undo) function.