In the Query Manager view you can see all SQL queries DBeaver executes.

DBeaver logs every query you execute. You can see all previously executed queries in the special view “Query Manager”. You can open it through main menu “Window->Show View”.

You can see query execution statistics (execution time, number of fetched/updated rows, errors, etc).

EE version persists all executed queries in the internal database so execution history is available after program restart.

By default QM shows only queries explicitly executed by user (in [[SQL editor]] or in [[Data Editor]]). 
You can configure logs visibility, monitor metadata reading queries, utility SQL, etc. QM configuration available in global preferences. 