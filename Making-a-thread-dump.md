Sometimes (due to some bug) DBeaver UI hangs, freezes or works incorrectly. Usually it is impossible to find the reason of such problem without thread dump. Thread dump is the information about internal execution state of Java program. To get thread dump:

#### Mac and Linux
Run the following on your terminal:
```
jstack $(ps aux | grep -m1 dbeaver | awk '{print $2}') > thread-dump.txt
```
#### Windows
Just open task manager (CTRL+Escape), find DBeaver in the process list and copy process ID value. On Windows 8+ you need to switch to "Details" tab.
Run
```
jstack <PID> > thead-dump.txt
```
in Command Prompt.

Now you can attach thread-dump.txt to the GitHub issue.