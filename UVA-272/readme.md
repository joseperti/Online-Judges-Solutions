<div class="align-justify">
Currently version: <b>Accepted Message</b><br>
<h2>Problem: UVA 272</h2>
<br>
<h3>Statement</h3><br>
272 - TEX Quotes<br>
<p>
 TeX is a typesetting language developed by Donald Knuth. It takes source text together with a few typesetting instructions and produces, one hopes, a beautiful document. Beautiful documents use `` and " to delimit quotations, rather than the mundane " which is what is provided by most keyboards. Keyboards typically do not have an oriented double-quote, but they do have a left-single-quote ` and a right-single-quote '. Check your keyboard now to locate the left-single-quote key ` (sometimes called the ``backquote key") and the right-single-quote key ' (sometimes called the ``apostrophe" or just ``quote"). Be careful not to confuse the left-single-quote ` with the ``backslash" key \. TeX lets the user type two left-single-quotes `` to create a left-double-quote `` and two right-single-quotes '' to create a right-double-quote ''. Most typists, however, are accustomed to delimiting their quotations with the un-oriented double-quote ".<br>

If the source contained<br>

"To be or not to be," quoth the bard, "that is the question."<br>

then the typeset document produced by TeX would not contain the desired form:<br>

``To be or not to be," quoth the bard, ``that is the question."<br>

In order to produce the desired form, the source file must contain the sequence:<br>

``To be or not to be,'' quoth the bard, ``that is the question.''<br><br>

You are to write a program which converts text containing double-quote (") characters into text that is identical except that double-quotes have been replaced by the two-character sequences required by TeX for delimiting quotations with oriented double-quotes. The double-quote (") characters should be replaced appropriately by either `` if the " opens a quotation and by '' if the " closes a quotation. Notice that the question of nested quotations does not arise: The first " must be replaced by ``, the next by '', the next by ``, the next by '', the next by ``, the next by '', and so on.<br><br>

Input and Output<br>

Input will consist of several lines of text containing an even number of double-quote (") characters. Input is ended with an end-of-file character. The text must be output exactly as it was input except that:<br><br>

    the first " in each pair is replaced by two ` characters: `` and<br>
    the second " in each pair is replaced by two ' characters: ''. <br><br>

Sample Input<br>

"To be or not to be," quoth the Bard, "that<br>
is the question".<br>
The programming contestant replied: "I must disagree.<br>
To `C' or not to `C', that is The Question!"<br><br>

Sample Output<br>

``To be or not to be,'' quoth the Bard, ``that<br>
is the question''.<br>
The programming contestant replied: ``I must disagree.<br>
To `C' or not to `C', that is The Question!''<br>

<br>
<a href="http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208">Link</a>
</div>