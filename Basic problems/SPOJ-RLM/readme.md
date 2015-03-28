<div style="text-align: justify">
Current version: <b><span style="color: green">Accepted</span></b><br>
<h2>Problem: SPOJ RLM</h2>
<br>
<h3>Statement</h3>
RLM - Run-Length Mathematics<br><br>
Run-length encoding of a number replaces a run of digits (that is, a sequence of consecutive equivalent digits) with the number of digits followed by the digit itself. For example, 44455 would become 3425 (three fours, two fives). Note that run-length encoding does not necessarily shorten the length of the data: 11 becomes 21, and 42 becomes 1412. If a number has more than nine consecutive digits of the same type, the encoding is done greedily: each run grabs as many digits as it can, so 111111111111111 is encoded as 9161.<br><br>

Implement an integer arithmetic calculator that takes operands and gives results in run-length format. You should support addition, subtraction, multiplication, and division. You won't have to divide by zero or deal with negative numbers.
<br><br>
<b>Input/Output</b><br><br>

The input will consist of several test cases, one per line. For each test case, compute the run-length mathematics expression and output the original expression and the result, as shown in the examples. The (decimal) representation of all operands and results will fit in signed 64-bit integers.<br><br>

<b>Sample Input</b>
<br><br>
<div style="margin-left: 10px;">
11 + 11<br>
988726 - 978625<br>
12 * 41<br>
1124 / 1112<br>
13 * 33<br>
15 / 16<br>
</div>
<br>
<b>Output for Sample Input</b><br><br>
<div style="margin-left: 10px;">
11 + 11 = 12<br>
988726 - 978625 = 919111<br>
12 * 41 = 42<br>
1124 / 1112 = 1112<br>
13 * 33 = 39<br>
15 / 16 = 10<br>
</div>
<br>
<a href="http://www.spoj.com/problems/RLM/">Link</a>
</div>