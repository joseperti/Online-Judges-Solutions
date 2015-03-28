<div style="text-align: justify">
Current version: <b><span style="color: green">Accepted</span></b><br>
<h2>Problem: SPOJ SBANK</h2>
<br>
<h3>Statement</h3>
SBANK - Sorting Bank Accounts<br><br>
 In one of the internet banks thousands of operations are being performed every day. Since certain customers do business more actively than others, some of the bank accounts occur many times in the list of operations. Your task is to sort the bank account numbers in ascending order. If an account appears twice or more in the list, write the number of repetitions just after the account number. The format of accounts is as follows: 2 control digits, an 8-digit code of the bank, 16 digits identifying the owner (written in groups of four digits), for example (at the end of each line there is exactly one space):<br><br><center>
30 10103538 2222 1233 6160 0142 
</center>
<br>
Banks are real-time institutions and they need FAST solutions. If you feel you can meet the challenge within a very stringent time limit, go ahead! A well designed sorting algorithm in a fast language is likely to succeed. <br><br>
<b>Input</b><br>
t [the number of tests <= 5]<br>
n [the number of accounts<= 100 000]<br>
[list of accounts]<br>
[empty line]<br>
[next test cases] <br><br>
<b>Output</b><br>

[sorted list of accounts with the number of repeated accounts]<br>
[empty line]<br>
[other results] <br><br>

<b>Sample Input</b>
<br><br>
<div style="margin-left: 10px;">
2<br>
6<br>
03 10103538 2222 1233 6160 0142 <br>
03 10103538 2222 1233 6160 0141 <br>
30 10103538 2222 1233 6160 0141 <br>
30 10103538 2222 1233 6160 0142 <br>
30 10103538 2222 1233 6160 0141 <br>
30 10103538 2222 1233 6160 0142 <br>
<br>
5<br>
30 10103538 2222 1233 6160 0144 <br>
30 10103538 2222 1233 6160 0142 <br>
30 10103538 2222 1233 6160 0145 <br>
30 10103538 2222 1233 6160 0146 <br>
30 10103538 2222 1233 6160 0143 <br>
</div>
<br><br>
<b>Output for Sample Input</b><br><br>
<div style="margin-left: 10px;">
03 10103538 2222 1233 6160 0141 1<br>
03 10103538 2222 1233 6160 0142 1<br>
30 10103538 2222 1233 6160 0141 2<br>
30 10103538 2222 1233 6160 0142 2<br>
<br>
30 10103538 2222 1233 6160 0142 1<br>
30 10103538 2222 1233 6160 0143 1<br>
30 10103538 2222 1233 6160 0144 1<br>
30 10103538 2222 1233 6160 0145 1<br>
30 10103538 2222 1233 6160 0146 1<br>
</div>
<br>
<a href="http://www.spoj.com/problems/SBANK/">Link</a>
</div>