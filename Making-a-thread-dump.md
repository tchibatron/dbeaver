Sometimes (due to some bug) DBeaver UI hangs, freezes or works incorrectly.
Usually it is impossible to find the reason of such problem without thread dump.
Thread dump is the information about internal execution state of Java program.
To get thread dump:

- Find DBeaver PID (process ID). 
  - On Linux\Mac you can open terminal window and run something like `ps auxf | grep dbeaver` and copy number from the first column.
  - On Windows just open task manager (CTRL+Escape), find DBeaver in the process list and copy process ID value. On Windows 8+ you need to switch to "Details" tab.
- Run `jstack <PID> > thead-dump.txt`
- Attach thread-dump.txt to GitHub issue.