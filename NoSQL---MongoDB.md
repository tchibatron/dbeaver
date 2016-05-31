### Browsing Mongo collections
You can view/edit Mongo collections content as standard relational tables (grid/plain text presentations) or as JSON documents.
Presentation can be switched in the Results Viewer toolbar.
In grid DBeaver will try to unify all documents in some particular collection (as they have the same structure/the same set of properties).

### Executing JS
JS statements can be executed in SQL editor as usual.
Following example creates a user in the current database.
```js
db.createUser(
{ user: "testuser",
  pwd: "test",
  roles: []
}
)
```
This example returns all documents in collection 'test_col':
```js
db.test_col.find().toArray()
```
### Executing SQL