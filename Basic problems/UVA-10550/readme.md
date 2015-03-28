<div style="text-align: justify">
Currently version: <b><span style="color: green">Accepted Message</span></b><br>
<h2>Problem: UVA 10550</h2>
<br>
<h3>Statement</h3>
10550 - Problem B: Combination Lock<br><br>

Now that you're back to school for another term, you need to remember how to work the combination lock on your locker. A common design is that of the Master Brand, shown at right. The lock has a dial with 40 calibration marks numbered 0 to 39. A combination consists of 3 of these numbers; for example: 15-25-8. To open the lock, the following steps are taken:<br><br>
<div style="margin: 10px">
	·turn the dial clockwise 2 full turns<br>
	·stop at the first number of the combination<br>
	·turn the dial counter-clockwise 1 full turn<br>
	·continue turning counter-clockwise until the 2nd number is reached<br>
	·turn the dial clockwise again until the 3rd number is reached<br>
	·pull the shank and the lock will open. <br><br>
</div>
Given the initial position of the dial and the combination for the lock, how many degrees is the dial rotated in total (clockwise plus counter-clockwise) in opening the lock?<br><br>

Input consists of several test cases. For each case there is a line of input containing 4 numbers between 0 and 39. The first number is the position of the dial. The next three numbers are the combination. Consecutive numbers in the combination will be distinct. A line containing 0 0 0 0 follows the last case.


For each case, print a line with a single integer: the number of degrees that the dial must be turned to open the lock.<br><br>
<b>Sample Input</b>
<br><br>
<div style="margin-left: 10px;">
0 30 0 30<br>
5 35 5 35<br>
0 20 0 20<br>
7 27 7 27<br>
0 10 0 10<br>
9 19 9 19<br>
0 0 0 0<br>
</div>
<br><br>
<b>Output for Sample Input</b><br><br>
<div style="margin-left: 10px;">
1350<br>
1350<br>
1620<br>
1620<br>
1890<br>
1890<br><br>
</div>
G. V. Cormack<br>
<br>
<a href="http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1491">Link</a>
</div>