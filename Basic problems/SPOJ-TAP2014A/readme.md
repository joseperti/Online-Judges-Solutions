<div style="text-align: justify">
Current version: <b><span style="color: green">Accepted</span></b><br>
<h2>Problem: SPOJ TAP2014A</h2>
<br>
<h3>Statement</h3>
TAP2014A - At random<br><br>
There are many and very different card games, their origin going back to ancestral times. Sometimes it can be surprising that they continue to provide entertainment after so many centuries of being played with the same rules, but then we should remember that each game is essentially different from all the other ones played in the history of humankind, given the huge amount of possible ways to order the cards before the beginning of each game. Indeed, few games are any fun if we always use the cards in the same order, or if there is a correlation between successive cards that allows us to guess the order in which they will appear. This is the reason why it is customary to shuffle the cards before starting each game, and for this same reason we ask you to make a program to check that a sequence of cards has been properly shuffled.
<br><br>
To simplify the problem, we will concentrate only on decks of Spanish cards, which consist of 48 different playing cards. Each card is identified by a value, which is a number from 1 to 12, and a suit, which can be "clubs", "cups", "golds" or "swords".  However, because we don't want to excessively simplify your task, we will take into account that not all games use all 48 cards of the deck. Given a sequence of N cards, we say it has been properly shuffled if there are no two successive cards sharing the same value or suit. Otherwise, we say the deck has not been properly shuffled. Can you help us decide if a given sequence has been properly shuffled?<br><br>
<b>Input</b><br>
The first line contains an integer number T, the number of test cases (1 ≤ T ≤ 200). T test cases follow.
<br><br>
The first line of each test case contains an integer N, representing the number of cards that are used in the game we are considering (2 ≤ N ≤ 48). Each of the following N lines contains the description of a card in the sequence we want to analyze, given by an integer V representing its value (1 ≤ V ≤ 12) and a character P representing its suit: 'b' for clubs, 'c' for cups, 'o' for golds and 'e' for swords. All the cards in the input are different, and they are given in the input in the same order they appear in the sequence.
<br><br>
<b>Output</b><br>
For each test case, print a single line containing a character indicating if the sequence of cards given in the input has been properly shuffled or not. The character should be a 'B' if it has been properly shuffled, and an 'M' otherwise.<br><br>

<b>Sample Input</b>
<br><br>
<div style="margin-left: 10px;">
4<br>
4<br>
1 b<br>
2 c<br>
3 e<br>
4 o<br>
3<br>
1 b<br>
2 b<br>
3 c<br>
3<br>
1 b<br>
1 c<br>
2 e<br>
32<br>
5 c<br>
2 b<br>
4 e<br>
3 o<br>
12 b<br>
1 c<br>
7 e<br>
6 c<br>
12 e<br>
4 o<br>
1 b<br>
6 o<br>
3 e<br>
12 o<br>
11 e<br>
12 c<br>
5 o<br>
10 b<br>
9 o<br>
3 c<br>
4 b<br>
11 c<br>
8 e<br>
9 c<br>
1 e<br>
4 c<br>
8 b<br>
2 o<br>
6 b<br>
9 e<br>
7 b<br>
5 e<br>
</div>
<br>
<b>Output for Sample Input</b><br><br>
<div style="margin-left: 10px;">
B<br>
M<br>
M<br>
B<br>
</div>
<br>
<a href="http://www.spoj.com/problems/TAP2014A/">Link</a>
</div>